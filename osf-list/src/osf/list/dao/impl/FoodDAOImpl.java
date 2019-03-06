package osf.list.dao.impl;

import java.util.List;
import java.util.Map;

import osf.list.dao.FoodDAO;
import osf.list.data.FoodData;

public class FoodDAOImpl implements FoodDAO {
	
	@Override
	public List<Map<String, String>> selectFoodList() {
		return FoodData.FOOD_LIST;
	}

	@Override
	public boolean insertFood(Map<String, String> food) {
		return FoodData.FOOD_LIST.add(food);
	}

	@Override
	public Map<String, String> selectFood(Map<String, String> food) {
		for(int i = 0; i <FoodData.FOOD_LIST.size();i++) {
			Map<String,String> f = FoodData.FOOD_LIST.get(i);
			if(f.get("번호").contentEquals(food.get("번호"))) {
				return f;
			}
		}
		return null;
	}
}
