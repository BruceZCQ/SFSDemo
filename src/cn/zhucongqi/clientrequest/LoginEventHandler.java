package cn.zhucongqi.clientrequest;

import com.smartfoxserver.v2.core.ISFSEvent;
import com.smartfoxserver.v2.core.SFSConstants;
import com.smartfoxserver.v2.core.SFSEventParam;
import com.smartfoxserver.v2.entities.data.ISFSObject;
import com.smartfoxserver.v2.exceptions.SFSErrorCode;
import com.smartfoxserver.v2.exceptions.SFSErrorData;
import com.smartfoxserver.v2.exceptions.SFSException;
import com.smartfoxserver.v2.exceptions.SFSLoginException;
import com.smartfoxserver.v2.extensions.BaseServerEventHandler;

public class LoginEventHandler extends BaseServerEventHandler {

	@Override
	public void handleServerEvent(ISFSEvent event) throws SFSException {
		System.out.println("=======custom login=======");
		String name = (String) event.getParameter(SFSEventParam.LOGIN_NAME);

         if (!"zcq".equals(name)) {
     		SFSErrorData errData = new SFSErrorData(SFSErrorCode.HANDSHAKE_API_OBSOLETE);
            errData.addParameter(name);
             // Fire a Login exception
             throw new SFSLoginException("Gonzo and Kermit are not allowed in this Zone!", errData); 	
		}else{
			ISFSObject outData = (ISFSObject) event.getParameter(SFSEventParam.LOGIN_OUT_DATA);
			String newName = "User-" + name;
			outData.putUtfString(SFSConstants.NEW_LOGIN_NAME, newName);
		}
		
	}

}
