package jun.data;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import jun.entity.User;
/**
 * ģ��������ȡ������
 * @author jun
 *
 */
public class DateDemo2Action extends ActionSupport implements ModelDriven<User>{

	private User user = new User();
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	public String execute() throws Exception {
		
		System.out.println(user);
		return NONE;
	}

	

	
}
