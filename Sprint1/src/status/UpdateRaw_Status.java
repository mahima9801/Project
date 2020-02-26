package status;

import data.Raw_Id;
import repository.RawMaterialOrder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class UpdateRaw_Status {
	Map<Integer, Raw_Id> raw;
	
	public UpdateRaw_Status(){
		raw = RawMaterialOrder.get();
	}
	public List<Integer> getId(){
		List<Integer> OrderIdlist = new ArrayList<Integer>();
		
		for(Entry<Integer, Raw_Id> map : raw.entrySet()){
			OrderIdlist.add(map.getKey());
		}
		return OrderIdlist;
	}
	public String updaterawStatus(int Id, String place,LocalDate date, String status){
		String check="not a valid id";
		
		for(Entry<Integer, Raw_Id> map : raw.entrySet()){
			if(map.getKey() == Id){
				map.getValue().setPlace(place);
				map.getValue().setDate(date);
				map.getValue().setStatus(status);
				
				check = "data updated";
			}
		}
		return check;
	}

}
