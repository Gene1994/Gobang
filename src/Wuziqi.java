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
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Wuziqi {
	
	private static int Flag = 0;//0空白，1白子，-1黑子
	
	int x,y;//行、列
	
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
	
	//检查是否形成五子
	public boolean check(JButton button){
		Wuziqi ui = new Wuziqi();
		return false;
		
	}
	
	//将JButton设置成五子棋
	Wuziqi setWuziqi(JButton btn){
		
		if(Flag == 1){//如果之前是白子
			
		}else if(Flag == -1){//如果之前是黑子
			
		}else{//黑子先
			
		}
		return null;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		black.setImage(white.getImage().getScaledInstance(1, 1, -1));
		frame = new JFrame();
		frame.setBounds(100, 100, 441, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 15, 0, 0));
		
		JButton button_11 = new JButton("");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_11.setPreferredSize(new Dimension(20, 20));
		
		panel.add(button_11);
		button_11.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				//x = button_11.getcol
				setWuziqi(button_11);
			}
		});
		button_11.setIcon(black);
		
		JButton button_15 = new JButton("");
		button_15.setPreferredSize(new Dimension(20, 20));
		panel.add(button_15);
		
		JButton button_20 = new JButton("");
		button_20.setPreferredSize(new Dimension(20, 20));
		panel.add(button_20);
		
		JButton button_12 = new JButton("");
		button_12.setPreferredSize(new Dimension(20, 20));
		panel.add(button_12);
		
		JButton button_24 = new JButton("");
		button_24.setPreferredSize(new Dimension(20, 20));
		panel.add(button_24);
		
		JButton button_3 = new JButton("");
		button_3.setPreferredSize(new Dimension(20, 20));
		panel.add(button_3);
		
		JButton button_33 = new JButton("");
		button_33.setPreferredSize(new Dimension(20, 20));
		panel.add(button_33);
		
		JButton button = new JButton("");
		button.setPreferredSize(new Dimension(20, 20));
		panel.add(button);
		
		JButton button_2 = new JButton("");
		button_2.setPreferredSize(new Dimension(20, 20));
		panel.add(button_2);
		
		JButton button_10 = new JButton("");
		button_10.setPreferredSize(new Dimension(20, 20));
		panel.add(button_10);
		
		JButton button_14 = new JButton("");
		button_14.setPreferredSize(new Dimension(20, 20));
		panel.add(button_14);
		
		JButton button_19 = new JButton("");
		button_19.setPreferredSize(new Dimension(20, 20));
		panel.add(button_19);
		
		JButton button_9 = new JButton("");
		button_9.setPreferredSize(new Dimension(20, 20));
		panel.add(button_9);
		
		JButton button_23 = new JButton("");
		button_23.setPreferredSize(new Dimension(20, 20));
		panel.add(button_23);
		
		JButton button_5 = new JButton("");
		button_5.setPreferredSize(new Dimension(20, 20));
		panel.add(button_5);
		
		JButton button_32 = new JButton("");
		button_32.setPreferredSize(new Dimension(20, 20));
		panel.add(button_32);
		
		JButton button_29 = new JButton("");
		button_29.setPreferredSize(new Dimension(20, 20));
		panel.add(button_29);
		
		JButton button_8 = new JButton("");
		button_8.setPreferredSize(new Dimension(20, 20));
		panel.add(button_8);
		
		JButton button_13 = new JButton("");
		button_13.setPreferredSize(new Dimension(20, 20));
		panel.add(button_13);
		
		JButton button_18 = new JButton("");
		button_18.setPreferredSize(new Dimension(20, 20));
		panel.add(button_18);
		
		JButton button_21 = new JButton("");
		button_21.setPreferredSize(new Dimension(20, 20));
		panel.add(button_21);
		
		JButton button_22 = new JButton("");
		button_22.setPreferredSize(new Dimension(20, 20));
		panel.add(button_22);
		
		JButton button_27 = new JButton("");
		button_27.setPreferredSize(new Dimension(20, 20));
		panel.add(button_27);
		
		JButton button_31 = new JButton("");
		button_31.setPreferredSize(new Dimension(20, 20));
		panel.add(button_31);
		
		JButton button_6 = new JButton("");
		button_6.setPreferredSize(new Dimension(20, 20));
		panel.add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setPreferredSize(new Dimension(20, 20));
		panel.add(button_7);
		
		JButton button_17 = new JButton("");
		button_17.setPreferredSize(new Dimension(20, 20));
		panel.add(button_17);
		
		JButton button_16 = new JButton("");
		button_16.setPreferredSize(new Dimension(20, 20));
		panel.add(button_16);
		
		JButton button_28 = new JButton("");
		button_28.setPreferredSize(new Dimension(20, 20));
		panel.add(button_28);
		
		JButton button_25 = new JButton("");
		button_25.setPreferredSize(new Dimension(20, 20));
		panel.add(button_25);
		
		JButton button_26 = new JButton("");
		button_26.setPreferredSize(new Dimension(20, 20));
		panel.add(button_26);
		
		JButton button_30 = new JButton("");
		button_30.setPreferredSize(new Dimension(20, 20));
		panel.add(button_30);
		
		JButton button_34 = new JButton("");
		button_34.setPreferredSize(new Dimension(20, 20));
		panel.add(button_34);
		
		JButton button_41 = new JButton("");
		button_41.setPreferredSize(new Dimension(20, 20));
		panel.add(button_41);
		
		JButton button_42 = new JButton("");
		button_42.setPreferredSize(new Dimension(20, 20));
		panel.add(button_42);
		
		JButton button_49 = new JButton("");
		button_49.setPreferredSize(new Dimension(20, 20));
		panel.add(button_49);
		
		JButton button_65 = new JButton("");
		panel.add(button_65);
		button_65.setPreferredSize(new Dimension(20, 20));
		
		JButton button_50 = new JButton("");
		button_50.setPreferredSize(new Dimension(20, 20));
		panel.add(button_50);
		
		JButton button_57 = new JButton("");
		button_57.setPreferredSize(new Dimension(20, 20));
		panel.add(button_57);
		
		JButton button_58 = new JButton("");
		button_58.setPreferredSize(new Dimension(20, 20));
		panel.add(button_58);
		
		JButton button_35 = new JButton("");
		button_35.setPreferredSize(new Dimension(20, 20));
		panel.add(button_35);
		
		JButton button_40 = new JButton("");
		button_40.setPreferredSize(new Dimension(20, 20));
		panel.add(button_40);
		
		JButton button_43 = new JButton("");
		button_43.setPreferredSize(new Dimension(20, 20));
		panel.add(button_43);
		
		JButton button_48 = new JButton("");
		button_48.setPreferredSize(new Dimension(20, 20));
		panel.add(button_48);
		
		JButton button_51 = new JButton("");
		button_51.setPreferredSize(new Dimension(20, 20));
		panel.add(button_51);
		
		JButton button_56 = new JButton("");
		button_56.setPreferredSize(new Dimension(20, 20));
		panel.add(button_56);
		
		JButton button_59 = new JButton("");
		button_59.setPreferredSize(new Dimension(20, 20));
		panel.add(button_59);
		
		JButton button_64 = new JButton("");
		button_64.setPreferredSize(new Dimension(20, 20));
		panel.add(button_64);
		
		JButton button_36 = new JButton("");
		button_36.setPreferredSize(new Dimension(20, 20));
		panel.add(button_36);
		
		JButton button_39 = new JButton("");
		button_39.setPreferredSize(new Dimension(20, 20));
		panel.add(button_39);
		
		JButton button_44 = new JButton("");
		button_44.setPreferredSize(new Dimension(20, 20));
		panel.add(button_44);
		
		JButton button_47 = new JButton("");
		button_47.setPreferredSize(new Dimension(20, 20));
		panel.add(button_47);
		
		JButton button_52 = new JButton("");
		button_52.setPreferredSize(new Dimension(20, 20));
		panel.add(button_52);
		
		JButton button_55 = new JButton("");
		button_55.setPreferredSize(new Dimension(20, 20));
		panel.add(button_55);
		
		JButton button_60 = new JButton("");
		button_60.setPreferredSize(new Dimension(20, 20));
		panel.add(button_60);
		
		JButton button_63 = new JButton("");
		button_63.setPreferredSize(new Dimension(20, 20));
		panel.add(button_63);
		
		JButton button_37 = new JButton("");
		button_37.setPreferredSize(new Dimension(20, 20));
		panel.add(button_37);
		
		JButton button_38 = new JButton("");
		button_38.setPreferredSize(new Dimension(20, 20));
		panel.add(button_38);
		
		JButton button_45 = new JButton("");
		button_45.setPreferredSize(new Dimension(20, 20));
		panel.add(button_45);
		
		JButton button_46 = new JButton("");
		button_46.setPreferredSize(new Dimension(20, 20));
		panel.add(button_46);
		
		JButton button_53 = new JButton("");
		button_53.setPreferredSize(new Dimension(20, 20));
		panel.add(button_53);
		
		JButton button_54 = new JButton("");
		button_54.setPreferredSize(new Dimension(20, 20));
		panel.add(button_54);
		
		JButton button_1 = new JButton("");
		button_1.setPreferredSize(new Dimension(20, 20));
		panel.add(button_1);
		
		JButton button_61 = new JButton("");
		button_61.setPreferredSize(new Dimension(20, 20));
		panel.add(button_61);
		
		JButton button_62 = new JButton("");
		button_62.setPreferredSize(new Dimension(20, 20));
		panel.add(button_62);
		
		JButton button_70 = new JButton("");
		button_70.setPreferredSize(new Dimension(20, 20));
		panel.add(button_70);
		
		JButton button_73 = new JButton("");
		button_73.setPreferredSize(new Dimension(20, 20));
		panel.add(button_73);
		
		JButton button_75 = new JButton("");
		button_75.setPreferredSize(new Dimension(20, 20));
		panel.add(button_75);
		
		JButton button_77 = new JButton("");
		button_77.setPreferredSize(new Dimension(20, 20));
		panel.add(button_77);
		
		JButton button_79 = new JButton("");
		button_79.setPreferredSize(new Dimension(20, 20));
		panel.add(button_79);
		
		JButton button_83 = new JButton("");
		button_83.setPreferredSize(new Dimension(20, 20));
		panel.add(button_83);
		
		JButton button_85 = new JButton("");
		button_85.setPreferredSize(new Dimension(20, 20));
		panel.add(button_85);
		
		JButton button_87 = new JButton("");
		button_87.setPreferredSize(new Dimension(20, 20));
		panel.add(button_87);
		
		JButton button_89 = new JButton("");
		button_89.setPreferredSize(new Dimension(20, 20));
		panel.add(button_89);
		
		JButton button_90 = new JButton("");
		button_90.setPreferredSize(new Dimension(20, 20));
		panel.add(button_90);
		
		JButton button_88 = new JButton("");
		button_88.setPreferredSize(new Dimension(20, 20));
		panel.add(button_88);
		
		JButton button_86 = new JButton("");
		button_86.setPreferredSize(new Dimension(20, 20));
		panel.add(button_86);
		
		JButton button_84 = new JButton("");
		button_84.setPreferredSize(new Dimension(20, 20));
		panel.add(button_84);
		
		JButton button_82 = new JButton("");
		button_82.setPreferredSize(new Dimension(20, 20));
		panel.add(button_82);
		
		JButton button_81 = new JButton("");
		button_81.setPreferredSize(new Dimension(20, 20));
		panel.add(button_81);
		
		JButton button_80 = new JButton("");
		button_80.setPreferredSize(new Dimension(20, 20));
		panel.add(button_80);
		
		JButton button_78 = new JButton("");
		button_78.setPreferredSize(new Dimension(20, 20));
		panel.add(button_78);
		
		JButton button_76 = new JButton("");
		button_76.setPreferredSize(new Dimension(20, 20));
		panel.add(button_76);
		
		JButton button_74 = new JButton("");
		button_74.setPreferredSize(new Dimension(20, 20));
		panel.add(button_74);
		
		JButton button_72 = new JButton("");
		button_72.setPreferredSize(new Dimension(20, 20));
		panel.add(button_72);
		
		JButton button_71 = new JButton("");
		button_71.setPreferredSize(new Dimension(20, 20));
		panel.add(button_71);
		
		JButton button_69 = new JButton("");
		button_69.setPreferredSize(new Dimension(20, 20));
		panel.add(button_69);
		
		JButton button_68 = new JButton("");
		button_68.setPreferredSize(new Dimension(20, 20));
		panel.add(button_68);
		
		JButton button_67 = new JButton("");
		button_67.setPreferredSize(new Dimension(20, 20));
		panel.add(button_67);
		
		JButton button_66 = new JButton("");
		button_66.setPreferredSize(new Dimension(20, 20));
		panel.add(button_66);
		
		JButton button_91 = new JButton("");
		button_91.setPreferredSize(new Dimension(20, 20));
		panel.add(button_91);
		
		JButton button_92 = new JButton("");
		button_92.setPreferredSize(new Dimension(20, 20));
		panel.add(button_92);
		
		JButton button_93 = new JButton("");
		button_93.setPreferredSize(new Dimension(20, 20));
		panel.add(button_93);
		
		JButton button_94 = new JButton("");
		button_94.setPreferredSize(new Dimension(20, 20));
		panel.add(button_94);
		
		JButton button_95 = new JButton("");
		button_95.setPreferredSize(new Dimension(20, 20));
		panel.add(button_95);
		
		JButton button_96 = new JButton("");
		button_96.setPreferredSize(new Dimension(20, 20));
		panel.add(button_96);
		
		JButton button_97 = new JButton("");
		button_97.setPreferredSize(new Dimension(20, 20));
		panel.add(button_97);
		
		JButton button_98 = new JButton("");
		button_98.setPreferredSize(new Dimension(20, 20));
		panel.add(button_98);
		
		JButton button_99 = new JButton("");
		button_99.setPreferredSize(new Dimension(20, 20));
		panel.add(button_99);
		
		JButton button_100 = new JButton("");
		button_100.setPreferredSize(new Dimension(20, 20));
		panel.add(button_100);
		
		JButton button_101 = new JButton("");
		button_101.setPreferredSize(new Dimension(20, 20));
		panel.add(button_101);
		
		JButton button_102 = new JButton("");
		button_102.setPreferredSize(new Dimension(20, 20));
		panel.add(button_102);
		
		JButton button_103 = new JButton("");
		button_103.setPreferredSize(new Dimension(20, 20));
		panel.add(button_103);
		
		JButton button_104 = new JButton("");
		button_104.setPreferredSize(new Dimension(20, 20));
		panel.add(button_104);
		
		JButton button_105 = new JButton("");
		button_105.setPreferredSize(new Dimension(20, 20));
		panel.add(button_105);
		
		JButton button_106 = new JButton("");
		button_106.setPreferredSize(new Dimension(20, 20));
		panel.add(button_106);
		
		JButton button_107 = new JButton("");
		button_107.setPreferredSize(new Dimension(20, 20));
		panel.add(button_107);
		
		JButton button_108 = new JButton("");
		button_108.setPreferredSize(new Dimension(20, 20));
		panel.add(button_108);
		
		JButton button_109 = new JButton("");
		button_109.setPreferredSize(new Dimension(20, 20));
		panel.add(button_109);
		
		JButton button_110 = new JButton("");
		button_110.setPreferredSize(new Dimension(20, 20));
		panel.add(button_110);
		
		JButton button_111 = new JButton("");
		button_111.setPreferredSize(new Dimension(20, 20));
		panel.add(button_111);
		
		JButton button_112 = new JButton("");
		button_112.setPreferredSize(new Dimension(20, 20));
		panel.add(button_112);
		
		JButton button_113 = new JButton("");
		button_113.setPreferredSize(new Dimension(20, 20));
		panel.add(button_113);
		
		JButton button_114 = new JButton("");
		button_114.setPreferredSize(new Dimension(20, 20));
		panel.add(button_114);
		
		JButton button_115 = new JButton("");
		button_115.setPreferredSize(new Dimension(20, 20));
		panel.add(button_115);
		
		JButton button_116 = new JButton("");
		button_116.setPreferredSize(new Dimension(20, 20));
		panel.add(button_116);
		
		JButton button_117 = new JButton("");
		button_117.setPreferredSize(new Dimension(20, 20));
		panel.add(button_117);
		
		JButton button_118 = new JButton("");
		button_118.setPreferredSize(new Dimension(20, 20));
		panel.add(button_118);
		
		JButton button_119 = new JButton("");
		button_119.setPreferredSize(new Dimension(20, 20));
		panel.add(button_119);
		
		JButton button_120 = new JButton("");
		button_120.setPreferredSize(new Dimension(20, 20));
		panel.add(button_120);
		
		JButton button_121 = new JButton("");
		button_121.setPreferredSize(new Dimension(20, 20));
		panel.add(button_121);
		
		JButton button_122 = new JButton("");
		button_122.setPreferredSize(new Dimension(20, 20));
		panel.add(button_122);
		
		JButton button_123 = new JButton("");
		button_123.setPreferredSize(new Dimension(20, 20));
		panel.add(button_123);
		
		JButton button_124 = new JButton("");
		button_124.setPreferredSize(new Dimension(20, 20));
		panel.add(button_124);
		
		JButton button_125 = new JButton("");
		button_125.setPreferredSize(new Dimension(20, 20));
		panel.add(button_125);
		
		JButton button_126 = new JButton("");
		button_126.setPreferredSize(new Dimension(20, 20));
		panel.add(button_126);
		
		JButton button_127 = new JButton("");
		button_127.setPreferredSize(new Dimension(20, 20));
		panel.add(button_127);
		
		JButton button_128 = new JButton("");
		button_128.setPreferredSize(new Dimension(20, 20));
		panel.add(button_128);
		
		JButton button_129 = new JButton("");
		button_129.setPreferredSize(new Dimension(20, 20));
		panel.add(button_129);
		
		JButton button_130 = new JButton("");
		button_130.setPreferredSize(new Dimension(20, 20));
		panel.add(button_130);
		
		JButton button_131 = new JButton("");
		button_131.setPreferredSize(new Dimension(20, 20));
		panel.add(button_131);
		
		JButton button_132 = new JButton("");
		button_132.setPreferredSize(new Dimension(20, 20));
		panel.add(button_132);
		
		JButton button_133 = new JButton("");
		button_133.setPreferredSize(new Dimension(20, 20));
		panel.add(button_133);
		
		JButton button_134 = new JButton("");
		button_134.setPreferredSize(new Dimension(20, 20));
		panel.add(button_134);
		
		JButton button_135 = new JButton("");
		button_135.setPreferredSize(new Dimension(20, 20));
		panel.add(button_135);
		
		JButton button_136 = new JButton("");
		button_136.setPreferredSize(new Dimension(20, 20));
		panel.add(button_136);
		
		JButton button_137 = new JButton("");
		button_137.setPreferredSize(new Dimension(20, 20));
		panel.add(button_137);
		
		JButton button_138 = new JButton("");
		button_138.setPreferredSize(new Dimension(20, 20));
		panel.add(button_138);
		
		JButton button_139 = new JButton("");
		button_139.setPreferredSize(new Dimension(20, 20));
		panel.add(button_139);
		
		JButton button_140 = new JButton("");
		button_140.setPreferredSize(new Dimension(20, 20));
		panel.add(button_140);
		
		JButton button_141 = new JButton("");
		button_141.setPreferredSize(new Dimension(20, 20));
		panel.add(button_141);
		
		JButton button_142 = new JButton("");
		button_142.setPreferredSize(new Dimension(20, 20));
		panel.add(button_142);
		
		JButton button_143 = new JButton("");
		button_143.setPreferredSize(new Dimension(20, 20));
		panel.add(button_143);
		
		JButton button_144 = new JButton("");
		button_144.setPreferredSize(new Dimension(20, 20));
		panel.add(button_144);
		
		JButton button_145 = new JButton("");
		button_145.setPreferredSize(new Dimension(20, 20));
		panel.add(button_145);
		
		JButton button_146 = new JButton("");
		button_146.setPreferredSize(new Dimension(20, 20));
		panel.add(button_146);
		
		JButton button_147 = new JButton("");
		button_147.setPreferredSize(new Dimension(20, 20));
		panel.add(button_147);
		
		JButton button_148 = new JButton("");
		button_148.setPreferredSize(new Dimension(20, 20));
		panel.add(button_148);
		
		JButton button_149 = new JButton("");
		button_149.setPreferredSize(new Dimension(20, 20));
		panel.add(button_149);
		
		JButton button_150 = new JButton("");
		button_150.setPreferredSize(new Dimension(20, 20));
		panel.add(button_150);
		
		JButton button_151 = new JButton("");
		button_151.setPreferredSize(new Dimension(20, 20));
		panel.add(button_151);
		
		JButton button_152 = new JButton("");
		button_152.setPreferredSize(new Dimension(20, 20));
		panel.add(button_152);
		
		JButton button_153 = new JButton("");
		button_153.setPreferredSize(new Dimension(20, 20));
		panel.add(button_153);
		
		JButton button_154 = new JButton("");
		button_154.setPreferredSize(new Dimension(20, 20));
		panel.add(button_154);
		
		JButton button_159 = new JButton("");
		button_159.setPreferredSize(new Dimension(20, 20));
		panel.add(button_159);
		
		JButton button_164 = new JButton("");
		button_164.setPreferredSize(new Dimension(20, 20));
		panel.add(button_164);
		
		JButton button_169 = new JButton("");
		button_169.setPreferredSize(new Dimension(20, 20));
		panel.add(button_169);
		
		JButton button_174 = new JButton("");
		button_174.setPreferredSize(new Dimension(20, 20));
		panel.add(button_174);
		
		JButton button_179 = new JButton("");
		button_179.setPreferredSize(new Dimension(20, 20));
		panel.add(button_179);
		
		JButton button_184 = new JButton("");
		button_184.setPreferredSize(new Dimension(20, 20));
		panel.add(button_184);
		
		JButton button_185 = new JButton("");
		button_185.setPreferredSize(new Dimension(20, 20));
		panel.add(button_185);
		
		JButton button_186 = new JButton("");
		button_186.setPreferredSize(new Dimension(20, 20));
		panel.add(button_186);
		
		JButton button_187 = new JButton("");
		button_187.setPreferredSize(new Dimension(20, 20));
		panel.add(button_187);
		
		JButton button_188 = new JButton("");
		button_188.setPreferredSize(new Dimension(20, 20));
		panel.add(button_188);
		
		JButton button_180 = new JButton("");
		button_180.setPreferredSize(new Dimension(20, 20));
		panel.add(button_180);
		
		JButton button_181 = new JButton("");
		button_181.setPreferredSize(new Dimension(20, 20));
		panel.add(button_181);
		
		JButton button_182 = new JButton("");
		button_182.setPreferredSize(new Dimension(20, 20));
		panel.add(button_182);
		
		JButton button_183 = new JButton("");
		button_183.setPreferredSize(new Dimension(20, 20));
		panel.add(button_183);
		
		JButton button_175 = new JButton("");
		button_175.setPreferredSize(new Dimension(20, 20));
		panel.add(button_175);
		
		JButton button_176 = new JButton("");
		button_176.setPreferredSize(new Dimension(20, 20));
		panel.add(button_176);
		
		JButton button_177 = new JButton("");
		button_177.setPreferredSize(new Dimension(20, 20));
		panel.add(button_177);
		
		JButton button_178 = new JButton("");
		button_178.setPreferredSize(new Dimension(20, 20));
		panel.add(button_178);
		
		JButton button_170 = new JButton("");
		button_170.setPreferredSize(new Dimension(20, 20));
		panel.add(button_170);
		
		JButton button_171 = new JButton("");
		button_171.setPreferredSize(new Dimension(20, 20));
		panel.add(button_171);
		
		JButton button_172 = new JButton("");
		button_172.setPreferredSize(new Dimension(20, 20));
		panel.add(button_172);
		
		JButton button_173 = new JButton("");
		button_173.setPreferredSize(new Dimension(20, 20));
		panel.add(button_173);
		
		JButton button_165 = new JButton("");
		button_165.setPreferredSize(new Dimension(20, 20));
		panel.add(button_165);
		
		JButton button_166 = new JButton("");
		button_166.setPreferredSize(new Dimension(20, 20));
		panel.add(button_166);
		
		JButton button_167 = new JButton("");
		button_167.setPreferredSize(new Dimension(20, 20));
		panel.add(button_167);
		
		JButton button_168 = new JButton("");
		button_168.setPreferredSize(new Dimension(20, 20));
		panel.add(button_168);
		
		JButton button_160 = new JButton("");
		button_160.setPreferredSize(new Dimension(20, 20));
		panel.add(button_160);
		
		JButton button_161 = new JButton("");
		button_161.setPreferredSize(new Dimension(20, 20));
		panel.add(button_161);
		
		JButton button_162 = new JButton("");
		button_162.setPreferredSize(new Dimension(20, 20));
		panel.add(button_162);
		
		JButton button_163 = new JButton("");
		button_163.setPreferredSize(new Dimension(20, 20));
		panel.add(button_163);
		
		JButton button_155 = new JButton("");
		button_155.setPreferredSize(new Dimension(20, 20));
		panel.add(button_155);
		
		JButton button_156 = new JButton("");
		button_156.setPreferredSize(new Dimension(20, 20));
		panel.add(button_156);
		
		JButton button_157 = new JButton("");
		button_157.setPreferredSize(new Dimension(20, 20));
		panel.add(button_157);
		
		JButton button_158 = new JButton("");
		button_158.setPreferredSize(new Dimension(20, 20));
		panel.add(button_158);
		
		JButton button_189 = new JButton("");
		button_189.setPreferredSize(new Dimension(20, 20));
		panel.add(button_189);
		
		JButton button_198 = new JButton("");
		button_198.setPreferredSize(new Dimension(20, 20));
		panel.add(button_198);
		
		JButton button_199 = new JButton("");
		button_199.setPreferredSize(new Dimension(20, 20));
		panel.add(button_199);
		
		JButton button_200 = new JButton("");
		button_200.setPreferredSize(new Dimension(20, 20));
		panel.add(button_200);
		
		JButton button_201 = new JButton("");
		button_201.setPreferredSize(new Dimension(20, 20));
		panel.add(button_201);
		
		JButton button_202 = new JButton("");
		button_202.setPreferredSize(new Dimension(20, 20));
		panel.add(button_202);
		
		JButton button_203 = new JButton("");
		button_203.setPreferredSize(new Dimension(20, 20));
		panel.add(button_203);
		
		JButton button_204 = new JButton("");
		button_204.setPreferredSize(new Dimension(20, 20));
		panel.add(button_204);
		
		JButton button_205 = new JButton("");
		button_205.setPreferredSize(new Dimension(20, 20));
		panel.add(button_205);
		
		JButton button_190 = new JButton("");
		button_190.setPreferredSize(new Dimension(20, 20));
		panel.add(button_190);
		
		JButton button_191 = new JButton("");
		button_191.setPreferredSize(new Dimension(20, 20));
		panel.add(button_191);
		
		JButton button_192 = new JButton("");
		button_192.setPreferredSize(new Dimension(20, 20));
		panel.add(button_192);
		
		JButton button_193 = new JButton("");
		button_193.setPreferredSize(new Dimension(20, 20));
		panel.add(button_193);
		
		JButton button_194 = new JButton("");
		button_194.setPreferredSize(new Dimension(20, 20));
		panel.add(button_194);
		
		JButton button_195 = new JButton("");
		button_195.setPreferredSize(new Dimension(20, 20));
		panel.add(button_195);
		
		JButton button_196 = new JButton("");
		button_196.setPreferredSize(new Dimension(20, 20));
		panel.add(button_196);
		
		JButton button_206 = new JButton("");
		button_206.setPreferredSize(new Dimension(20, 20));
		panel.add(button_206);
		
		JButton button_207 = new JButton("");
		button_207.setPreferredSize(new Dimension(20, 20));
		panel.add(button_207);
		
		JButton button_208 = new JButton("");
		button_208.setPreferredSize(new Dimension(20, 20));
		panel.add(button_208);
		
		JButton button_209 = new JButton("");
		button_209.setPreferredSize(new Dimension(20, 20));
		panel.add(button_209);
		
		JButton button_210 = new JButton("");
		button_210.setPreferredSize(new Dimension(20, 20));
		panel.add(button_210);
		
		JButton button_211 = new JButton("");
		button_211.setPreferredSize(new Dimension(20, 20));
		panel.add(button_211);
		
		JButton button_212 = new JButton("");
		button_212.setPreferredSize(new Dimension(20, 20));
		panel.add(button_212);
		
		JButton button_213 = new JButton("");
		button_213.setPreferredSize(new Dimension(20, 20));
		panel.add(button_213);
		
		JButton button_214 = new JButton("");
		button_214.setPreferredSize(new Dimension(20, 20));
		panel.add(button_214);
		
		JButton button_215 = new JButton("");
		button_215.setPreferredSize(new Dimension(20, 20));
		panel.add(button_215);
		
		JButton button_216 = new JButton("");
		button_216.setPreferredSize(new Dimension(20, 20));
		panel.add(button_216);
		
		JButton button_217 = new JButton("");
		button_217.setPreferredSize(new Dimension(20, 20));
		panel.add(button_217);
		
		JButton button_218 = new JButton("");
		button_218.setPreferredSize(new Dimension(20, 20));
		panel.add(button_218);
		
		JButton button_219 = new JButton("");
		button_219.setPreferredSize(new Dimension(20, 20));
		panel.add(button_219);
		
		JButton button_220 = new JButton("");
		button_220.setPreferredSize(new Dimension(20, 20));
		panel.add(button_220);
		
		JButton button_221 = new JButton("");
		button_221.setPreferredSize(new Dimension(20, 20));
		panel.add(button_221);
		
		JButton button_197 = new JButton("");
		button_197.setPreferredSize(new Dimension(20, 20));
		panel.add(button_197);
		
		JButton button_222 = new JButton("");
		button_222.setPreferredSize(new Dimension(20, 20));
		panel.add(button_222);
		
		JButton button_223 = new JButton("");
		button_223.setPreferredSize(new Dimension(20, 20));
		panel.add(button_223);
		
		JButton button_224 = new JButton("");
		button_224.setPreferredSize(new Dimension(20, 20));
		panel.add(button_224);
		
		JButton button_4 = new JButton("");
		button_4.setPreferredSize(new Dimension(20, 20));
		panel.add(button_4);
		
		JButton button_225 = new JButton("");
		button_225.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_225.setPreferredSize(new Dimension(20, 20));
		panel.add(button_225);
	}

}
