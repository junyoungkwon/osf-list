package osf.list;

import java.util.HashMap;
import java.util.Map;

import osf.list.controller.FoodController;

public class Execute {

	public static void main(String[] args) {
		FoodController fc = new FoodController();
		Map<String,String> req = new HashMap<>();
		Map<String,Object> res = new HashMap<>();
		req.put("cmd", "food");
		req.put("number","2");
		fc.doGet(req, res);
		System.out.println(res);
		
//		req.put("cmd", "insert");
//		req.put("number", "5");
//		req.put("name", "연어");
//		req.put("price", "25000");
//		fc.doPost(req,  res);
		
//		req.put("cmd", "foodlist");
//		fc.doGet(req, res);
//		System.out.println(res);
		
		req = new HashMap<>();
		res = new HashMap<>();
		req.put("cmd","update");
		req.put("number","4");
		req.put("name","해장국");
		fc.doPost(req, res);
		System.out.println(res);
		
		req = new HashMap<>();
		res = new HashMap<>();
		req.put("cmd","delete");
		req.put("number","1");
		fc.doPost(req, res);
		System.out.println(res);
		
		req = new HashMap<>();
		res = new HashMap<>();
		req.put("cmd","foodlist");
		fc.doGet(req, res);
		System.out.println(res);
	}
}
//execute는 controller로 넘기면 컨트롤러는 인서트를 요청, 데이터를 입력한다. 서비스를 호출
// 서비스는 그에 맞는 리파지토리를 만듬. 