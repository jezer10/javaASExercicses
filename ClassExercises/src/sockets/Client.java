package sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
	
	private Socket socket=null;
	
	private DataInputStream in= null;
	
	private DataOutputStream out= null;

	private Client(String address,int port) {
		try {
			socket = new Socket(address,port);
			System.out.println("Connecting");
			in = new DataInputStream(System.in);
			out = new DataOutputStream(socket.getOutputStream());
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		String line ="";
		while(!line.equals("s")) {
			try {
				line= in.readUTF();
				out.writeUTF(line);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		try {
			in.close();
			out.close();
			socket.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		Client client = new Client("127.0.0.1",8080);
	}
}
