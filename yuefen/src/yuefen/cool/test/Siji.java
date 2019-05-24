package yuefen.cool.test;

public class Siji {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =7;
		switch (x)
		{
		case 3:
		case 4:
		case 5:
			System.out.println(x+"月"+"春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(x+"月"+"夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(x+"月"+"秋季");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(x+"月"+"冬季");
			break;
		default:
		System.out.println("错误！！！");
		}
		System.out.println("你好，四季！");
	}

}
