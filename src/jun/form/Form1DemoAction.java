package jun.form;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Form1DemoAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		
		//第一种方式使用ActionContext获取
		//1.获取ActionContext对象
		ActionContext context = ActionContext.getContext();
		//2调用方法得到表单数据
		//key里是表单输入项name属性值，value是输入的值
		Map<String,Object> map = context.getParameters();
		
		Set<String> keys = map.keySet();
		for(String key:keys){
			//根据key得到value
			//数组形式，因为输入项里可能有复选框形式
			Object[] obj = (Object[]) map.get(key);
			System.out.println(Arrays.toString(obj));
		}
		return NONE;
	}

	
}
