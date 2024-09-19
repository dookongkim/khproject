package khProject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class InfoWriter {
	public void infoWrite(User user) {

		String path="c:/KhProject/"+user.getId().trim()+"/userinfo.sav";

		File f1=new File("c:/KhProject/");
		if(!f1.exists()) 
			f1.mkdirs();


		File f2=new File(f1,user.getId().trim());
		if(!f2.exists()) 
			f2.mkdirs();

		FileOutputStream fos=null;
		ObjectOutputStream oos=null;

		try {
			fos=new FileOutputStream(path);
			oos=new ObjectOutputStream(fos);
			
			oos.writeObject(user);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}try {
			if(oos!=null)
				oos.close();
			if(fos!=null)
				fos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}//infoWrite

}
