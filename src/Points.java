import static java.lang.Math.pow ;
import static java.lang.Math.sqrt ;

import java.util.Scanner ;

/**
 * Closest pair algorithm via brute force. Computes the distance between each pair of
 * points and identify the pair resulting in the shortest distance.
 * 
 * @author Laura Wysocki and Bryan DeFaria
 * 
 * @version 2.0.0 2023-03-02 Final implementation
 */
public class Points
    {

    /**
     * Calculates pair of points which results in the shortest distance.
     * 
     * @param x
     *     point x
     * @param y
     *     point y
     */
    public static void points( int[] x,
                               double[] y )
        {
        // d is initialized as positive infinity to start
        double d = Double.POSITIVE_INFINITY ;
        int pointA = 0 ;
        int pointB = 0 ;

        for ( int i = 0 ; i < x.length ; i++ )
            {
            for ( int j = 0 ; j < y.length ; j++ )
                {
                if ( i != j )
                    {
                    // does the math
                    double temp = sqrt( pow( x[ i ] - x[ j ], 2 ) + pow( y[ i ] - y[ j ], 2 ) ) ;

                    if ( temp < d )
                        {
                        d = temp ;
                        pointA = i ;
                        pointB = j ;

                        } // end if

                    } // end if

                } // end for

            } // end for

        // Outputs result
        System.out.printf( "Smallest Distance is %f, between points (%d, %f) and (%d, %f).",
                           d,
                           x[ pointA ],
                           y[ pointA ],
                           x[ pointB ],
                           y[ pointB ] ) ;

        } // end points()


    /**
     * Main method to calculate smallest distance from 1 to the inputed number.
     * 
     * @param args
     *     an array of command-line arguments for the application
     */
    public static void main( String[] args )
        {
        try ( Scanner input = new Scanner( System.in ) )
            {
            System.out.println( "This program is a demonstration of Closest Pair algorithm by Brute Force" ) ;

            System.out.print( "Please an integer greater than 1: " ) ;
            int length = input.nextInt() ;
            // Determines the length of the arrays
            int[] x = new int[ length ] ;
            double[] y = new double[ length ] ;

            // X is iterated as 1 to the length (i.e. length 3 is [1, 2, 3]
            // Y is iterated as the square root of the respective value in X
            for ( int i = 0 ; i < length ; i++ )
                {
                x[ i ] = i + 1 ;
                y[ i ] = sqrt( i + 1 ) ;

                } // end for

            points( x, y ) ;

            } // end try

        } // end main()

    }
