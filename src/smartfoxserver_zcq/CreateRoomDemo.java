package smartfoxserver_zcq;

import com.smartfoxserver.v2.extensions.SFSExtension;

public class CreateRoomDemo extends SFSExtension {

	@Override
	public void init() {
		addRequestHandler("createroom", CreateRoomHandle.class);
	}
}
