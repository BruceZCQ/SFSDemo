/**
 * 
 */
package cn.zhucongqi.smartfox_custom_login.extension;

import cn.zhucongqi.smartfox_custom_login.clientrequest.OOClientRequestHandle;
import cn.zhucongqi.smartfox_custom_login.serverevent.OOLoginEventHandle;

import com.smartfoxserver.v2.core.SFSEventType;
import com.smartfoxserver.v2.extensions.SFSExtension;

/**
 * @author BruceZCQ
 *
 */
public class OOLoginExtension extends SFSExtension {

	/* (non-Javadoc)
	 * @see com.smartfoxserver.v2.extensions.ISFSExtension#init()
	 */
	@Override
	public void init() {
		this.addEventHandler(SFSEventType.USER_LOGIN, OOLoginEventHandle.class);
		this.addRequestHandler("zcq", OOClientRequestHandle.class);
	}

}
