package cn.zhucongqi.smartfox_custom_login.eventerror;

import com.smartfoxserver.v2.exceptions.*;

public class OOEventErrorCode implements IErrorCode
{
//	OOLoginError(1012);
	
	private short id = -100;
	
	public OOEventErrorCode(int id) { this.id = ((short)id); }
	
	@Override
	public short getId() {
		return this.id;
	}

}
