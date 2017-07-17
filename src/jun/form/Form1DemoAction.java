package jun.form;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Form1DemoAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		
		//��һ�ַ�ʽʹ��ActionContext��ȡ
		//1.��ȡActionContext����
		ActionContext context = ActionContext.getContext();
		//2���÷����õ�������
		//key���Ǳ�������name����ֵ��value�������ֵ
		Map<String,Object> map = context.getParameters();
		
		Set<String> keys = map.keySet();
		for(String key:keys){
			//����key�õ�value
			//������ʽ����Ϊ������������и�ѡ����ʽ
			Object[] obj = (Object[]) map.get(key);
			System.out.println(Arrays.toString(obj));
		}
		return NONE;
	}

	
}
