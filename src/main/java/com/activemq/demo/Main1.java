package com.activemq.demo;


import java.util.*;

public class Main1 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int [] a = {1,3,5,2,2};
        int n = 5,K = 3;
        System.out.println(findKth(a,n,K));
    }

//    public static int findKth(int[] a, int n, int K) {
//        if (K > 1 && K < n) {
//            Arrays.sort(a);
//            return a[K-1];
//        }else {
//            return 0;
//        }
//    }


    public static int findKth(int[] a, int n, int K) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0;i<a.length-1;i++) {
            for (int j = i+ 1;j<a.length;j++) {
                int temp = a[i];
                if (a[i] < a[j]) {
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i= 0;i<a.length;i++) {
            if (set.add(a[i])) {
                list.add(a[i]);
            }
        }
        return list.get(K-1);
    }


















//    public static String replaceSpace(String iniString, int length) {
//        StringBuffer stringBuffer = new StringBuffer();
//        for (int i = 0;i<iniString.length();i++) {
//            if (' ' == iniString.charAt(i)) {
//                stringBuffer.append("%20");
//            }else {
//                stringBuffer.append(iniString.charAt(i));
//            }
//        }
//        return stringBuffer.toString();
//    }


































//    public static String replaceSpace(String iniString, int length) {
//        StringBuffer stringBuffer = new StringBuffer();
//        for (int i = 0;i<iniString.length();i++) {
//            if (' ' == iniString.charAt(i)) {
//                stringBuffer.append("%20");
//            }else {
//                stringBuffer.append(iniString.charAt(i));
//            }
//        }
//        return String.valueOf(stringBuffer);
//    }

//    public static void main(String [] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            Set<Character> set = new HashSet<>();
//            StringBuffer stringBuffer = new StringBuffer();
//            String str = scanner.next();
//            for (int i = 0;i<str.length();i++) {
//                if (set.add(str.charAt(i))) {
//                    stringBuffer.append(str.charAt(i));
//                }
//            }
//            System.out.println(stringBuffer);
//        }
//    }

//    public static void main(String [] args) {
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        String b = scanner.next();
//        for (int i = 0;i < a.length();i++) {
//            for (int j = 0;j< b.length();j++) {
//                if (a.charAt(i)  == b.charAt(j)) {
//                    a = delete(a,i);
//                }
//            }
//        }
//        System.out.println(a);
//    }
//    public static String delete(String s,int i) {
//        s = s.substring(0,i) + s.substring(i+1);
//        return s;
//    }

//        public static void main(String [] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        String b = "";
//        String [] a = str.split(" ");
//        for (int i = a.length -1;i >=0;i--) {
//            b = b + a[i]+" ";
//        }
//        System.out.println(b.trim());
//    }

//    public static void main(String [] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int a = 2,b = 3;
//        int sum = 2 * n + n*(n - 1) * 3 /2;
//        System.out.println(sum);
//    }

//    public static String reverse(String sentence){
////        Scanner scanner = new Scanner(System.in);
////        while (scanner.hasNext()) {
////            String str = scanner.nextLine();
//        String a = "";
//            String [] temp = sentence.split(" ");
//            for (int i = temp.length - 1;i >= 0;i--) {
////                System.out.print(temp[i] + " ");
//                a = a + temp[i] + " ";
//            }
////        }
//        return a;
//    }

//        public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
//            Arrays.sort(array);
//            List<Integer> list = new ArrayList<>();
//            for (int i =0;i<array.length;i++) {
//                if ((i+1) < array.length && array[i] == array[i+1]) {
//                    i++;
//                }else {
//                    list.add(array[i]);
//                }
//            }
//            num1 [0] = list.get(0);
//            num2 [0] = list.get(1);
//        }
}
