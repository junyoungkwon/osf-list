package osf.list.controller;

import java.util.HashMap;
import java.util.Map;

import osf.list.service.FoodService;
import osf.list.service.impl.FoodServiceImpl;

public class FoodController {
	private FoodService fs = new FoodServiceImpl();
	
	public void doGet(Map<String,String> req, Map<String,Object> res) {
		String cmd = req.get("cmd");
		String number = req.get("number");
		Map<String,String>food = new HashMap<>();
		food.put("번호",number);
		if("foodlist".equals(cmd)) {
			res.put("foodlist", fs.selectFoodList());
		} else if("food".equals(cmd)) {
			res.put("food", fs.selectFood(food));
		}
	}
	
	public void doPost(Map<String,String> req, Map<String,Object> res) {
		String cmd = req.get("cmd");
		String number = req.get("number");
		String name = req.get("name");
		String price = req.get("price");
		Map<String,String> food = new HashMap<>();
		food.put("번호",number);
		food.put("이름",name);
		food.put("가격",price);
		if("insert".equals(cmd)) {
			res.put("insert", fs.insertFood(food));
			
		}else if("food".equals(cmd)) {
			res.put("food",fs.selectFood(food));
		}
	}
}
