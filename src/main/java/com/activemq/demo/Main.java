package com.activemq.demo;

import java.util.*;

/**
 * Created by liangliang on 2020/4/21 22:10
 */
public class Main {






























//    public static void main(String [] args) {
    //找零
//        Scanner scanner = new Scanner(System.in);
//        int money = scanner.nextInt();
//        if (money > 0 && money <= 1024) {
//            int re = 1024 - money;
//            int a = re / 64;
//            int b = re % 64 / 16;
//            int c = re % 64 % 16 / 4;
//            int d = re % 64 % 16 % 4;
//            System.out.println(a+b+c+d);
//        }else {
//            System.out.println("输入异常");
//        }
//    }

//    public static void main(String[] args){
    //扭蛋
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
////        StringBuffer str = new StringBuffer();
//        List<String> list = new ArrayList<>();
//        while(n > 0) {
//            if(n%2 == 0) {
//                n = (n - 2)/2;
//                list.add("3");
////                str.append("3");
//            }else {
//                n = (n - 1)/2;
//                list.add("2");
////                str.append("2");
//            }
//        }
////        str.reverse();
////        Collections.reverse(list);
//        for (int i = list.size() -1;i >= 0;i--) {
//            System.out.print(list.get(i));
//        }
//        sc.close();
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        String [] s1 = str.split(",");
//        int N = Integer.parseInt(s1[1]);
//        String [] s2 = s1[0].split("\\s+");
//        List<Integer> list = new ArrayList<>();
//        for (String s : s2) {
//            list.add(Integer.parseInt(s));
//        }
//        List<Integer> list1 = new ArrayList<>();
//        for (int i = 0;i < s2.length - 2;i++) {
//            for (int j = 1;j < s2.length - 1;j++) {
//                for (int k = 2;k < s2.length;k++) {
//                    if ( Integer.parseInt(s2[i]) +Integer.parseInt(s2[j]) + Integer.parseInt(s2[k]) == N ) {
//                        list1.add(1);
//                    }else {
//                        list1.add(2);
//                    }
//                }
//            }
//        }
//        if (list1.contains(1)) {
//            System.out.println("True");
//            return;
//        }else {
//            System.out.println("False");
//        }
//    }
//    N
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        String[] temp = str.split(",");
//        String[] number = temp[0].split(" ");
//        int[] nums = new int[number.length];
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = Integer.parseInt(number[i]);
//        }
//        java.util.Arrays.sort(nums);
//        int N = Integer.parseInt(temp[1]);
//        for (int i = 0; i < nums.length - 2; i++) {
//            int start = i + 1, end = nums.length - 1;
//            while (start < end) {
//                int sum = nums[i] + nums[start] + nums[end];
//                if (sum == N){
//                    System.out.println("True");
//                    return;
//                }else if (sum < N)
//                    start++;
//                else
//                    end--;
//            }
//        }
//        System.out.println("False");
//    }


//    public static void main(String[] args) {
//        //   no    laingzhiyuanzhi laingzhyu
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            List<String> list = new ArrayList<>();
//            String str = scanner.next();
//            for (int i = 0;i < str.length();i++) {
//                if (!list.contains(String.valueOf(str.charAt(i)))) {
//                    list.add(String.valueOf(str.charAt(i)));
//                    System.out.print(str.charAt(i));
//                }
//            }
//        }
//    }

//    public static void main(String[] args) {
//        laingzhiyuanzhi laingzhyu
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            Set<Character> set = new HashSet<>();
//            StringBuffer newStr = new StringBuffer();
//            char [] str = scanner.next().toCharArray();
//            for (int i = 0;i < str.length;i++) {
//                if (set.add(str[i])) {
//                    newStr.append(str[i]);
//                }
//            }
//            System.out.println(newStr);
//        }
//    }

//    public static void main(String[] args) {
//        去公共字符
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        String b = scanner.next();
//        for (int i = 0;i < a.length();i++) {
//            for (int j = 0;j < b.length();j++) {
//                if (a.charAt(i) == b.charAt(j)) {
//                    a = removeCharAt(a,i);
//                }
//            }
//        }
//        System.out.println(a);
//    }
//    public static String removeCharAt(String s, int pos) {
//        return s.substring(0, pos) + s.substring(pos + 1);
//    }
//xiangliner
//    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
//        List<Integer> list = new ArrayList<>();
//        Arrays.sort(array);
//        for(int i=0;i<array.length;i++){
//            if( (i+1)<array.length && array[i]==array[i+1] ){
//                i++;
//            }else{
//                list.add(array[i]);
//            }
//        }
//        num1[0]=list.get(0);
//        num2[0]=list.get(1);
//    }
}
