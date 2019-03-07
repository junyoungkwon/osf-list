package osf.list.controller;

import java.util.Map;

import osf.list.service.FoodService;
import osf.list.service.impl.FoodServiceImpl;
import osf.list.vo.FoodVO;

public class FoodController {
	private FoodService fs = new FoodServiceImpl();
	
	public void doGet(Map<String,String> req, Map<String,Object> res) {
		String cmd = req.get("cmd");
		String number = req.get("number");
		FoodVO food = new FoodVO();
		food.setNumber(Integer.parseInt(number));
		if("foodlist".equals(cmd)) {
			res.put("foodlist", fs.selectFoodList());
		} else if("food".equals(cmd)) {
			food.setNumber(Integer.parseInt(number));
			res.put("food", fs.selectFood(food));
		}
	}
	
	public void doPost(Map<String,String> req, Map<String,Object> res) {
		String cmd = req.get("cmd");
		String number = req.get("number");
		String name = req.get("name");
		String price = req.get("price");
		FoodVO food = new FoodVO();
		food.setNumber(Integer.parseInt(number));
		if("insert".equals(cmd)) {
			food.setName(name);
			food.setPrice(Integer.parseInt(price));
			res.put("insert", fs.insertFood(food));
			
		}else if("update".equals(cmd)) {
			food.setName(name);
			res.put("update",fs.updateFood(food));
			
		}else if("delete".equals(cmd)) {
			res.put("delete",fs.deleteFood(food));
		}
	}
}
