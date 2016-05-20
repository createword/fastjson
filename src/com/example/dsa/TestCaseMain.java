package com.example.dsa;

import org.json.JSONException;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import junit.framework.TestCase;

public class TestCaseMain extends TestCase {
/*
 * 适用于像后台传json
 */
	public void test() {
 
		base b = new base();
		b.setAge("12");
		b.setName("zhm");
		String tx = JSON.toJSONString(b);//序列化
		System.out.println(tx);
		System.out.println(JSONObject.parseObject(tx, base.class).getAge());//反序列化
	}
	
	
	/*
	 package com.app;

import java.io.Serializable;

public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String name ;
    private String age  ;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
}
复制代码
 

复制代码
   User user1 = new User() ;
   user1.setName( "jack" ) ;
   user1.setAge( "30" );
        
   User user2 = new User() ;
   user2.setName( "sam" ) ;
   user2.setAge( "45" );
        
   List<User> list = new ArrayList<User>() ;
   list.add( user1 ) ;
   list.add( user2 ) ;
        
   HashMap<String, Object> map = new HashMap<String, Object>();  
   map.put( "data", list ) ;
        
   String string = JSON.toJSONString( map ) ;
        
   System.out.println( "ssss" + string );
复制代码
运行结果：{"data":[{"age":"30","name":"jack"},{"age":"45","name":"sam"}]}

 
	 */


}
