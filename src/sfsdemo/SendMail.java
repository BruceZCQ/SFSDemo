package sfsdemo;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
//import javax.mail.MessagingException;



//import com.smartfoxserver.v2.SmartFoxServer;
//import com.smartfoxserver.v2.entities.Email;
//import com.smartfoxserver.v2.entities.SFSEmail;
import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.data.ISFSObject;
//import com.smartfoxserver.v2.entities.data.SFSObject;
import com.smartfoxserver.v2.extensions.BaseClientRequestHandler;
import com.smartfoxserver.v2.util.ClientDisconnectionReason;

public class SendMail extends BaseClientRequestHandler {

	@Override
	public void handleClientRequest(User paramUser, ISFSObject paramISFSObject){
		

		System.out.println("names ========"+StaticData.getNames());
		StaticData.addName("zcq");
		
		this.getApi().disconnectUser(paramUser,ClientDisconnectionReason.IDLE);
		
		byte[] bytearray = paramISFSObject.getByteArray("img");
		try {
			BufferedImage imag=ImageIO.read(new ByteArrayInputStream(bytearray));
			File imagesDir = new File("images","snap.jpg");
			File parent = imagesDir.getParentFile();
			if (!parent.exists()){
				parent.mkdirs();
			}
			ImageIO.write(imag, "jpg", new File("images","snap.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		String from = "brucezcq@gmail.com";
//		String to = "zhucongqi@comisys.net";
//		Email myEmail = new SFSEmail(from, to, "Test mail", "Hello from SFS2X");
//		try {
//			SmartFoxServer.getInstance().getMailService().sendMail(myEmail);
//		} catch (MessagingException e) {
//			e.printStackTrace();
//			trace(e.getMessage());
//		}
//		SFSObject params = new SFSObject();
//		send("cmd", params, paramUser);
	}
}
