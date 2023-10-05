public class EX9_Heron {
	public static void main(String[] args) {
		KeyIn ki = new KeyIn();
		
		System.out.println("4辺の長さから面積を計算します");
		System.out.println("(入力値は整数のみ)");
		System.out.println("4辺の長さと対角線の長さを入力してください");
		
		int[] x = new int[5];
		for(int i = 0; i < x.length; i++) {
			try {
				if(i < 4) {
					x[i] = Integer.parseInt(ki.readKey("x" + (i + 1) + " = "));
				} else {
					x[i] = Integer.parseInt(ki.readKey("x  = "));
				}
			} catch(NumberFormatException e) {
				System.out.println("整数の値を入力してください");
				System.exit(1);
			}
		}
		
		double s1 = Heron(x[0], x[1], x[4]);
		double s2 = Heron(x[2], x[3], x[4]);
		
		System.out.println("面積 = " + (s1 + s2));
	}
	
	
	private static double Heron(int a, int b, int c) {
		double d = (a + b + c) / 2.0;
		double s = Math.sqrt(d * (d - a) * (d - b) * (d - c));
		return s;
	}
}