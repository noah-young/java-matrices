import java.util.Arrays;

/**
 * Tests all the functions defined in the Matrix class
 * @author Noah Young
 * @date 09/04/2018
 */
public class MatrixTest {
    public static void main(String[] args) throws DimensionMismatch
    {
        Matrix m1 = new Matrix (2, 2);
        Matrix m2 = new Matrix (2, 2);
        
        m1.setEntry(0, 0, 5.5f);
        m1.setEntry(0, 1, 8.2f);
        m1.setEntry(1, 0, 4.1f);
        m1.setEntry(1, 1, 1.0f);
        
        m2.setEntry(0, 0, 2.32f);
        m2.setEntry(0, 1, 6.5f);
        m2.setEntry(1, 0, 3.1f);
        m2.setEntry(1, 1, 1.8f);
        
        // Arrays.deepToString is used as an easy way to print a 2D array
        // such as that in the Matrix class.
        System.out.println("Matrix one: " + Arrays.deepToString(m1.matrix));
        System.out.println("Matrix two: " + Arrays.deepToString(m2.matrix));
        
        // Prints out the sum of the matrices
        System.out.println("Sum of Matrix one and two " +
                Arrays.deepToString(m1.add(m2).matrix));
        
        // Prints out the difference of the matrices
        System.out.println("Difference of Matrix one and two " +
                Arrays.deepToString(m1.subtract(m2).matrix));
        
        // Prints out the product of the matrices
        System.out.println("Product of Matrix one and two " +
                Arrays.deepToString(m1.multiply(m2).matrix));
        
        // Determines if Matrix one is equal to Matrix two
        if (m1.equals(m2))
            System.out.println("The matrices are equal");
        else
            System.out.println("The matrices are not equal");
        
        // Prints the transpose of Matrix one
        System.out.println("The transpose of Matrix one is: " 
                + Arrays.deepToString(m1.transpose().matrix));
        
        // Compares Matrices one and two
        System.out.println(m1.compareTo(m2));
        
        Matrix[] matrixArray = new Matrix[5];
        //Arrays.sort(matrixArray);
        System.out.println("Sorted Matrix array: " + matrixArray);
    }
}
