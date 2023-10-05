import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyIn {
	public String readKey() {
		String buf = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in,"Shift_JIS"));
			buf = br.readLine();
		} catch(IOException e) {
			System.out.println(e);
			System.exit(1);
		}
		return buf;
	}
	
	
	public String readKey(String msg) {
		System.out.print(msg + ">");
		return readKey();
	}
}