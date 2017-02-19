package com.hackingchicago.web.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utils {

	public static String readFile(String path, Charset encoding) 
			  throws IOException 
			{
			  
			path = "/Users/ericchiu/Workspace/hacking-chicago/GrantRankEclipseWorkspace/GrantRank/WebContent/static/" + path;
			byte[] encoded = Files.readAllBytes(Paths.get(path));
			  return new String(encoded, encoding);
			}
	
	public static String TEMP_FOLDER = "/tmp";
	
	public static String TEMP_DATA_FOLDER = "/tmp/data";
	
	
}
