import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Points
{
public static void points()
	{
		int length = 10;
		double[] x = new double[ length ];
		double[] y = new double[ length ];
		
		for ( int i = 0 ; i < length ; i++ )
			{
				x[ i ] = i + 1;
				y[ i ] = sqrt( i + 1 );
				// System.out.println(x[ i ] + "|" + y[ i ]);
			}
		
		double d = Double.POSITIVE_INFINITY;
		int pointA = 0;
		int pointB = 0;
		
		for ( int i = 0 ; i < length ; i++ )
			{
				for ( int j = 0 ; j < length ; j++ )
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
		points();
	}
}
