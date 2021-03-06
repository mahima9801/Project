package main;

import java.time.LocalDate;
import java.util.Scanner;
import exception.NoDataFoundException;
import service.UpdateRaw_StatusService;
import service.UpdateProd_StatusService;


public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Choose from the following:\n1.Raw Material Id\n2.Product Order Id");
	int ch = sc.nextInt();
	switch(ch){
	case 1:
		UpdateRaw_StatusService obj = new UpdateRaw_StatusService();
		System.out.println("Raw Material Ids are:"+obj.getId());
		System.out.println("Enter the Id:");
		int raw_id;
		while(true){
			raw_id = sc.nextInt();
			try{
				if(obj.validateService(raw_id)){
					break;
				}

		}catch(NoDataFoundException e){
			System.out.println(e);
		}
	}
		System.out.println("Enter the updated place:");
		
		System.out.println("Enter the expected delivery date:, format:yyyy-mm-dd");
		while(true){
			String raw_place = sc.nextLine();
			String raw_date = sc.nextLine();
			String raw_status = sc.nextLine();
			if(obj.dateValidate(raw_date)){
				LocalDate converteddate = LocalDate.parse(raw_date);
				System.out.println(obj.updatestatusservice(raw_id, raw_place, converteddate, raw_status));
			}
		}
	case 2:
		
	UpdateProd_StatusService obj1 = new UpdateProd_StatusService();
		System.out.println("Raw Material Ids are:"+obj1.getId());
		System.out.println("Enter the Id:");
		int prod_id;
		while(true){
			prod_id = sc.nextInt();
			try{
				if(obj1.validateService(prod_id)){
					break;
				}

		}catch(NoDataFoundException e){
			System.out.println(e);
		}
		}
		System.out.println("Enter the updated place:");
		
		System.out.println("Enter the expected delivery date:, format:yyyy-mm-dd");
		while(true){
			String prod_place = sc.nextLine();
			String prod_date=sc.nextLine();
			String prod_status = sc.nextLine();
			if(obj1.dateValidate(prod_date)){
				LocalDate converteddate1 = LocalDate.parse(prod_date);
				System.out.println(obj1.updatestatusservice(prod_id, prod_place, converteddate1, prod_status));
			}
			else{
				break;
			}
			}
		
		break;
	default:
		System.out.println("Please select from the above list!");
	}
	sc.close();
	}
}

	
