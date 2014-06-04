package cn.zhucongqi.extension;

import com.smartfoxserver.v2.api.CreateRoomSettings;
import com.smartfoxserver.v2.entities.Room;
import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.data.ISFSObject;
import com.smartfoxserver.v2.exceptions.SFSCreateRoomException;
import com.smartfoxserver.v2.exceptions.SFSJoinRoomException;
import com.smartfoxserver.v2.extensions.BaseClientRequestHandler;

public class CreateRoomHandle extends BaseClientRequestHandler {

	@Override
	public void handleClientRequest(User paramUser, ISFSObject paramISFSObject) {
		// TODO Auto-generated method stub

		//test create room
		
		CreateRoomSettings rootSetting = new CreateRoomSettings();
		rootSetting.setName("create new room");
		rootSetting.setPassword("123456");
		rootSetting.setMaxUsers(1000);
		rootSetting.setMaxVariablesAllowed(999);
		try {
			Room room = this.getApi().createRoom(this.getParentExtension().getParentZone(), rootSetting, paramUser);
			this.getApi().joinRoom(paramUser, room,"123456",false,null);
		} catch (SFSCreateRoomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SFSJoinRoomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
