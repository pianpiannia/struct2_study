package jun.form;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Form2DemoAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		
		/*HttpServletRequest request = ServletActionContext.getRequest();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		
		System.out.println(username+","+password+","+address);*/
		
		//����3�������
		//1.request��
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("req", "reqValue");
		
		//2.session��
		HttpSession session = request.getSession();
		session.setAttribute("sess", "sessValue");
		
		//3.ServletContext��
		ServletContext context = ServletActionContext.getServletContext();
		context.setAttribute("contextname", "contextValue");
		return NONE;
	}

	
}
