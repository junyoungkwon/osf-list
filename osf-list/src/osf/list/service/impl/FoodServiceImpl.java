package osf.list.service.impl;

import java.util.List;
import java.util.Map;

import osf.list.dao.FoodDAO;
import osf.list.dao.impl.FoodDAOImpl;
import osf.list.service.FoodService;

public class FoodServiceImpl implements FoodService {

	private FoodDAO fdao = new FoodDAOImpl();

	@Override
	public List<Map<String, String>> selectFoodList() {
		return fdao.selectFoodList();
	}

	@Override
	public boolean insertFood(Map<String, String> food) {
		return fdao.insertFood(food);
	}

	@Override
	public Map<String, String> selectFood(Map<String, String> food) {
		return fdao.selectFood(food);
	}

}
