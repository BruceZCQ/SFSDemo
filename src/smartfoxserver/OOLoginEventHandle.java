/**
 * 
 */
package smartfoxserver;



import com.smartfoxserver.v2.core.ISFSEvent;
import com.smartfoxserver.v2.core.SFSEventParam;
import com.smartfoxserver.v2.entities.data.SFSObject;
import com.smartfoxserver.v2.exceptions.SFSException;
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
		SFSObject o = (SFSObject)event.getParameter(SFSEventParam.LOGIN_IN_DATA);
		System.out.println("event ==="+event+o.getUtfString("zcq"));
	}

}
