package com.rest.api.book.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUplodeHelper {

//	public final String UPLOAD_DIR = "C:\\Users\\Hello\\Documents\\workspace-spring-tool-suite-4-4.21.1.RELEASE\\book\\src\\main\\resources\\static\\images";
	public final String UPLOAD_DIR = new ClassPathResource("static/images/").getFile().getAbsolutePath();
	
	public FileUplodeHelper() throws IOException{
		
	}
	
	public boolean uplodeFile(MultipartFile multipartFile) {
		
		boolean  b =  false;
		
		try {
			
//			InputStream is = multipartFile.getInputStream();
//			byte data[] = new byte[is.available()];
//			is.read();
//			
//			FileOutputStream fos = new FileOutputStream(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename());
//			fos.write(data);
//			
//			fos.flush();
//			fos.close();
			
			Files.copy(multipartFile.getInputStream(), Paths.get(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename()) , StandardCopyOption.REPLACE_EXISTING);
			
			b=true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return b;
	}
}
