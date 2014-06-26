package cn.zhucongqi.smartfox_custom_login.clientrequest;

import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.data.ISFSObject;
import com.smartfoxserver.v2.entities.data.SFSObject;
import com.smartfoxserver.v2.extensions.BaseClientRequestHandler;

public class OOClientRequestHandle extends BaseClientRequestHandler {

	@Override
	public void handleClientRequest(User paramUser, ISFSObject paramISFSObject) {
		String data = paramISFSObject.getUtfString("data");
		
		ISFSObject parserObj = SFSObject.newFromJsonData(data);
		System.out.println("username : "+parserObj.getUtfString("username"));
		System.out.println("address :"+parserObj.getUtfString("address"));
//		String from = "brucezcq@gmail.com";
//		String to = "zhucongqi@comisys.net";
//		Email myEmail = new SFSEmail(from, to, "Test mail", "Hello from SFS2X");
//		try {
//			SmartFoxServer.getInstance().getMailService().sendMail(myEmail);
//		} catch (MessagingException e) {
//			e.printStackTrace();
//			trace(e.getMessage());
//		}
		send("zcq", parserObj, paramUser);
	}

}
