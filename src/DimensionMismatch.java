/**
 * Class that handles the error outputting of a dimension 
 * mismatch of 2 matrices.
 * 
 * @author Noah Young
 */
public class DimensionMismatch extends Exception
{
    public DimensionMismatch(String msg)
    {
        super(msg);
    }
}
