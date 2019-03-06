package osf.list.dao;

import java.util.List;
import java.util.Map;

public interface FoodDAO {
	public List<Map<String, String>> selectFoodList();

	public Map<String, String> selectFood(Map<String, String> food);

	public boolean insertFood(Map<String, String> food);
}
