package com.knoldus;




import java.util.ArrayList;
import java.util.List;

import java.util.Random;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {



    public static void main(String[] args) {

        List<Integer> integerList=new ArrayList<Integer>();
        Random random=new Random();

        for(int i=1;i<101;i++){
            integerList.add(random.nextInt(1000));
            //integerList.add(i);
        }
        System.out.println(integerList);

       List list=integerList.stream().filter(PrimeNumber::isPrime).collect(Collectors.toList());
       System.out.println(list);


    }

    static public boolean isPrime(int n){
        IntPredicate intPredicate=i -> n%i==0;
        return n>1&&IntStream.range(2,n).noneMatch(intPredicate);

        /*for (int i=2;i<n/2;i++){
            if (i%2==0)
                return false;
        }
        return true;*/
    }
    }

