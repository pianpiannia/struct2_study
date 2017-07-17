package jun.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import jun.entity.User;

public class ListAction extends ActionSupport {
	
	private List<User> list;

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(list);
		return NONE;
	}

	
}
