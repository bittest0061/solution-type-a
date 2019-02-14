package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		String strnum = String.valueOf(number);
		
		String[] strnums = strnum.split("");
		
		for(int i=0; i<strnums.length; i++) {
			if(strnums[i].equals("3")||strnums[i].equals("6")||strnums[i].equals("9")) {
				return 1;
			}
		}
		
		return 0;
	}
}