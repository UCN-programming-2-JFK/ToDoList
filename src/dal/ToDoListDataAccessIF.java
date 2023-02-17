package dal;

import java.util.List;

import model.ToDoListItem;

public interface ToDoListDataAccessIF {

	
	List<ToDoListItem> getAllItems();
}
