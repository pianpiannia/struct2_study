package jun.data;

import com.opensymphony.xwork2.ActionSupport;

import jun.entity.User;
/**
 * ʹ�ñ��ʽ��װ
 * @author jun
 *
 */
public class DateDemo3Action extends ActionSupport {

	private User user;
	
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String execute() throws Exception {
		System.out.println(user);
		return NONE;
	}

	
}
