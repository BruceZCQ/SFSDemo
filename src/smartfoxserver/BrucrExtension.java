package smartfoxserver;

import com.smartfoxserver.v2.core.SFSEventType;
import com.smartfoxserver.v2.extensions.SFSExtension;

public class BrucrExtension extends SFSExtension{

	@Override
	public void init() {
		this.addEventHandler(SFSEventType.USER_LOGIN, OOLoginEventHandle.class);
		addRequestHandler("zcq", BruceHandle.class);
	}

}
