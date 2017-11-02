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
	
	private static int Flag = 0;//0�հף�1���ӣ�-1����
	private static int Game = 0;//Game == 1ʱ����Ϸ����

	int x,y;//�С���
	
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
	
	//���ˮƽ
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
					//��������
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
	
	//��鴹ֱ
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
					//��������
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
	
	//������·���
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
	
	//������·���
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

	//����Ƿ��γ�����
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
		
		//����15*15����
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
					//click�¼����ı�button��icon��newһ��������
					if(Flag == 1 && btn.getIcon() == null){//���֮ǰ�ǰ���
						btn.setIcon(black);
						Gobang goBang = new Gobang();
						Flag = -1;
						//������������Ҳ࣬ȡ15��������Ϊx�����꣬�����ұ�ȡ15λx������
						if(Integer.parseInt(btn.getName()) % 15 != 0){
							goBang.x = Integer.parseInt(btn.getName()) % 15;
						}else{
							goBang.x = 15;
						}
						//����15��+1��Ϊy������
						goBang.y = (Integer.parseInt(btn.getName())-1) / 15 + 1;
						int[] i = new int[2];
						i[0] = goBang.x;
						i[1] = goBang.y;
						list_black.add(i);
						
						//�����̣��Ƚ�list_black����Ȼ�����check(list_black)����
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
							JOptionPane.showMessageDialog(null, "���ӻ�ʤ��");
							frame.setVisible(false);
						}
					}else if(Flag == -1 && btn.getIcon() == null){//���֮ǰ�Ǻ���
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
							JOptionPane.showMessageDialog(null, "���ӻ�ʤ��");
							frame.setVisible(false);
						}
					}else if (btn.getIcon() == null){//�հף�Flag = 0��������
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
