package com.dsokil.threads;

import com.dsokil.threads.runnable.RunnableMatrixAdder;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = MatrixBuilder.ones(1000, 1000);

        int variance = Integer.parseInt(args[0]);
        switch (variance) {
            case 1:
                int sum = (new RunnableMatrixAdder()).sum(matrix);
                System.out.println(sum);
                break;
            default:
                System.out.println("Unknown variance");
                break;
        }
    }
}

