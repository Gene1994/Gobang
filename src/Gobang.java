/**
 * @author Gene1994
 * 
 *
 * ${tags}
 */

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.awt.GridLayout;
import javax.swing.JOptionPane;
import java.awt.Toolkit;

public class Gobang{
	
	private static int Flag = 0;//0空白，1白子，-1黑子
	private static int Game = 0;//Game == 1时，游戏结束

	int x,y;//行、列
	
	List<int[]> list_white = new ArrayList<int[]>();
	List<int[]> list_black = new ArrayList<int[]>();
	
	ImageIcon black = new ImageIcon("..\\Gobang\\res\\black.jpg");
	ImageIcon white = new ImageIcon("..\\Gobang\\res\\white.jpg");
	
	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gobang window = new Gobang();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gobang() {
		initialize();
	}
	
	//检查水平
	private boolean check_horizontal(List<int[]> list){
		if(list.size() > 4){
			for(int i = 0; i < list.size() - 4; i++){
				int index = 0;
				int[] node = list.get(i);
				for (int j = 0; j < list.size()-i-1; j++){
					int[] node_next = list.get(i+j+1);
					if((node[0]+1 == node_next[0] && node[1] == node_next[1]) ||(node[0]+2 == node_next[0] && node[1] == node_next[1]) || (node[0]+3 == node_next[0] && node[1] == node_next[1]) || (node[0]+4 == node_next[0] && node[1] == node_next[1])){
						index += 1;
					}
					//连成五子
					if(index == 4){
						Game = 1;
					}
				}
				if(Game == 1){
					return true;
				}
			}	
		}
		return false;
	}
	
	//检查垂直
	private boolean check_vertical(List<int[]> list){
		if(list.size() > 4){
			for(int i = 0; i < list.size() - 4; i++){
				int index = 0;
				int[] node = list.get(i);
				for (int j = 0; j < list.size()-i-1; j++){
					int[] node_next = list.get(i+j+1);
					if((node[0] == node_next[0] && node[1]+1 == node_next[1]) ||(node[0] == node_next[0] && node[1]+2 == node_next[1]) || (node[0] == node_next[0] && node[1]+3 == node_next[1]) || (node[0] == node_next[0] && node[1]+4 == node_next[1])){
						index += 1;
					}
					//连成五子
					if(index == 4){
						Game = 1;
					}
				}
				if(Game == 1){
					return true;
				}
			}	
		}
		return false;
	}
	
	//检查右下方向
	private boolean check_lowerRight(List<int[]> list){
		if(list.size() > 4){
			for(int i = 0; i < list.size() - 4; i++){
				int index = 0;
				int[] node = list.get(i);
				for (int j = 0; j < list.size()-i-1; j++){
					int[] node_next = list.get(i+j+1);
					if((node[0]+1 == node_next[0] && node[1]+1 == node_next[1]) ||(node[0]+2 == node_next[0] && node[1]+2 == node_next[1]) || (node[0]+3 == node_next[0] && node[1]+3 == node_next[1]) || (node[0]+4 == node_next[0] && node[1]+4 == node_next[1])){
						index += 1;
					}
					if(index == 4){
						Game = 1;
					}
				}
				if(Game == 1){
					return true;
				}
			}	
		}
		return false;
	}
	
	//检查左下方向
	private boolean check_lowerLeft(List<int[]> list){
		if(list.size() > 4){
			for(int i = 0; i < list.size() - 4; i++){
				int index = 0;
				int[] node = list.get(i);
				for (int j = 0; j < list.size()-i-1; j++){
					int[] node_next = list.get(i+j+1);
					if((node[0]-1 == node_next[0] && node[1]+1 == node_next[1]) ||(node[0]-2 == node_next[0] && node[1]+2 == node_next[1]) || (node[0]-3 == node_next[0] && node[1]+3 == node_next[1]) || (node[0] == node_next[0]-4 && node[1]+4 == node_next[1])){
						index += 1;
					}
					if(index == 4){
						Game = 1;
					}
				}
				if(Game == 1){
					return true;
				}
			}	
		}
		return false;
	}

	//检查是否形成五子
	public boolean check(List<int[]> list){
		if(check_horizontal(list) || check_vertical(list) || check_lowerRight(list) || check_lowerLeft(list)){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(){
		black.setImage(black.getImage().getScaledInstance(20, 20, -1));
		white.setImage(white.getImage().getScaledInstance(20, 20, -1));
		frame = new JFrame();
		frame.setTitle("\u4E94\u5B50\u68CB");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("..\\Gobang\\res\\icon.jpg"));
		frame.setBounds(100, 100, 441, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 15, 0, 0));
		
		//建立15*15棋盘
		for(int i = 1; i <= 225; i++){
			JButton btn = new JButton();
			btn.setName(i+"");
			btn.setPreferredSize(new Dimension(20, 20));
			panel.add(btn);
			
//			btn.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//				}
//			});
			btn.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					//click事件：改变button的icon，new一个五子棋
					if(Flag == 1 && btn.getIcon() == null){//如果之前是白子
						btn.setIcon(black);
						Gobang goBang = new Gobang();
						Flag = -1;
						//如果不是在最右侧，取15的余数作为x洲坐标，在最右边取15位x轴坐标
						if(Integer.parseInt(btn.getName()) % 15 != 0){
							goBang.x = Integer.parseInt(btn.getName()) % 15;
						}else{
							goBang.x = 15;
						}
						//除以15后+1作为y轴坐标
						goBang.y = (Integer.parseInt(btn.getName())-1) / 15 + 1;
						int[] i = new int[2];
						i[0] = goBang.x;
						i[1] = goBang.y;
						list_black.add(i);
						
						//检查过程，先将list_black排序，然后调用check(list_black)方法
						Collections.sort(list_black, new Comparator<int[]>(){
							@Override
							public int compare(int[] arg0, int[] arg1) {
								// TODO Auto-generated method stub
								if(arg0[1] > arg1[1]){
									return 1;
								}else if (arg0[1] < arg1[1]){
									return -1;
								}else if (arg0[0] > arg1[0]){
									return 1;
								}else{
									return -1;
								}
							}
						});
						if(check(list_black)){
							JOptionPane.showMessageDialog(null, "黑子获胜！");
							frame.setVisible(false);
						}
					}else if(Flag == -1 && btn.getIcon() == null){//如果之前是黑子
						btn.setIcon(white);
						Gobang goBang = new Gobang();
						Flag = 1;
						if(Integer.parseInt(btn.getName()) % 15 != 0){
							goBang.x = Integer.parseInt(btn.getName()) % 15;
						}else{
							goBang.x = 15;
						}
						goBang.y = (Integer.parseInt(btn.getName())-1) / 15 + 1;
						int[] i = new int[2];
						i[0] = goBang.x;
						i[1] = goBang.y;
						list_white.add(i);
						
						Collections.sort(list_white, new Comparator<int[]>(){
							@Override
							public int compare(int[] arg0, int[] arg1) {
								// TODO Auto-generated method stub
								if(arg0[1] > arg1[1]){
									return 1;
								}else if (arg0[1] < arg1[1]){
									return -1;
								}else if (arg0[0] > arg1[0]){
									return 1;
								}else{
									return -1;
								}
							}
						});
						if(check(list_white)){
							JOptionPane.showMessageDialog(null, "白子获胜！");
							frame.setVisible(false);
						}
					}else if (btn.getIcon() == null){//空白，Flag = 0，黑子先
						btn.setIcon(black);
						Gobang goBang = new Gobang();
						Flag = -1;
						if(Integer.parseInt(btn.getName()) % 15 != 0){
							goBang.x = Integer.parseInt(btn.getName()) % 15;
						}else{
							goBang.x = 15;
						}
						goBang.y = (Integer.parseInt(btn.getName())-1) / 15 + 1;
						int[] i = new int[2];
						i[0] = goBang.x;
						i[1] = goBang.y;
						list_black.add(i);
					}else{}
				}
			});
			while(btn.getIcon() != null){
				btn.setEnabled(false);
			}
		}
	}
}
