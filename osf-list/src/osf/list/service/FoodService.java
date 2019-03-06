package osf.list.service;

import java.util.List;
import java.util.Map;

public interface FoodService {
	public List<Map<String,String>> selectFoodList();
	public boolean insertFood(Map<String,String> food);
	public Map<String,String> selectFood(Map<String,String> food);
	
}
