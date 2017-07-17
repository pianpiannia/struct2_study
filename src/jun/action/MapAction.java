package jun.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import jun.entity.User;

public class MapAction extends ActionSupport {
	
	private Map<String,User> map;
	

	public Map<String, User> getMap() {
		return map;
	}


	public void setMap(Map<String, User> map) {
		this.map = map;
	}


	@Override
	public String execute() throws Exception {
		System.out.println(map);
		return NONE;
	}

	
}
