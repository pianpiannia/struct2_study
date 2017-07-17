package jun.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import jun.entity.User;

public class Form4DemoAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		//1。获取表单数据
		HttpServletRequest request = ServletActionContext.getRequest();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		
		//2.封装到实体类
		User user = new User();
		user.setUsername(username);
		user.setUsername(password);
		user.setUsername(address);
	
		System.out.println(user);
		return NONE;
	}

	
}
