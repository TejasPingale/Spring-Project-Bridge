package com.tejaspractice.SpringProject;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfrastructureService {

	@Autowired
	InfrastructureDao infrastuctureDao;
	public ArrayList<Bridge> fetchBridgesInfo() {
		ArrayList<Bridge> albridgeList = infrastuctureDao.fetchBridgesInfo();
		return albridgeList;
	}
}
