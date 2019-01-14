package prob01;
import java.util.Scanner;


public class Gugudan {
	
	static int resultNumber = 0; //결과값
	
	public static void main( String[] args ) {
		int l = randomize( 1, 9 ); //랜덤수
		int r = randomize( 1, 9 ); //랜덤수
		
		resultNumber = l * r; //결과값 랜덤수로 곱

		int[] answerNumbers = randomizeAnswers(); //랜덤으로 결과값
		int loc = randomize( 0, 8 ); //랜덤 정답값 갯수
		answerNumbers[ loc ] = resultNumber; //랜덤값중 정답이 들어감 
		
		System.out.println( l + " x " + r + " = ?" ); //문제물어봄
		
		int length = answerNumbers.length; //랜덤정답값물어보는갯수
		for( int i = 0; i < length; i++ ) { //랜덤값 UI
			if( i % 3 == 0 ) {
				System.out.print( "\n" );
			} else {
				System.out.print( "\t" );
			}
			
			System.out.print( answerNumbers[ i ] );
		}

		System.out.print( "\n\n" );
		System.out.print( "answer:" );

		Scanner s = new Scanner( System.in ); //정답을 적어라
		int answer=s.nextInt();
		//
		//  이 부분에 적당한 코드를 작성합니다.  
		//
		for(int i=0;i<length;i++) {
			if(resultNumber==answer) {
				resultNumber=1;
			}
		}
		if(resultNumber==1) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
	}

	private static int randomize( int lNum, int rNum ) { //가짜값넣어주기위함
        int random = (int) ( Math.random() * rNum ) + lNum;
        return random;
	}
	
	private static int[] randomizeAnswers() {

		final int COUNT_ANSWER_NUMBER = 9;
		final int MAX_ANSWER_NUMBER = 81;
		
		int[] boardNumbers = new int[ COUNT_ANSWER_NUMBER ];
		int occupied = 0;
		
		while( occupied < COUNT_ANSWER_NUMBER ) {
			
	        int random = ( int )( Math.random() * MAX_ANSWER_NUMBER ) + 1;
	        
	        boolean evaluted = false;
	        for( int i = 0; i < occupied; i++ ) {
	        	if(resultNumber==1) {
	        		System.out.println("정답");
	        		evaluted = true;
	        		break;
	        	}
	
	        }
	        
	        if( !evaluted ) {
	        	boardNumbers[ occupied++ ] = random;
	        	
	        }
		}
		
        return boardNumbers;
	}	
}
