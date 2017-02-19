package com.hackingchicago.web.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utils {

	public static String readFile(String path, Charset encoding) 
			  throws IOException 
			{
			  
			path = "C:/Users/ddlee19/workspace2/GrantRank/WebContent/static/" + path;
			byte[] encoded = Files.readAllBytes(Paths.get(path));
			  return new String(encoded, encoding);
			}
}
