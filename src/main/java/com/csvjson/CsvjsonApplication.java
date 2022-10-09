package com.csvjson;


import com.csvjson.utils.CsvUtil;
import com.csvjson.utils.ExtractUtil;
import com.csvjson.utils.ResponseUtil;
import com.github.opendevl.JFlat;
import org.apache.commons.io.FilenameUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static com.csvjson.utils.CsvUtil.*;


@SpringBootApplication
public class CsvjsonApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CsvjsonApplication.class, args);
		System.out.println("Hello World");

		/*List activeDrives = new ArrayList<>();
		File[] drives = File.listRoots();
		for(File drive: drives){
			activeDrives.add(drive);
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter API Response [ atm, branch]");
		String csvFor = scanner.nextLine().toLowerCase();
		Map<String,Object> contentCountNBrandName = filterCountAndBrandName(csvFor);
		Integer contentCount = (Integer) contentCountNBrandName.get("rowCount");
		String brandName = (String) contentCountNBrandName.get("brandName");*/
/*
		System.out.println("Enter file location to download CSV file,  ACTIVE DRIVES AVALAIBLE:"+ activeDrives);
		String path = scanner.nextLine();

		System.out.println("Enter file name to download CSV file (Use data_atm.csv");
		String fileName = scanner.nextLine();

		System.out.println(FilenameUtils.getBaseName(fileName)+"_"+brandName.toUpperCase()+"."+FilenameUtils.getExtension(fileName));
		fileName = FilenameUtils.getBaseName(fileName)+"_"+brandName.toUpperCase()+"."+FilenameUtils.getExtension(fileName);

		System.out.println("Enter no. of Records to be write / "+contentCount+ " in "+ fileName);
		Integer rowCount = scanner.nextInt();*/

/*		if(csvFor.equals("atm"))
			CsvUtil.jsonCsvWriterAtm(path, fileName, csvFor, rowCount);
		else CsvUtil.jsonCsvWriterBranch(path, fileName, csvFor, rowCount);*/
/*		CsvUtil.jsonCsvWriterAtm("atm");
		CsvUtil.jsonCsvWriterBranch("branch");

		CsvUtil.jsonCsvWriterBCA("bca");
		CsvUtil.jsonCsvWriterPCA("pca");

		CsvUtil.jsonCsvWriterCCC("ccc");
		CsvUtil.jsonCsvWriterSME("sme");*/
		CsvUtil.jsonCsvWriterAtm("atm");
		System.out.println("___________");
	}
}


