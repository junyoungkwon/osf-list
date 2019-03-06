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
		
//		req = new HashMap<>();
//		res = new HashMap<>();
//		req.put("cmd","foodlist");
//		fc.doGet(req, res);
//		System.out.println(res);
	}
}
