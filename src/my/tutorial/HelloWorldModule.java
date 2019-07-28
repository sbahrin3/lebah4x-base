package my.tutorial;

import lebah.portal.action.Command;
import lebah.portal.action.LebahModule;

public class HelloWorldModule extends LebahModule {
	
	private String path = "tutorial/helloWorld";

	@Override
	public String start() {
		
		return path + "/start.vm";
	}
	
	@Command("sayHello")
	public String sayHello() {
		
		String userName = getParam("userName");
		
		context.put("userName", userName);
		
		return path + "/sayHello.vm";
	}

}
