package cn.zhucongqi.extension;

import com.smartfoxserver.bitswarm.sessions.Session;
import com.smartfoxserver.bitswarm.sessions.SessionType;

public class printSession {
	public static void main(String args[])
	{

		Session s = new Session();
		s.setLoggedIn(true);
		s.setType(SessionType.DEFAULT);
		s.set
		System.out.println(s);
	}
}
