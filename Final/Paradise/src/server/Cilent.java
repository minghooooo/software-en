package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;


import model.Commodity;
import model.User;

public class Cilent implements Protocal{

	private static Socket s;
	private static ObjectOutputStream oos;
	private static ObjectInputStream ois;
	
	private static void init() throws UnknownHostException, IOException{
		s = new Socket("49.234.231.147",8889);
		oos = new ObjectOutputStream(s.getOutputStream());
		ois = new ObjectInputStream(s.getInputStream());
	}
	
	public static User login(String uid,String upw) throws UnknownHostException, IOException, ClassNotFoundException{
		  init();
	      oos.writeInt(LOGIN);
	      oos.flush();
	      oos.writeUTF(uid);
	      oos.flush();
	      oos.writeUTF(upw);
	      oos.flush();
	      User a = (User) ois.readObject();
	      return a;
	}
	
	public static void Register(User u) throws IOException,ClassNotFoundException {
		init();
		oos.writeInt(REGISTER);
		oos.flush();
		oos.writeObject(u);
		oos.flush();
	}

	public void buyc1(int number,User u,Commodity c) throws ClassNotFoundException, UnknownHostException, IOException{
		init();
		oos.writeInt(BUY1);
		oos.flush();
		oos.writeInt(number);
		oos.flush();
		oos.writeObject(u);
		oos.flush();
		oos.writeObject(c);
		oos.flush();
	}
	
	public void buyc2(int number,User u,Commodity c) throws ClassNotFoundException, UnknownHostException, IOException{
		init();
		oos.writeInt(BUY2);
		oos.flush();
		oos.writeInt(number);
		oos.flush();
		oos.writeObject(u);
		oos.flush();
		oos.writeObject(c);
		oos.flush();
	}
	
	public void buyc3(int number,User u,Commodity c) throws ClassNotFoundException, UnknownHostException, IOException{
		init();
		oos.writeInt(BUY3);
		oos.flush();
		oos.writeInt(number);
		oos.flush();
		oos.writeObject(u);
		oos.flush();
		oos.writeObject(c);
		oos.flush();
	}
	
	public void buyc4(int number,User u,Commodity c) throws ClassNotFoundException, UnknownHostException, IOException{
		init();
		oos.writeInt(BUY4);
		oos.flush();
		oos.writeInt(number);
		oos.flush();
		oos.writeObject(u);
		oos.flush();
		oos.writeObject(c);
		oos.flush();
	}
	
	public void buyc5(int number,User u,Commodity c) throws ClassNotFoundException, UnknownHostException, IOException{
		init();
		oos.writeInt(BUY5);
		oos.flush();
		oos.writeInt(number);
		oos.flush();
		oos.writeObject(u);
		oos.flush();
		oos.writeObject(c);
		oos.flush();
	}
	
	public void buyc6(int number,User u,Commodity c) throws ClassNotFoundException, UnknownHostException, IOException{
		init();
		oos.writeInt(BUY6);
		oos.flush();
		oos.writeInt(number);
		oos.flush();
		oos.writeObject(u);
		oos.flush();
		oos.writeObject(c);
		oos.flush();
	}
	
	public void gamewin(int point,User u) throws UnknownHostException, IOException{
		init();
		oos.writeInt(GAMEWIN);
		oos.flush();
		oos.writeInt(point);
		oos.flush();
		oos.writeObject(u);
		oos.flush();
	}
	
	public void gamelose(User u) throws UnknownHostException, IOException{
		init();
		oos.writeInt(GAMELOSE);
		oos.flush();
		oos.writeObject(u);
		oos.flush();
	}
	
	public void gamedraw(User u) throws UnknownHostException, IOException{
		init();
		oos.writeInt(GAMEDRAW);
		oos.flush();
		oos.writeObject(u);
		oos.flush();
	}
	

	public void pointChange(int point,User u) throws UnknownHostException, IOException{
		init();
		oos.writeInt(POINTCHANGE);
		oos.flush();
		oos.writeInt(point);
		oos.flush();
		oos.writeObject(u);
		oos.flush();
	}
	
	public void bet(int point,User u) throws UnknownHostException, IOException{
		init();
		oos.writeInt(BET);
		oos.flush();
		oos.writeInt(point);
		oos.flush();
		oos.writeObject(u);
		oos.flush();
	}
}
	
