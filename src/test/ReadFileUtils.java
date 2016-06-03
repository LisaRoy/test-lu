package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * 读取文件. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2016年4月7日 下午2:54:01
 * <p>
 * Company: 苏州宽连信息技术有限公司
 * <p>
 * @author luhy@c-platform.com
 * @version 1.0.0
 */
public class ReadFileUtils {
	
	public static List<String> getPathList(String pathName){
		FileInputStream in = null;
		try {
			File file = new File(pathName);
			in = new FileInputStream(file);
			InputStreamReader read = new InputStreamReader(in, "utf8");
			BufferedReader bfr = new BufferedReader(read);
			String lineTxt = null;
			List<String> pathList = new ArrayList<String>();
			while ((lineTxt = bfr.readLine()) != null) {
				if (StringUtils.isNotBlank(lineTxt)) {
					pathList.add(lineTxt);
				}
			}
			return pathList;
        }
        catch (Exception ex) {
	        System.out.println("读取文件失败" + ex);
	        return null;
        }finally{
        	if (in != null) {  
                try {  
                    in.close();  
                } catch (IOException io) {  
                }
            }  
        }
		
	}
	
	

}
