package com.dsokil.threads.runnable;

public class RunnableMatrixAdder {
    public int sum(int[][] matrix)
    {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            (new Thread(new MatrixRowAdderRunnable())).start();
        }

        return sum;
    }
}
