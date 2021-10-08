/**
 * This class is designed to make a matrix of numbers 
 * specified by the user. The user will decide the number
 * of rows and columns and a two dimensional array is used
 * to store the matrix. There are five methods in the class
 * and their purposes are explained below:
 * 
 * - setEntry method is used to take two integers as the
 * position in the matrix and a float to set the value.
 * - add method is used to add a given matrix to the 
 * current matrix in the class.
 * - subtract method is used to subtract a given matrix to the 
 * current matrix in the class.
 * - multiply method is used to multiply a given matrix to 
 * the current matrix in the class.
 * - equals method is used to determine if a given matrix is 
 * equal to the current matrix in the class.
 * 
 * @author Noah Young
 * @date 09/04/2018
 */
public class Matrix
{
    private int rows;
    private int cols;
    public float[][] matrix;
    
    /**
     * Explicit constructor
     * @param r the value of the rows
     * @param c the value of the columns
     */
    public Matrix(int r, int c)
    {
        rows = r;
        cols = c;
        matrix = new float[r][c];
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                matrix[i][j] = 0;
            }
        }
    }
    
    /**
     * Default Matrix constructor
     */
    public Matrix()
    {
        rows = 3;
        cols = 3;
        matrix = new float[3][3];
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = 0;
            }
        }
    }
    
    /**
     * Method takes integers for both the row and column and 
     * a float for the value to be set in the specified position.
     * 
     * @param r row to set value
     * @param c column to set value
     * @param num value to be set
     */
    public void setEntry (int r, int c, float num)
    {
        matrix[r][c] = num;
    }
    
    /**
     * This method is used to add a user specified matrix to the current
     * matrix declared in this class.
     * 
     * @param m The matrix to be added to the matrix of the class
     * @return The sum of the two matrices
     * @throws DimensionMismatch throws an exception if the size
     * of the two matrices are not the same.
     */
    public Matrix add (Matrix m) throws DimensionMismatch
    {
        if (!(m.rows == rows && m.cols == cols))
            throw new DimensionMismatch("The dimensions of the two matrices don't match");
        Matrix m1 = new Matrix(m.rows, m.cols);
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                m1.matrix[i][j] = matrix[i][j] + m.matrix[i][j];
            }
        }
        return m1;
    }
    
    /**
     * This method is used to subtract a user specified matrix from the 
     * current matrix declared in this class.
     * 
     * @param m The matrix to be subtracted from the matrix of the class
     * @return The difference of the two matrices
     * @throws DimensionMismatch throws an exception if the size
     * of the two matrices are not the same.
     */
    public Matrix subtract (Matrix m) throws DimensionMismatch
    {
        if (!(m.rows == rows && m.cols == cols))
            throw new DimensionMismatch("The dimensions of the two matrices don't match");
        Matrix m1 = new Matrix(m.rows, m.cols);
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                m1.matrix[i][j] = matrix[i][j] - m.matrix[i][j];
            }
        }
        return m1;
    }
    
    /**
     * This method is used to return the product of a user specified matrix 
     * and the current matrix declared in this class.
     * 
     * @param m The matrix to be multiplied to the matrix of the class
     * @return The product of the two matrices
     * @throws DimensionMismatch throws an exception if the size
     * of the two matrices are not the same.
     */
    public Matrix multiply (Matrix m) throws DimensionMismatch
    {
        if (!(m.rows == rows && m.cols == cols))
            throw new DimensionMismatch("The dimensions of the two matrices don't match");
        Matrix m1 = new Matrix(m.rows, m.cols);
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                m1.matrix[i][j] = matrix[i][j] * m.matrix[i][j];
            }
        }
        return m1;
    }
    
    /**
     * This method compares the the individual positions of two matrices
     * to determine if all of their values are equal.
     * 
     * @param m The matrix to compare to the matrix of the class
     * @return true if the matrices are equal or false if they're not
     * @throws DimensionMismatch throws an exception if the size
     * of the two matrices are not the same.
     */
    public boolean equals (Matrix m) throws DimensionMismatch
    {
        if (!(m.rows == rows && m.cols == cols))
            throw new DimensionMismatch("The dimensions of the two matrices don't match");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (m.matrix[i][j] != matrix[i][j])
                    return false;
            }
        }
        return true; //returns true if code makes it through the nested for loop
    }
    
    /**
     * This method is used to return the transpose of the Matrix defined
     * in this class.
     * 
     * @return The transpose of the matrix
     */
    public Matrix transpose ()
    {
        Matrix m = new Matrix(rows, cols);
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                m.matrix[i][j] = matrix[j][i];
            }
        }
        return m;
    }
    /**
     * Compares the current matrix to the matrix specified by the user
     * @param m matrix to be compared
     */
    public int compareTo (Matrix m)
    {
        float matSum = 0;
        float matSum2 = 0;
        
        for (int i = 0; i < this.matrix.length; i++)
        {
            for (int j = 0; j < this.matrix[i].length; j++)
            {
                matSum += Math.abs(this.matrix[j][i]);
            }
        }
        
        for (int i = 0; i < m.matrix.length; i++)
        {
            for (int j = 0; j < m.matrix[i].length; j++)
            {
                matSum2 += Math.abs(m.matrix[j][i]);
            }
        }
        if (matSum > matSum2)
            return 1;
        else if (matSum < matSum2)
            return -1;
        else
            return 0;
    }
    
    /**
     * Compares the current matrix to the matrix specified by the user
     * @param m matrix to be compared
     */
    public int compare (Matrix m, Matrix m1)
    {
        float matSum = 0;
        float matSum2 = 0;
        
        for (int i = 0; i < m.matrix.length; i++)
        {
            for (int j = 0; j < m.matrix[i].length; j++)
            {
                matSum += Math.abs(m.matrix[j][i]);
            }
        }
        
        for (int i = 0; i < m1.matrix.length; i++)
        {
            for (int j = 0; j < m1.matrix[i].length; j++)
            {
                matSum2 += Math.abs(m1.matrix[j][i]);
            }
        }
        if (matSum > matSum2)
            return 1;
        else if (matSum < matSum2)
            return -1;
        else
            return 0;
    }
}
