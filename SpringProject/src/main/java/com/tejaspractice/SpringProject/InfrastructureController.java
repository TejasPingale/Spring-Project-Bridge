package com.tejaspractice.SpringProject;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class InfrastructureController {

	@Autowired
	InfrastructureService infrastructureService=null;
	
	@RequestMapping("BridgeCount")
	int noOfBridgesInIndia() {
		return 1000;
	}
	@RequestMapping("addbridgeinfo")
	public void addBridge(@RequestBody Bridge bridge ) {
		System.out.println("Bridge info"+bridge);
	}
	
	@RequestMapping("BridgeName")
	ArrayList<String> nameOfBridgesInIndia() {
		
		ArrayList<String> listBridges=new ArrayList<String>();
		listBridges.add("Navle Bridge");
		listBridges.add("Katraj Bridge");
		listBridges.add("Chandni Bridge");
		listBridges.add("Shivajinagar Bridge");
		
		return listBridges;
	}
	@RequestMapping("bridgeinfo")
	Bridge fetchBridgrInfo() {
		Bridge bridge=new Bridge(1,"pune","3200 meter","150 meter");
		return bridge;
	}
	
	
	@GetMapping("bridgesinfo")
	ArrayList<Bridge> fetchBridgesInfo() {
		
		ArrayList<Bridge> albridgeinfo=	infrastructureService.fetchBridgesInfo();
//      ArrayList<Bridge> albridgeList=new ArrayList<Bridge>();
//		Bridge bridge=new Bridge(1,"pune","320 meter","15 meter");
//		Bridge bridge1=new Bridge(2,"mumbai","300 meter","16 meter");
//		Bridge bridge2=new Bridge(3,"p","310 meter","14 meter");
//		Bridge bridge3=new Bridge(4,"une","300 meter","17 meter");
//		Bridge bridge4=new Bridge(5,"e","200 meter","14 meter");
//		albridgeList.add(bridge);
//		albridgeList.add(bridge1);
//		albridgeList.add(bridge2);
//		albridgeList.add(bridge3);
//		albridgeList.add(bridge4);
		
		return albridgeinfo;
	}
	
	@RequestMapping("BridgeName/{cityname}")
	ArrayList<String> nameOfBridgesInIndia1(@PathVariable String cityname) {
		System.out.println("Im in nameOfBridgesInIndia1"+cityname);
		ArrayList<String> listBridges=new ArrayList<String>();
		if(cityname.equals("pune")) {
		listBridges.add("Navle Bridge");
		listBridges.add("Katraj Bridge");
		listBridges.add("Chandni Bridge");
		listBridges.add("Shivajinagar Bridge");
		}else {
			listBridges.add("g Bridge");
			listBridges.add("z Bridge");
			listBridges.add("r Bridge");
			listBridges.add("t Bridge");
		}
		return listBridges;
	}
}
