package osf.list.data;

import java.util.ArrayList;
import java.util.List;
import osf.list.vo.FoodVO;

public class FoodData {
	public static final List<FoodVO>
	FOOD_LIST = new ArrayList<>();
	static {
		FoodVO food = new FoodVO();
		food.setNumber(1);
		food.setName("참치");
		food.setPrice(30000);
		FOOD_LIST.add(food);	
	}
}
