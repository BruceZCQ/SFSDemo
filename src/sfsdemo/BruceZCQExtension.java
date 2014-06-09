package sfsdemo;

import com.smartfoxserver.v2.extensions.SFSExtension;


public class BruceZCQExtension extends SFSExtension {

	@Override
	public void init() {
//		trace(StaticData.getNames());
		this.addRequestHandler("mail", SendMail.class);
	}
	

//	private static final String	P_MESSAGE		= "message";
//	private static final String	MAIL_TO			= "mail@mail.ru";
//	private static final String	MAIL_SUBJECT	= "Support";
//
//
//	public void handleClientRequest(User user, ISFSObject params) {
//
//		MailerSettings settings = SmartFoxServer.getInstance().getConfigurator().getServerSettings().mailer;
//
//		if (!settings.isActive) {
//			trace("{sendMail} !isActive");
//			return;
//		}
//
//		if (!params.containsKey(P_MESSAGE)) throw new SFSRuntimeException("Invalid request");
//
//		String message = params.getUtfString(P_MESSAGE);
//
//		String mailMessage = message;
//
//		try {
//			mailMessage = new String(message.getBytes(), "ISO-8859-1");
//		}
//		catch (UnsupportedEncodingException e1) {
//			e1.printStackTrace();
//		}
//
//		IMailerCallbackHandler callback = new IMailerCallbackHandler() {
//
//			@Override
//			public void onSuccess(Email email) {
//				trace("{sendMail} onSuccess");
//			}
//
//
//			@Override
//			public void onError(Email email, Exception e) {
//				trace("{sendMail} onError");
//			}
//		};
//
//		SFSEmail myEmail = new SFSEmail(settings.mailUser, MAIL_TO, MAIL_SUBJECT, mailMessage);
//		try {
//			SmartFoxServer.getInstance().getMailService().sendMail(myEmail, callback);
//		}
//		catch (MessagingException e) {
//			trace("!sendMail");
//			// e.printStackTrace();
//		}
//
//	}
//	 private class TaskRunner implements Runnable
//	    {
//	        private int runningCycles = 0;
//	         
//	        public void run()
//	        {
//	            runningCycles++;    
//	            trace("Inside the running task. Cycle:  " + runningCycles);
//	             
//	            if (runningCycles >= 10)
//	            {
//	                trace("Time to stop the task!");
//	                taskHandle.cancel(true);
//	            }
//	        }
//	    }
//	     
//	    // Keeps a reference to the task execution
//	    ScheduledFuture<?> taskHandle;
//	     
//	    @Override
//	    public void init()
//	    {
//	        SmartFoxServer sfs = SmartFoxServer.getInstance();
//	         
//	        // Schedule the task to run every second, with no initial delay
//	        taskHandle = sfs.getTaskScheduler().scheduleAtFixedRate(new TaskRunner(), 0, 1, TimeUnit.SECONDS);
//	    }

}
