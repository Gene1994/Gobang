import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Wuziqi {
	
	private static int Flag = 0;//0空白，1白子，-1黑子
	
	int x,y;//行、列
	
	List<int[]> list_white = new ArrayList<int[]>();
	List<int[]> list_black = new ArrayList<int[]>();
	
	ImageIcon black = new ImageIcon("D:\\Java workspace\\Wuziqi\\res\\black.jpg");
	ImageIcon white = new ImageIcon("D:\\Java workspace\\Wuziqi\\res\\white.jpg");
	
	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wuziqi window = new Wuziqi();
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
	public Wuziqi() {
		initialize();
	}
	
	//检查水平
	private boolean check_horizontal(List<int[]> list){
		int index = 0;
		if(list.size() > 4){
			for(int i = 0; i < list.size()-4; i++){
				for (int j = 0; j < 4; j++){
					int[] node = list.get(i+j); 
					int[] node_next = list.get(i+j+1);
					if(node[0] == node_next[0]+1 && node[1] == node_next[1]){
						index += 1;
					}else{
						index = 0;
					}
					if(index == 4){
						return true;
					}else{
						return false;
					}
				}
			}
		}
		return false;
	}
	
	//检查垂直
	private boolean check_vertical(List<int[]> list){
		if(list.size() > 4){
			int index = 0;
			for(int i = 0; i < list.size()-4; i++){
				int[] node = list.get(i); 
				for (int j = 0; j < list.size()-4-i; j++){
					int[] node_next = list.get(i+j);
					if((node[0] == node_next[0] && node[1] == node_next[1]+1) ||(node[0] == node_next[0] && node[1] == node_next[1]+2) || (node[0] == node_next[0] && node[1] == node_next[1]+3) || (node[0] == node_next[0] && node[1] == node_next[1]+4)){
						index += 1;
					}
				}
				if(index == 4){
					return true;
				}else{
					index = 0;
					return false;
				}
			}
		}
		return false;
	}
	
	//检查对角线方向
	private boolean check_diagonal(List<int[]> list){
		if(list.size() > 4){
			int index = 0;
			for(int i = 0; i < list.size()-4; i++){
				int[] node = list.get(i); 
				for (int j = 0; j < list.size()-4-i; j++){
					int[] node_next = list.get(i+j);
					if((node[0] == node_next[0]+1 && node[1] == node_next[1]+1) ||(node[0] == node_next[0]+2 && node[1] == node_next[1]+2) || (node[0] == node_next[0]+3 && node[1] == node_next[1]+3) || (node[0] == node_next[0]+4 && node[1] == node_next[1]+4)){
						index += 1;
					}
				}
				if(index == 4){
					return true;
				}else{
					index = 0;
					return false;
				}
			}
		}
		return false;
	}
	//检查是否形成五子
	public boolean check(List<int[]> list){
		if(check_horizontal(list) || check_vertical(list) || check_diagonal(list)){
			System.out.println("Game Over!");
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
		frame.setBounds(100, 100, 441, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 15, 0, 0));
		
		for (int i = 1; i <= 225; i++){
			JButton btn = new JButton("");
			btn.setName(i+"");
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btn.setPreferredSize(new Dimension(20, 20));
			
			panel.add(btn);
			btn.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					System.out.println(btn.getName());
					//click事件：改变button的icon，new一个五子棋
					if(Flag == 1){//如果之前是白子
						btn.setIcon(black);
						Wuziqi w = new Wuziqi();
						Flag = -1;
						w.x = Integer.parseInt(btn.getName()) % 15;
						w.y = (Integer.parseInt(btn.getName())-1) / 15 + 1;
						int[] i = {w.x, w.y};
						list_black.add(i);
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
						check(list_black);
					}else if(Flag == -1){//如果之前是黑子
						btn.setIcon(white);
						Wuziqi w = new Wuziqi();
						Flag = 1;
						w.x = Integer.parseInt(btn.getName()) % 15;
						w.y = (Integer.parseInt(btn.getName())-1) / 15 + 1;
						int[] i = {w.x, w.y};
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
						check(list_white);
					}else{//黑子先
						btn.setIcon(black);
						Wuziqi w = new Wuziqi();
						Flag = -1;
						w.x = Integer.parseInt(btn.getName()) % 15;
						w.y = (Integer.parseInt(btn.getName())-1) / 15 + 1;
						int[] i = {w.x, w.y};
						list_black.add(i);
					}
				}
			});
		}
	}
}
