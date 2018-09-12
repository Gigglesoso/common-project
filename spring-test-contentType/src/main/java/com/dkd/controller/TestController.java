package com.dkd.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dkd.entity.User;

@RestController
public class TestController {
	
	
	/**
	 * 这种方式接收参数是前台提交使用的contentType：x-www-form-urlencoded
	 * 传递参数是传递的key-value；只能上传键值对,并且键值对都是间隔分开的。
	 * 后台使用相应的属性名称接收即可，跟直接url后面拼接参数接收方法一样
	 * @param id
	 * @param name
	 * @param age
	 * @param gender
	 * @return
	 */
	@RequestMapping("/test1")
	public User test1(String id,String name,Integer age,String gender) {
		User user = new User();
		user.setId(id);
		user.setAge(age);
		user.setGender(gender);
		user.setName(name);
		return user;
	}
	
	/**
	 * 这种方式前台使用contentType：application/json提交
	 * 提交的数据格式为：
	 * {
     *	"id": "id",
     *	"name": "tom",
     *	"age": 12,
     *	"gender": "male"
	 *	}
	 *  这种格式要是后台有相应的实体属性都能对应可以直接使用实体接收，这种数据提交方式适合传递整个实体
	 * @param user
	 * @return
	 */
	@RequestMapping("/test2")
	public User test2(@RequestBody User user) {
		return user;
	}
	
	/**
	 * 这种方式前台使用contentType：application/json提交
	 * 提交的数据格式为：
	 * {
  	 *	"ids": ["id1","id2","id3","id4"],
   	 *	"test":"anotherParam"
	 *	}
	 * @param map
	 * @return
	 * 后台可以使用Map接收这种复杂类型的参数，也可以定义相应的vo实体接收
	 */
	@RequestMapping("/test3")
	@SuppressWarnings("unchecked")
	public String test3(@RequestBody Map<String,Object> map) {
		List<String> ids = (List<String>)map.get("ids");
		String test = (String)map.get("test");
		ids.stream().forEach(x->System.out.println(x));
		return ids.toString() + test;
	}
	
	/**
	 * 使用的contentType：multipart/form-data
	 * 这个和x-www-form-urlencoded的区别在于，form-data可以以key-value形式上传文件；而前者只能传递key-value
	 * @param test
	 * @param id
	 * @return
	 * 由于是key-value传递，后台直接使用相应的名称接收即可，文件需要使用MultipartFile接收
	 */
	@RequestMapping("/test4")
	public String test4(MultipartFile test,String id) {
		String originalFilename = test.getOriginalFilename();
		return "id为"+id+"的文件名称为："+originalFilename;
	}
	
}
