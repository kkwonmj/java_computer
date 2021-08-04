package chap18.three;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception {
		String originalFileName = "C:/imgsource/한글.hwp"; // 1번
		String targetFileName = "C:/imgtarget/한글 파일입니다.hwp"; // 1번을 이 타겟 폴더로 보내겠다
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘되었습니다.");
	}

}
