import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Points
{
public static void points(int[] x, double[] y)
	{
		double d = Double.POSITIVE_INFINITY;
		int pointA = 0;
		int pointB = 0;
		
		for ( int i = 0 ; i < x.length ; i++ )
			{
				for ( int j = 0 ; j < y.length ; j++ )
					{
						if ( i != j )
							{
								double temp = sqrt( pow( x[ i ] - x[ j ], 2 ) + pow( y[ i ] - y[ j ], 2 ) );
								
								if ( temp < d )
									{
										d = temp;
										pointA = i;
										pointB = j;
									}
							}
						
					}
			}
		
		System.out.printf( "Smallest Distance is %f, between points (%f, %f) and (%f, %f).", d, x[ pointA ],
						   y[ pointA ], x[ pointB ], y[ pointB ] );
	}

public static void main( String[] args )
	{
		// Determines the length of the arrays
		int length = 10;
		int[] x = new int[ length ];
		double[] y = new double[ length ];
		
		// X is iterated as 1 to the length (i.e. length 3 is [1, 2, 3]
		// Y is iterated as the square root of the respective value in X
		for ( int i = 0 ; i < length ; i++ )
			{
				x[ i ] = i + 1;
				y[ i ] = sqrt( i + 1 );
			}
		
		points( x, y );
	}
}
