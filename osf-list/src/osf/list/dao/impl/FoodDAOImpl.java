package osf.list.dao.impl;

import java.util.List;
import osf.list.dao.FoodDAO;
import osf.list.data.FoodData;
import osf.list.vo.FoodVO;

public class FoodDAOImpl implements FoodDAO {

	@Override
	public List<FoodVO> selectFoodList() {
		return FoodData.FOOD_LIST;
	}

	@Override
	public boolean insertFood(FoodVO food) {
		return FoodData.FOOD_LIST.add(food);
	}

	@Override
	public FoodVO selectFood(FoodVO food) {
		for (int i = 0; i < FoodData.FOOD_LIST.size(); i++) {
			FoodVO f = FoodData.FOOD_LIST.get(i);
			if (f.getNumber().equals(food.getNumber())) {
				return f;
			}
		}
		return null;
	}

	@Override
	public boolean updateFood(FoodVO food) {
		for (int i = 0; i < FoodData.FOOD_LIST.size(); i++) {
			FoodVO f = FoodData.FOOD_LIST.get(i);
			if (f.getNumber().equals(food.getNumber())) {
				if (food.getName() != null) {
					f.setName(food.getName());
				}
				if (food.getPrice() != null) {
					f.setPrice(food.getPrice());
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteFood(FoodVO food) {
		for(int i=0;i<FoodData.FOOD_LIST.size();i++) {
			FoodVO f = FoodData.FOOD_LIST.get(i);
			if(f.getNumber().equals(food.getNumber())) {
				FoodData.FOOD_LIST.remove(i);
				return true;
			}
		}
		return false;
	}
}
