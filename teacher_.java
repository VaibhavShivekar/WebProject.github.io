import java.util.regex.*;
import java.util.Date;
import javax.swing.table.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.applet.*;
import javax.script.*;
import java.text.SimpleDateFormat;

//create login for Techer
//create Subject in combo for Techer
//create login for Student

class Login_page_for_teacher_and_student implements MouseListener
{JFrame Collage;
	public void Login_frame()
	{
		Collage=new JFrame("Digital ClassRoom Management");
		Collage.setBounds(-10,0,1940,1500);
		Collage.setLayout(null);
		Collage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Collage.getContentPane().setBackground(Color.black);
		Collage.addMouseListener(this);
		
		
		
		
		
		





		
		
		
		Panel1.add(header_2);    
		Panel1.add(sfname);      
		Panel1.add(slname);      
		Panel1.add(password);    
		Panel1.add(semail);      
		Panel1.add(sfaculty);    
		
		Panel1.add(Add_Student); 
		Panel1.add(message_box);
		Panel1.add(type_massage);
		Panel1.add(Batch_Name);  
		Panel1.add(Subject_name);
		Panel1.add(tslname);     
		Panel1.add(tsfname);     
		Panel1.add(tspassword);  
		Panel1.add(tsemail);     
		Panel1.add(tsfaculty);   
		
		Panel_On_Student_Log.add(sheader_1);
		Panel_On_Student_Log.add(	Ls1);
		Panel_On_Student_Log.add(  	Ls2);
		Panel_On_Student_Log.add(  	Ls3);
		
		Panel_On_Student_Log.add(stext_phone);
		Panel_On_Student_Log.add(stext_name);
		Panel_On_Student_Log.add(stext_pass);

		
		Panel_On_Student_Log.add(sbutton_login);
		Panel_On_Student_Log.add(sbutton_forgate);
		Panel_On_Student_Log.add(screate_new);
//////////////////////////////////////////////////////////////////////////////////////
//**********************************************************************************//


		new_Teacher_add.add( Theader_2);//lable
		new_Teacher_add.add(  Tfname);  //lable
		new_Teacher_add.add(  Tlname);  //lable
		new_Teacher_add.add( Tpassword);//lable
		new_Teacher_add.add(  Temail);  //lable
		new_Teacher_add.add(Tfaculty);  //lable
		
		new_Teacher_add.add(Ttext_fnam);//text
		new_Teacher_add.add(Ttext_name);//text
		new_Teacher_add.add(Ttext_pass);//text
		new_Teacher_add.add(Ttext_emil);//text
		new_Teacher_add.add(Ttext_faut);//text
		
		new_Teacher_add.add(Tsing_up);//button
		
		new_Student_add.add(Sheader_2);//lable
		new_Student_add.add(Sfname);  //lable
		new_Student_add.add(Slname);  //lable
		new_Student_add.add(Spassword);//lable
		new_Student_add.add(Semail);  //lable
		new_Student_add.add(Sfaculty);  //lable
		new_Student_add.add(Stext_fnam);//text
		new_Student_add.add(Stext_name);//text
		new_Student_add.add(Stext_pass);//text
		new_Student_add.add(Stext_emil);//text
		new_Student_add.add(Stext_faut);//text
		new_Student_add.add(Ssing_up);//button
		
		
//////////////////////////////////////////////////////////////////////////////////////
		Panel_On_Teacher_Log.add(header_1);
		Panel_On_Teacher_Log.add(	L1);
		Panel_On_Teacher_Log.add(  	L2);
		Panel_On_Teacher_Log.add(  	L3);
		
		Panel_On_Teacher_Log.add(text_phone);
		Panel_On_Teacher_Log.add(text_name);
		Panel_On_Teacher_Log.add(text_pass);

		
		Panel_On_Teacher_Log.add(Tbutton_login);
		Panel_On_Teacher_Log.add(button_forgate);
		Panel_On_Teacher_Log.add(create_new);
		
		choice_pan.add(teacher_log_button);
		choice_pan.add(student_log_button);
		
		Collage.add(choice_pan);
		Collage.add(Panel1);
		Collage.add(Panel_On_Subject_Log);
		Collage.add(Panel_On_Student_Log);
		Collage.add(new_Student_add);
		Collage.add(new_Teacher_add);
		Collage.add(Panel_On_Teacher_Log);
		Collage.setVisible(true);
	
		
	}
	JLabel header_1,L2,L1,L3;
	JButton button_forgate,create_new,Tbutton_login;
	JTextField text_phone,text_name,text_pass;
	JPanel Panel_On_Teacher_Log,Panel_On_Student_Log,Panel_On_Subject_Log,Panel1,choice_pan;
	public void Teacher_Log()
	{
		Font ft1=new Font("",Font.BOLD,70); 
		Font ft=new Font("",Font.BOLD,30); 
		Panel_On_Teacher_Log=new JPanel();
		Panel_On_Teacher_Log.setBounds(100,100,800,700);
		Panel_On_Teacher_Log.setBackground(Color.orange);
		Panel_On_Teacher_Log.setLayout(null);
		Panel_On_Teacher_Log.addMouseListener(this);
		Panel_On_Teacher_Log.setVisible(false);
		
  header_1=new JLabel("Teacher Login");
		L1=new JLabel("Enter Phone Number");
		L2=new JLabel("Enter User Name");
		L3=new JLabel("Enter Passward");
		
		  header_1.setBounds(152,05,795,85);
				L1.setBounds(10,150,350,35);
				L2.setBounds(10,250,350,35);
				L3.setBounds(10,350,350,35);
				
				  header_1.setFont(ft1);
		        		L1.setFont(ft);
		            	L2.setFont(ft);
		            	L3.setFont(ft);
						
	   text_phone=new JTextField(" ");
		text_name=new JTextField(" ");
		text_pass=new JTextField(" ");
		
		   text_phone.setBounds(410,150,350,35);
            text_name.setBounds(410,250,350,35);
            text_pass.setBounds(410,350,350,35);
			
              text_phone.setFont(ft);
               text_name.setFont(ft);
               text_pass.setFont(ft);
			   
			   Tbutton_login=new JButton("Login");
			 button_forgate=new JButton("Forgate");
			 create_new=new JButton("Sing Up");
			 
			   Tbutton_login.setBounds(410,440,150,40);
			 button_forgate.setBounds(610,440,150,40);
			     create_new.setBounds(510,540,150,40);
			 
			   Tbutton_login.setFont(ft);
			 button_forgate.setFont(ft);
			 create_new.setFont(ft);
			 
			   Tbutton_login.addMouseListener(this);
			 button_forgate.addMouseListener(this);
			 create_new.addMouseListener(this);

			
		
						
	}
	//create Batch name subject name then                    <<*{linked each other
	//create student form and send invite massage to student <<*{linked each other
	//teacher always see who join the class 
	
	//student can use Fname and Lastname or email@ for join class 
	//student can see list of subject and uploaded files or video
	

	JLabel header_2,sfname,slname,password,semail,sfaculty,type_massage;
	JTextField tsfname,tslname,tsfaculty,tsemail,tspassword;
	JTextArea message_box;
	JButton Add_Student;
	JComboBox Batch_Name,Subject_name;
		
	    String B1[]={"SELECT BATCH", " B.C.A "," B.S.C "," B.B.A "};
	    String S1[]={"SUBJECT","JAVA","C","C++","BIOLOGY","ACCOUNTING"};
	public void Teacher_Subject()
	{
		Font hft=new Font("",Font.BOLD,70); 
		Font ft=new Font("",Font.BOLD,30); 

		Panel_On_Subject_Log=new JPanel();
		Panel_On_Subject_Log.setBounds(100,100,1700,800);
		Panel_On_Subject_Log.setBackground(Color.gray);
		Panel_On_Subject_Log.setLayout(null);
		Panel_On_Subject_Log.addMouseListener(this);
		Panel_On_Subject_Log.setVisible(false);
		
		Panel1=new JPanel();
		Panel1.setBounds(100,100,1700,800);
		Panel1.setBackground(Color.gray);
		Panel1.setLayout(null);
		Panel1.addMouseListener(this);
		Panel1.setVisible(false);
		
	      Batch_Name=new JComboBox(B1);
	    Subject_name=new JComboBox(S1);
		
		  Batch_Name.setBounds(10,20,300,40);
		Subject_name.setBounds(330,20,300,40);
		
		  Batch_Name.setFont(ft);
		Subject_name.setFont(ft);
		
		  Batch_Name.addMouseListener(this);
		Subject_name.addMouseListener(this);

		header_2=new JLabel("Add Student");
		  sfname=new JLabel("Student firstName");
		  slname=new JLabel("Student LastName");
		password=new JLabel("  Student Faculty");
		  semail=new JLabel("   Student Email@");
		sfaculty=new JLabel("   Auto Passward");
				
		header_2.setBounds(1000,10,500,80);
		  sfname.setBounds(950,150,280,40);
		  slname.setBounds(950,250,280,40);
		password.setBounds(950,350,280,40);
		  semail.setBounds(950,450,280,40);
		sfaculty.setBounds(950,550,280,40);
				
		header_2.setFont(hft);
		  sfname.setFont(ft);		
		  slname.setFont(ft);		
		password.setFont(ft);		
		  semail.setFont(ft);		
		sfaculty.setFont(ft);		
		
		
		  tsfname=new JTextField("tsfname");
		  tslname=new JTextField("tslname");
		tsfaculty=new JTextField("tsfaculty");
		  tsemail=new JTextField("tsemail");
	   tspassword=new JTextField("tspassword");
		
		  tsfname.setBounds(1250,150,260,40);//1 150  
	   	  tslname.setBounds(1250,250,260,40);//2 250  
	   	tsfaculty.setBounds(1250,350,260,40);//5 550
	   	  tsemail.setBounds(1250,450,260,40);//4 450 
	   tspassword.setBounds(1250,550,260,40);//3 350 
		
		
			  tsfname.setFont(ft);
			  tslname.setFont(ft);
		   tspassword.setFont(ft);
			  tsemail.setFont(ft);
			tsfaculty.setFont(ft);
			
				  tsfname.addMouseListener(this);
				  tslname.addMouseListener(this);
			   tspassword.addMouseListener(this);
				  tsemail.addMouseListener(this);
				tsfaculty.addMouseListener(this);
		
	   type_massage=new JLabel("Massage For Student's");
		message_box=new JTextArea("");
		
		type_massage.setBounds(20,100,450,40);
		 message_box.setBounds(20,150,750,600);
		
		type_massage.setFont(ft);
		 message_box.setFont(ft);
		 
		 Add_Student=new JButton("Add Student");
		 Add_Student.setBounds(1250,650,250,40);
		 Add_Student.setFont(ft);
		 Add_Student.addMouseListener(this);
		
	}
	
	JLabel sheader_1,Ls2,Ls1,Ls3;
	JButton sbutton_login,sbutton_forgate,screate_new;
	JTextField stext_phone,stext_name,stext_pass;
	public void Student_Log()
	{
		Font ft1=new Font("",Font.BOLD,70); 
		Font ft=new Font("",Font.BOLD,30); 
		Panel_On_Student_Log=new JPanel();
		Panel_On_Student_Log.setBounds(920,100,800,700);
		Panel_On_Student_Log.setBackground(Color.orange);
		Panel_On_Student_Log.setLayout(null);
		Panel_On_Student_Log.addMouseListener(this);
		Panel_On_Student_Log.setVisible(false);

		
  sheader_1=new JLabel("Student Login");
		Ls1=new JLabel("Enter First Name");
		Ls2=new JLabel("Enter Last Name");
		Ls3=new JLabel("Enter Passward");
		
		  sheader_1.setBounds(152,05,795,85);
				Ls1.setBounds(10,150,350,35);
				Ls2.setBounds(10,250,350,35);
				Ls3.setBounds(10,350,350,35);
				
				  sheader_1.setFont(ft1);
		        		Ls1.setFont(ft);
		            	Ls2.setFont(ft);
		            	Ls3.setFont(ft);
						
	   stext_phone=new JTextField(" ");
		stext_name=new JTextField(" ");
		stext_pass=new JTextField(" ");
		
		   stext_phone.setBounds(410,150,350,35);
            stext_name.setBounds(410,250,350,35);
            stext_pass.setBounds(410,350,350,35);
			
              stext_phone.setFont(ft);
               stext_name.setFont(ft);
               stext_pass.setFont(ft);
			   
			   sbutton_login=new JButton("Login");
			 sbutton_forgate=new JButton("Forgate");
			 screate_new=new JButton("Sing Up");
			 
			   sbutton_login.setBounds(410,440,150,40);
			 sbutton_forgate.setBounds(610,440,150,40);
			     screate_new.setBounds(510,540,150,40);
			 
			   sbutton_login.setFont(ft);
			 sbutton_forgate.setFont(ft);
			 screate_new.setFont(ft);
			 
			   sbutton_login.addMouseListener(this);
			 sbutton_forgate.addMouseListener(this);
			 screate_new.addMouseListener(this);
	}
	JButton teacher_log_button,student_log_button;
	public void choice_button_pan()
	{
		
		Font ft=new Font("",Font.BOLD,30); 
		
		choice_pan=new JPanel();
		choice_pan.setBounds(300,10,1000,70);
		choice_pan.setBackground(Color.blue);
		choice_pan.setLayout(null);
		choice_pan.addMouseListener(this);
		choice_pan.setVisible(true);
		
     		 teacher_log_button=new JButton("Login For Teacher");
			 student_log_button=new JButton("Login For Student");
			 
			 teacher_log_button.setBounds(10,10,300,40);
			 student_log_button.setBounds(550,10,300,40);
			 
			 teacher_log_button.setFont(ft);
			 student_log_button.setFont(ft);	 
			 
			 teacher_log_button.addMouseListener(this);
			 student_log_button.addMouseListener(this);
	}
	
	JLabel Theader_2,Tfname,Tlname,Tpassword,Temail,Tfaculty;
	JPanel new_Teacher_add;
	JTextField Ttext_fnam,Ttext_name,Ttext_pass,Ttext_emil,Ttext_faut;
	JButton Tsing_up;

public void add_new_teacher()
{
	    new_Teacher_add=new JPanel();
		new_Teacher_add.setBounds(920,100,800,700);
		new_Teacher_add.setBackground(Color.orange);
		new_Teacher_add.setLayout(null);
		new_Teacher_add.addMouseListener(this);
		new_Teacher_add.setVisible(false);
		
				Font hft=new Font("",Font.BOLD,80); 
				Font ft=new Font("",Font.BOLD,30); 
        Theader_2=new JLabel("Add Teacher");
		  Tfname=new JLabel("Teacher firstName");
		  Tlname=new JLabel("Teacher LastName");
		  Tpassword=new JLabel("Teacher Faculty");
		  Temail=new JLabel("Teacher Email@");
		  Tfaculty=new JLabel("Auto Passward");
				
	   Theader_2.setBounds(152,05,795,85);
		  Tfname.setBounds(10,150,350,35);
		  Tlname.setBounds(10,250,350,35);
	   Tpassword.setBounds(10,350,350,35);
		  Temail.setBounds(10,450,350,35);
		Tfaculty.setBounds(10,550,350,35);
				
		Theader_2.setFont(hft);
		  Tfname.setFont(ft);		
		  Tlname.setFont(ft);		
		  Tpassword.setFont(ft);		
		  Temail.setFont(ft);		
		  Tfaculty.setFont(ft);	
		  
		  Tsing_up=new JButton("Add Teacher");
		  Tsing_up.setBounds(300,600,250,35);
		  Tsing_up.setFont(ft);
		  Tsing_up.addMouseListener(this);
		 
		  
	    Ttext_fnam=new JTextField("1");
		Ttext_name=new JTextField("2");
		Ttext_pass=new JTextField("3");
		Ttext_emil=new JTextField("4");
		Ttext_faut=new JTextField("5");
		
		   Ttext_fnam.setBounds(410,150,350,35);
           Ttext_name.setBounds(410,250,350,35);
           Ttext_pass.setBounds(410,350,350,35);
           Ttext_emil.setBounds(410,450,350,35);
           Ttext_faut.setBounds(410,550,350,35);
			
              Ttext_fnam.setFont(ft);
              Ttext_name.setFont(ft);
              Ttext_pass.setFont(ft);		  
              Ttext_emil.setFont(ft);		  
              Ttext_faut.setFont(ft);		  
		  
		  
		  
}

JLabel Sheader_2 ,Sfname,Slname,Spassword,Semail,Sfaculty;
	JPanel new_Student_add;
	JTextField Stext_fnam,Stext_name,Stext_pass,Stext_emil,Stext_faut;
	JButton Ssing_up;

public void add_new_Student()
{
	    new_Student_add=new JPanel();
		new_Student_add.setBounds(100,100,800,700);
		new_Student_add.setBackground(Color.orange);
		new_Student_add.setLayout(null);
		new_Student_add.addMouseListener(this);
		new_Student_add.setVisible(false);
		
				Font hft=new Font("",Font.BOLD,80); 
				Font ft=new Font("",Font.BOLD,30); 






				
Sheader_2        =new JLabel("Add Student");
Sfname    		=new JLabel("Student firstName");
Slname    		=new JLabel("Student LastName");
Spassword 	   =new JLabel("Student Faculty");
Semail    		=new JLabel("Student Email@");
Sfaculty  		=new JLabel("Auto Passward");
				
Sheader_2 	      .setBounds(152,05,795,85);
Sfname    	   .setBounds(10,150,350,35);
Slname    	   .setBounds(10,250,350,35);
Spassword 	      .setBounds(10,350,350,35);
Semail    	   .setBounds(10,450,350,35);
Sfaculty  	   .setBounds(10,550,350,35);
	   
Sheader_2 	      .setFont(hft);
Sfname    	   .setFont(ft);		
Slname    	   .setFont(ft);		
Spassword 	      .setFont(ft);		
Semail    	   .setFont(ft);		
Sfaculty  	   .setFont(ft);	
		  
		  Ssing_up=new JButton("Add Student");
		  Ssing_up.setBounds(300,600,250,35);
		  Ssing_up.setFont(ft);
		  Ssing_up.addMouseListener(this);
		
		
		   Stext_fnam=new JTextField("1");
		   Stext_name=new JTextField("2");
		   Stext_pass=new JTextField("3");
		   Stext_emil=new JTextField("4");
		   Stext_faut=new JTextField("5");
		   Stext_fnam.setBounds(410,150,350,35);
           Stext_name.setBounds(410,250,350,35);
           Stext_pass.setBounds(410,350,350,35);
           Stext_emil.setBounds(410,450,350,35);
           Stext_faut.setBounds(410,550,350,35);
           Stext_fnam.setFont(ft);
           Stext_name.setFont(ft);
           Stext_pass.setFont(ft);		  
           Stext_emil.setFont(ft);		  
           Stext_faut.setFont(ft);		  
		  
		  
		  
}
	public void mouseReleased(MouseEvent e){}
		public void mouseClicked(MouseEvent mk){}
					 public void mouseExited(MouseEvent mx){}

					public void mouseEntered(MouseEvent md){}

public void mousePressed( MouseEvent mo){
	if(mo.getSource()==Tbutton_login)
	{
		Panel1.setVisible(true);
		Panel_On_Subject_Log.setVisible(false);
		Panel_On_Student_Log.setVisible(false);
		Panel_On_Teacher_Log.setVisible(false);
		new_Teacher_add.setVisible(false);
						new_Student_add.setVisible(false);

	}
	if(mo.getSource()==create_new)
	{
		Panel1.setVisible(false);
		Panel_On_Subject_Log.setVisible(false);
		Panel_On_Student_Log.setVisible(false);
		Panel_On_Teacher_Log.setVisible(true);
		new_Teacher_add.setVisible(true);
				new_Student_add.setVisible(false);

	}
	
if(mo.getSource()==screate_new)
	{
		Panel1.setVisible(false);
		Panel_On_Subject_Log.setVisible(false);
		Panel_On_Teacher_Log.setVisible(false);
				new_Teacher_add.setVisible(false);

		Panel_On_Student_Log.setVisible(true);
		new_Student_add.setVisible(true);
	}



	if(mo.getSource()==teacher_log_button)
	{
		Panel_On_Teacher_Log.setVisible(true);
		new_Teacher_add.setVisible(false);
				new_Student_add.setVisible(false);

		Panel_On_Student_Log.setVisible(false);
		Panel_On_Subject_Log.setVisible(false);
		Panel1.setVisible(false);
	}
	if(mo.getSource()==student_log_button)
	{
		Panel_On_Student_Log.setVisible(true);
		Panel_On_Teacher_Log.setVisible(false);
		Panel_On_Subject_Log.setVisible(false);
		Panel1.setVisible(false);
		new_Teacher_add.setVisible(false);
						new_Student_add.setVisible(false);


	}
		if(mo.getSource()==sbutton_login)
		{
		Panel_On_Student_Log.setVisible(true);
		Panel_On_Teacher_Log.setVisible(false);
		Panel_On_Subject_Log.setVisible(false);
		/* 
		  Batch_Name.setVisible(true);
		Subject_name.setVisible(true);
		 message_box.setVisible(true);
		type_massage.setVisible(true); */
		
		Panel1.setVisible(true);
		Panel1.setBounds(100,100,800,800);
		new_Teacher_add.setVisible(false);
		new_Student_add.setVisible(false);
		}
}

}

class teacher_{
	
	public static void main(String [] args)
	{     try{
	  	   Login_page_for_teacher_and_student obj=new Login_page_for_teacher_and_student();
	  	   obj.add_new_Student();
	  	   obj.add_new_teacher();
	  	   obj.choice_button_pan();
	  	   obj.Student_Log();
	  	   obj.Teacher_Subject();
	  	   obj.Teacher_Log();
	  	   obj.Login_frame();
		   
	         }
    	catch(Exception e)
    	{
    		JOptionPane.showMessageDialog(null,""+e);
    	}
}
	
} 