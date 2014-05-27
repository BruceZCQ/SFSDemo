/**
 * 
 */
package cn.zhucongqi.db;

import com.smartfoxserver.v2.db.IDBManager;
import com.smartfoxserver.v2.extensions.SFSExtension;

/**
 * @author BruceZCQ
 *
 */
public class DBHelper {
	
	private IDBManager dbManager = null;
	
	public DBHelper(SFSExtension extension)
	{
		dbManager =  extension.getParentZone().getDBManager();;
	}
	
}
