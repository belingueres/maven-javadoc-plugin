package docfiles.test;

/**
 * Sample class inside the package to be included in the javadoc
 *
 * @author Maria Odea Ching
 */
public class App
{
    /**
     * The main method
     *
     * @param args  an array of strings that contains the arguments
     */
    public static void main( String[] args )
    {
        System.out.println( "Sample Application." );
    }

    /**
     * Sample method that prints out the parameter string.
     * <img src="doc-files/included-dir1/sample-included1.gif">
     *
     * @param str   The string value to be printed.
     */
    protected void sampleMethod( String str )
    {
        System.out.println( str );
    }

}