package APImain;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODataStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos= new FileOutputStream("a.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		try {
			dos.writeBoolean(true);
			dos.writeByte((byte)123);
			dos.writeChar('J');
			dos.writeDouble(3.1415926);
			dos.writeFloat(2.222f);
			dos.writeInt(123);
		} finally{
			dos.close();
		}
		FileInputStream fis=new FileInputStream("a.txt");
		DataInputStream dis=new DataInputStream(fis);
		try{
		System.out.println("\t"+dis.readBoolean());
		System.out.println("\t"+dis.readByte());
		System.out.println("\t"+dis.readChar());
		System.out.println("\t"+dis.readDouble());
		System.out.println("\t"+dis.readFloat());
		System.out.println("\t"+dis.readInt());
		}
		finally{
			dis.close();
		}
	
	}

}
