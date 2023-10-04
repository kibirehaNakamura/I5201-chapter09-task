import java.text.DecimalFormat;

public class EX9_ArraySalary {
	public static void main(String[] args) {
		String[] arrayName = { "小暮次郎", "川村麻衣", "北上義徳", "佐野洋子", "松原雅彦" };
		int[] arraySalary = { 184000, 175000, 261000, 163000, 226000 };
		double[] arrayRatio = new double[arrayName.length];
		int salarySum = 0;
		
		for(int i = 0; i < arrayName.length; i++) {
			salarySum += arraySalary[i];
		}
		
		for(int i = 0; i < arrayName.length; i++) {
			arrayRatio[i] = (double)arraySalary[i] / salarySum;
		}
		
		DecimalFormat form = new DecimalFormat();
		
		String buf;
		System.out.println("★　給料の状況　★");
		for(int i = 0; i < arrayName.length; i++) {
			System.out.print(arrayName[i]);
			form.applyPattern("###,###,###");
			buf = "          " + form.format(arraySalary[i]);
			buf = buf.substring(buf.length() - 11);
			System.out.print(buf);
			form.applyPattern("約##%");
			System.out.println("   " + form.format(arrayRatio[i]));
		}
		form.applyPattern("###,###,###");
		System.out.print("給料合計");
		buf = "          " + form.format(salarySum);
		buf = buf.substring(buf.length() - 11);
		System.out.println(buf + "円");
	}
}