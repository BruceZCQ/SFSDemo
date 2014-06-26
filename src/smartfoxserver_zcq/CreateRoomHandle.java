package smartfoxserver_zcq;

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
System.out.println("user ===== "+paramUser);
		//test create room
	Room room = this.getParentExtension().getParentZone().getRoomByName("zcqroom");
	if (room == null) {
		CreateRoomSettings rootSetting = new CreateRoomSettings();
		rootSetting.setName("zcqroom");
		rootSetting.setPassword("123456");
		rootSetting.setMaxUsers(1000);
		rootSetting.setMaxVariablesAllowed(999);
		try {
			 room = this.getApi().createRoom(this.getParentExtension().getParentZone(), rootSetting,paramUser);
		} catch (SFSCreateRoomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	Room lastJoinedroom = paramUser.getLastJoinedRoom();
	if (!room.equals(lastJoinedroom)) {

		try {
			this.getApi().joinRoom(paramUser, room,"123456",false,null);
		} catch (SFSJoinRoomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	this.getApi().sendPublicMessage(room, paramUser, "zzzzz", null);
	
	}
}
