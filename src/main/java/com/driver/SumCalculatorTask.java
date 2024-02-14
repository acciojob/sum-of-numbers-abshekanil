package com.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class SumCalculatorTask implements Callable<Integer> {
	  private List<Integer> batchNumbers;

      public SumCalculatorTask(List<Integer> batchNumbers) {
         // your code goes here
      }

      @Override
      public Integer call() {
         // your code goes here
          return 0;
      }
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          List<Integer> numbers = new ArrayList<>();

          System.out.print("Enter the number of elements: ");
          int n = scanner.nextInt();

          System.out.println("Enter " + n + " elements:");
          for (int i = 0; i < n; i++) {
              numbers.add(scanner.nextInt());
          }

          System.out.print("Enter the number of threads: ");
          int numThreads = scanner.nextInt();

          SumCalculator sumCalculator = new SumCalculator(numbers, numThreads);
          int sum = sumCalculator.calculateSum();
          System.out.println("Sum of the numbers: " + sum);
      }
  }

 
