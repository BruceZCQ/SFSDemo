package cn.zhucongqi.extension;

import com.smartfoxserver.v2.api.CreateRoomSettings;
import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.data.ISFSObject;
import com.smartfoxserver.v2.exceptions.SFSCreateRoomException;
import com.smartfoxserver.v2.extensions.SFSExtension;

public class CreateRoomDemo extends SFSExtension {

	@Override
	public void init() {
		addRequestHandler("createroom", CreateRoomHandle.class);
	}
}
