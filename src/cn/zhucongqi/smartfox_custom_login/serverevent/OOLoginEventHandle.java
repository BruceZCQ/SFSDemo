/**
 * 
 */
package cn.zhucongqi.smartfox_custom_login.serverevent;


import cn.zhucongqi.smartfox_custom_login.eventerror.OOEventErrorCode;

import com.smartfoxserver.v2.core.ISFSEvent;
import com.smartfoxserver.v2.core.SFSEventParam;
import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.exceptions.SFSErrorCode;
import com.smartfoxserver.v2.exceptions.SFSErrorData;
import com.smartfoxserver.v2.exceptions.SFSException;
import com.smartfoxserver.v2.exceptions.SFSLoginException;
import com.smartfoxserver.v2.extensions.BaseServerEventHandler;

/**
 * @author BruceZCQ
 *
 */
public class OOLoginEventHandle extends BaseServerEventHandler {

	/* (non-Javadoc)
	 * @see com.smartfoxserver.v2.extensions.IServerEventHandler#handleServerEvent(com.smartfoxserver.v2.core.ISFSEvent)
	 */
	@Override
	public void handleServerEvent(ISFSEvent event) throws SFSException {
		System.out.println("===custom login====");
		String username = (String)event.getParameter(SFSEventParam.LOGIN_NAME);
//		SFSErrorData data = new SFSErrorData(SFSErrorCode.LOGIN_BAD_USERNAME);
		SFSErrorData data = new SFSErrorData(new OOEventErrorCode(2));
		User user = (User)event.getParameter(SFSEventParam.USER);
		System.out.println(user);
		data.addParameter(username);
		throw new SFSLoginException("%d", data);
	}

}
