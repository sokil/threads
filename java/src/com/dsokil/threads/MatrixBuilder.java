package com.dsokil.threads;

public class MatrixBuilder {
    public static int[][] create(int height, int width, int value)
    {
        int[][] matrix = new int[width][height];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = value;
            }
        }

        return matrix;
    }

    public static int[][] ones(int height, int width)
    {
        return create(height, width, 1);
    }

    public static int[][] zeroes(int height, int width)
    {
        return create(height, width, 0);
    }
}
