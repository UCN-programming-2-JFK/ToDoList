package controller;

import java.util.List;

import dal.ToDoListDataAccessIF;
import model.ToDoListItem;

public class ToDoListController {
	
	private ToDoListDataAccessIF dataAccess;
	
	public ToDoListController(ToDoListDataAccessIF dataAccess) {
		setDataAccess(dataAccess);
	}

	List<ToDoListItem> getUnfinishedItems(){
		return dataAccess.getAllItems();
	}
	
	public void setDataAccess(ToDoListDataAccessIF dataAccess) {
		this.dataAccess = dataAccess;
	}
}
