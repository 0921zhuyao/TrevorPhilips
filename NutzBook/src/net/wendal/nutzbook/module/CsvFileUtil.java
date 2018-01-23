package net.wendal.nutzbook.module;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;   
  
/**  
 * @author  panhf2003  
 * @version 2008/09/05,  
 */  
  
public class CsvFileUtil {  
       
    /**  
     * 构造，禁止实例化  
     */  
    private CsvFileUtil() {   
    }   
  
    public static void main(String[] args) {   
  
        // test   
        try {   
            readCsvFile("c://工具安装//webapps//ROOT//syncbatch//同步数据.txt");  //C:\工具安装\webapps\ROOT\syncbatch 
        } catch (FileNotFoundException ex) {   
            Logger.getLogger(CsvFileUtil.class.getName()).log(Level.SEVERE, null, ex);   
        } catch (IOException ex) {   
            Logger.getLogger(CsvFileUtil.class.getName()).log(Level.SEVERE, null, ex);   
        }   
    }   
    /**  
     * csv文件读取<BR/>  
     * 读取绝对路径为argPath的csv文件数据，并以List返回。  
     *  
     * @param argPath csv文件绝对路径  
     * @return csv文件数据（List<String[]>）  
     * @throws FileNotFoundException  
     * @throws IOException  
     */  
    public static List<String> readCsvFile(String argPath) throws FileNotFoundException, IOException {  
        File cvsFile = new File(argPath);   
        List<String> list = new ArrayList<String>();   
        FileReader fileReader = null;   
        BufferedReader bufferedReader = null;   
        try {   
        	InputStreamReader read = new InputStreamReader(
					new FileInputStream(cvsFile),"UTF-8");
            bufferedReader = new BufferedReader(read);
            String strLine = ""; 
            bufferedReader.readLine();
            while ((strLine = bufferedReader.readLine()) != null) { 
            	String[] strs = strLine.split(",");
            	System.out.println(strLine);   
            }   
        } catch (FileNotFoundException e) {   
            throw e;   
        } catch (IOException e) {   
            throw e;   
        } finally {   
            try {   
                if (bufferedReader != null) {   
                    bufferedReader.close();   
                }   
                if (fileReader != null) {   
                    fileReader.close();   
                }   
            } catch (IOException e) {   
                throw e;   
            }   
        }   
        return list;   
    }
}
