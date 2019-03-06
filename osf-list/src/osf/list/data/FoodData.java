package osf.list.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodData {
	public static final List<Map<String, String>> FOOD_LIST = new ArrayList<>();

	static {
		Map<String, String> map = new HashMap<>();
		map.put("번호", "1");
		map.put("이름", "초밥");
		map.put("가격", "1000");
		FOOD_LIST.add(map);
		map = new HashMap<>();
		map.put("번호", "2");
		map.put("이름", "떡볶이");
		map.put("가격", "10000");
		FOOD_LIST.add(map);
		map = new HashMap<>();
		map.put("번호", "3");
		map.put("이름", "족발");
		map.put("가격", "30000");
		FOOD_LIST.add(map);
		map = new HashMap<>();
		map.put("번호", "4");
		map.put("이름", "참치");
		map.put("가격", "40000");
		FOOD_LIST.add(map);
	}

}
