package sfs2x.extension.test.people;

import java.sql.SQLException;

import com.smartfoxserver.v2.db.IDBManager;
import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.data.ISFSArray;
import com.smartfoxserver.v2.entities.data.ISFSObject;
import com.smartfoxserver.v2.entities.data.SFSObject;
import com.smartfoxserver.v2.extensions.BaseClientRequestHandler;
import com.smartfoxserver.v2.extensions.ExtensionLogLevel;

public class GetPeopleHandler extends BaseClientRequestHandler
{
	@Override
	public void handleClientRequest(User sender, ISFSObject params)
	{
//		IDBManager dbManager = getParentExtension().getParentZone().getDBManager();
//		String sql = "SELECT * FROM people";
//		
//		try
//        {
//			// Obtain a resultset
//	        ISFSArray res = dbManager.executeQuery(sql, new Object[] {});
//	        
//	        // Populate the response parameters
//	        ISFSObject response = new SFSObject();
//	        response.putSFSArray("people", res);
//	        
//	        // Send back to requester
//	        send("getPeople", response, sender);
//        }
//        catch (SQLException e)
//        {
//	        trace(ExtensionLogLevel.WARN, "SQL Failed: " + e.toString());
//        }
		ISFSObject response = new SFSObject();
        send("getPeople", response, sender);
	}
}
