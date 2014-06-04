/**
 * 
 */
package cn.zhucongqi.extension;

import cn.zhucongqi.clientrequest.CustomLoginRequest;
import cn.zhucongqi.clientrequest.LoginEventHandler;

import com.smartfoxserver.v2.api.CreateRoomSettings;
import com.smartfoxserver.v2.core.SFSEventType;
import com.smartfoxserver.v2.extensions.SFSExtension;

/**
 * @author BruceZCQ
 *
 */
public class SFSDemoExtension extends SFSExtension {

	/* (non-Javadoc)
	 * @see com.smartfoxserver.v2.extensions.ISFSExtension#init()
	 */
//	private DBHelper dbHelper = null;
	@Override
	public void init() {
//		dbHelper = new DBHelper(this);
		
		
		
		addRequestHandler("LoginRequest", CustomLoginRequest.class);
		addEventHandler(SFSEventType.USER_LOGIN, LoginEventHandler.class);
	}
		
//	public void handleServerEvent(ISFSEvent event)
//	{
//		System.out.println("system server event");
//	}
}
