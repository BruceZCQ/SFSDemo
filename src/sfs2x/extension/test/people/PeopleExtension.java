package sfs2x.extension.test.people;

import com.smartfoxserver.v2.extensions.SFSExtension;

public class PeopleExtension extends SFSExtension
{
	@Override
	public void init()
	{
		trace("People Example Started!");
		addRequestHandler("getPeople", GetPeopleHandler.class);
	}
	
	@Override
	public void destroy()
	{
		trace("People Example Stopped!");
	    super.destroy();
	}
}
