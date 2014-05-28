/**
 * 
 */
package cn.zhucongqi.clientrequest;

import java.sql.SQLException;


import com.smartfoxserver.v2.db.IDBManager;
import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.data.ISFSArray;
import com.smartfoxserver.v2.entities.data.ISFSObject;
import com.smartfoxserver.v2.entities.data.SFSObject;
import com.smartfoxserver.v2.extensions.BaseClientRequestHandler;
import com.smartfoxserver.v2.extensions.ExtensionLogLevel;

/**
 * @author BruceZCQ
 *
 */
public class CustomLoginRequest extends BaseClientRequestHandler {

	/* (non-Javadoc)
	 * @see com.smartfoxserver.v2.extensions.IClientRequestHandler#handleClientRequest(com.smartfoxserver.v2.entities.User, com.smartfoxserver.v2.entities.data.ISFSObject)
	 */
	@Override
	public void handleClientRequest(User paramUser, ISFSObject paramISFSObject) {
		  String sql = "SELECT * FROM zcq";

      	IDBManager dbManager = this.getParentExtension().getParentZone().getDBManager();
	        try
	        {
	            // Obtain a resultset
	        	System.out.println("fuck shit=======");
	        	ISFSArray res = dbManager.executeQuery(sql, new Object[] {});
	             
	            // Populate the response parameters
	            ISFSObject response = new SFSObject();
	            response.putSFSArray("people", res);
	             
	            // Send back to requester
	            send("zcqs", response, paramUser);
	        }
	        catch (SQLException e)
	        {
	            trace(ExtensionLogLevel.WARN, "SQL Failed: " + e.toString());
	        }
	}

}
