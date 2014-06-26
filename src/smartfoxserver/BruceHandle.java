package smartfoxserver;

import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.data.ISFSObject;
import com.smartfoxserver.v2.entities.data.SFSObject;
import com.smartfoxserver.v2.extensions.BaseClientRequestHandler;

public class BruceHandle extends BaseClientRequestHandler{

	@Override
	public void handleClientRequest(User arg0, ISFSObject arg1) {
		SFSObject o = new SFSObject();
		o.putUtfString("zcq", "zcqaaaaa");

		send("zcq",arg1,arg0);
	}

}
