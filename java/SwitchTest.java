class SwitchTest
{
		public static void main (String [] args)
		{
			//需求2：根据指定月份，打印该月份所属的季节
			//3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12,1,2 冬季
			int x = 3 ;
			switch (x)
			{
			case 3:
			case 4:
			case 5:
					System.out.println (x+"春季");
					break;
			case 6:
			case 7:	
			case 8:	
					System.out.println (x+"夏季");
					break;
			case 9:
			case 10:	
			case 11:	
					System.out.println (x+"秋季");
					break;
			case 12:
			case 1:	
			case 2:	
					System.out.println (x+"冬季");
					break;
			default:
			System.out.println("cuowu");
			}
			System.out.println ("Hello Word!");
		}
	
	
}