import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        divisibleByAll(new String[1]);
    }

    //------------------Patterns--------------------
    public static void pattern1(String args[]){
        /*
        1
        1 *2
        1 *2
        1
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                if(j<i) System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                if(j<i) System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void pattern2(String[] args){
        /*   *
         * *
         * * *
         * *
         *         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        System.out.println("* ".repeat(n));
        for(int i=n-1;i>=1;i--){
            for(int j=i;j>=1;j--) System.out.print("* ");
            System.out.println();
        }
    }
    public static void pattern3(String[] args){
        /*
         *
         * *
         * * *

         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
    }
    public static void pattern4(String[] args){
        /*
             1
           2 2
         3 3 3

         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print(i+" ");
            System.out.println();
        }
    }
    public static void pattern5(String[] args){
        /*
        1         1
        1 2     2 2
        1 2 3 3 3 3
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int  j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=2*(n-i);j>=1;j--) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print(i+" ");
            System.out.println();
        }
    }
    public static void pattern6(String args[]){
        /*
           A
         C C C
       E E E E E
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int m = (2*i)-1;
            for(int j=n-i;j>=1;j--) System.out.print("  ");
            for(int j=1;j<=m;j++){
                char c = (char)(m+64);
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    public static void pattern7(String args[]){
        /*
        1
        2 3
        4 5 6
        4 5 6
        2 3
        1
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            int b = num-i;
            num = b;
            for(int j=1;j<=i;j++){
                System.out.print(b+" ");
                b++;
            }
            System.out.println();
        }
    }
    public static void pattern8(String args[]){
        /*
        0 1 2 3
        4 5 6
        7 8
        9
        9
        8 7
        6 5 4
        3 2 1 0
         */
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt()*2;
        int num = 0;
        for(int i=1;i<=len;i++){
            if(i<=len/2){
                for(int j=len/2;j>=i;j--){
                    System.out.print(num+" ");
                    num++;
                }
            }
            else{
                if(i == (len/2)+1) num--;
                for(int j=len/2;j<i;j++){
                    System.out.print(num+" ");
                    num--;
                }
            }
            System.out.println();
        }
    }
    public static void pattern9(String[] args){
        /*
             1
           1 2
         1 2 3

         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print(j+" ");
            System.out.println();
        }
    }
    public static void pattern10(String args[]){
        /*
        ** Printing the pattern... **
        1
        2 5
        3 6 9
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("** Printing the pattern... **");
        for(int i=1;i<=n;i++){
            int num = i;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num = num + n;
            }
            System.out.println();
        }
    }
    public static void pattern11(String args[]){
        /*
        A B C
        1 2
        A
         */
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2 != 0){
                char c = 'A';
                for(int j=n;j>=i;j--){
                    System.out.print(c+" ");
                    c = (char)(c+1);
                }
            }
            else{
                int num = 1;
                for(int j=n;j>=i;j--){
                    System.out.print(num+" ");
                    num++;
                }
            }
            System.out.println();
        }

    }
    //----------------Patterns-----------------------

    //------------------Digits-----------------------

    public static void divisibleBy13(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem = num%13;
        System.out.print(num-rem);
    }

    public static void oddItemsInArray(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        System.out.print("Odd items of the array: ");
        for(int i=0;i<len;i++){
            int num = sc.nextInt();
            if(num%2!=0) System.out.print(num+" ");
        }
    }

    public static void armstrongNumber(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if(n.length()<5){
            int len = n.length();
            int check = Integer.parseInt(n);
            int num = 0;
            while(check>0){
                int rem = check%10;
                num += (int)(Math.pow(rem,len));
                check/=10;
            }
            if(String.valueOf(num).equals(n)) System.out.print("Armstrong Number");
            else System.out.print("Not a Armstrong");
        }
        else System.out.print("Not a Armstrong");
    }
    public static void singleDigit(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num>9){
            num = r(num);
        }
        System.out.print(num);
    }
    public static int r(int num){
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
    public static void countTheDivisible(String args[]){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int num = sc.nextInt();
        int count = 0;
        while(start<=end){
            if(start%num == 0) count++;
            start++;
        }
        System.out.print(count);
    }
    public static void leapYear(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%400==0 || (num%4==0&&num%100!=0)) System.out.print("The given year " + num + " is leap year");
        else System.out.print("The given year " + num + " is not a leap year");
    }

    public static void binaryNumber(String args[]){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0;i<test;i++){
            int num = sc.nextInt();
            for(int j=1;j<=num;j++){
                System.out.print(Integer.toBinaryString(j)+" ");
            }
        }
    }
    public static void printDigitsInEachLine(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while(num>0){
            list.add(num%10);
            num/=10;
        }
        int size = list.size()-1;
        while(size>-1){
            System.out.println(list.get(size));
            size--;
        }
    }
    public static void sumOfDigits(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num>0){
            sum+=(num%10);
            num/=10;
        }
        System.out.print(sum);
    }
    public static void divisibleByAll(String args[]){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i=0;i<len;i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int n = arr[0];
        boolean flag = true;
        for(int i=1;i<len;i++){
            if(arr[i]%n != 0){
                flag = false;
                break;
            }
        }
        if(flag) System.out.print(n);
        else System.out.print(-1);
    }
    public static void alternateNumbersInArray(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i=0;i<len;i++) arr[i] = sc.nextInt();
        for (int i=1;i<len;i+=2){
            System.out.println(arr[i]);
        }
    }
    public static void missingInArray(String args[]){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i=0;i<len;i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<len;i++){
            if(arr[i] != i+1){
                System.out.print(i+1);
                return;
            }
        }
        System.out.print(-1);
    }
    public static void firstAndLastInArray(String args[]){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i=0;i<len;i++) arr[i] = sc.nextInt();
        for(int i=0;i<len/2;i++){
            System.out.print(arr[i]+" "+arr[len-1-i]+" ");
        }
        if(len%2 != 0) System.out.print(arr[len/2]);
    }
    public static void buyAndSell(String args[]){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i=0;i<len;i++) arr[i] = sc.nextInt();
        int min = arr[0];
        int minIndex = 0;
        for(int i=1;i<len;i++){
            if(min>arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        int max = arr[minIndex];
        int maxIndex = minIndex;
        for(int i=minIndex;i<len;i++){
            if(max<arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Day of buying : "+ (minIndex+1));
        System.out.println("Day of Selling : "+ (maxIndex+1));
    }
    public static void targetPosition(String args[]){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int target = sc.nextInt();
        boolean flag = false;
        System.out.print("Positions are ");
        for (int i=0;i<len;i++){
            if(target == sc.nextInt()){
                System.out.print(i+" ");
                flag = true;
            }
        }
        if(!flag)System.out.print("-1 -1");
    }
    public static void equalityOfArrays(String[] args){
        Scanner sc = new Scanner(System.in);
        int len1 = sc.nextInt();
        int len2 = sc.nextInt();
        if(len1 != len2){
            System.out.print("Two Arrays Are Not equal");
            return;
        }
        int arr1[] = new int[len1];
        int arr2[] = new int[len2];
        for (int i=0;i<len1;i++) arr1[i] = sc.nextInt();
        for (int i=0;i<len1;i++) arr2[i] = sc.nextInt();
        for (int i=0;i<len1;i++){
            if(arr1[i] != arr2[i]){
                System.out.print("Two Arrays Are Not equal");
                return;
            }
        }
        System.out.println("Two Arrays Are Equal");
    }
    public static void dominator(String args[]){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i=0;i<len;i++) arr[i] = sc.nextInt();
        int coc = -1;
        for(int i=0;i<len;i++){
            boolean flag = true;
            int count = 0;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    flag = false;
                }
            }
            if(flag){
                for(int j=i;j<len;j++){
                    if(arr[i] == arr[j]) count++;
                }
                if(count>len/2){
                    if(coc<count) coc = arr[i];
                }
            }
        }
        System.out.print(coc);
    }
    public static void sumOfOddInArray(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int odd = 0;
        for (int i=0;i<len;i++){
            int n = sc.nextInt();
            if(i%2==0) odd+=n;
        }
        System.out.print("The sum of the odd " +
                "position in the array is "+odd);
    }
    public static void removingRepeatingCharacter(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "";
        for(int i=0;i<s.length();i++){
            boolean flag = true;
            for (int j=0;j<i;j++){
                if(s.charAt(j) == s.charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(flag) res = res + s.charAt(i);
        }
        System.out.print(res);
    }
    public static void evenVowelsInString(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0;i<s.length();i++){
            int count = 0;
            boolean flag = true;
            for (int j=0;j<i;j++){
                if(s.charAt(j) == s.charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                for(int j=i;j<s.length();j++){
                    if(s.charAt(j) == s.charAt(i)) count++;
                }
                if(count%2!=0){
                    System.out.print("NOT HAPPY");
                    return;
                }
            }
        }
        System.out.print("HAPPY");
    }
    public static void capitalizeTheAlternate(String[] args){
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        for(int i=0;i<s.length;i++){
            if(i%2==0){
                System.out.print(s[i].toUpperCase()+" ");
            }
            else System.out.print(s[i]+" ");
        }
    }

    public static void replace(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = sc.next();
        String b = sc.next();
        s = s.replaceFirst(" "+a," "+b);
        System.out.println(s);
    }
    public static void removenThOccuranceInString(String[] args){
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        int n = sc.nextInt();
        sc.nextLine();
        String q = sc.next();
        int count = 0;
        for(int i=0;i<s.length;i++){
            if(count == n){
                for(int j=0;j<(i-1);j++){
                    System.out.print(s[j]+" ");
                }
                for(int j=i;j<s.length;j++){
                    System.out.print(s[j]+" ");
                }
                return;
            }
            else{
                if(s[i].equals(q)) count++;
            }
        }
    }
    public static void largestPrime(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0;i<test;i++){
            int num = sc.nextInt();
            int prime = 2;
            for(int j=num-1;j>=2;j--){
                boolean flag = true;
                for(int k = 2;k<=j/2;k++){
                    if(j%k == 0){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    prime = j;
                    System.out.println(prime);
                    break;
                }
            }
        }
    }
    public static void alternateString(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=1;i<s.length();i+=2){
            System.out.print(s.charAt(i)+""+s.charAt(i-1));
        }
        if(s.length()%2!=0)System.out.print(s.charAt(s.length()-1));
    }
    public static void sumOfWeightsBased(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        int[] res = new int[len];
        for(int i=0;i<len;i++) arr[i] = sc.nextInt();
        for(int i=0;i<len;i++){
            res[i] = perfectSquare(arr[i])+
                    fourAndSix(arr[i])+
                    even(arr[i]);
        }
        for(int i=0;i<len;i++){
            boolean flag = false;
            for(int j=0;j<len-1;j++){
                if(res[j]>res[j+1]){
                    swap(res,j,j+1);
                    swap(arr,j,j+1);
                }
                else if(res[j] == res[j+1]){
                    if(arr[j+1]<arr[j]) swap(arr,j,j+1);
                }
            }
        }
        for(int i=0;i<len;i++) System.out.print(arr[i]+" ");
    }
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int perfectSquare(int num){
        for(int i=1;i<num/2;i++){
            if(i*i == num) return 5;
        }
        return 0;
    }
    public static int fourAndSix(int n){
        if (n%4==0&&n%6==0) return 4;
        return 0;
    }
    public static int even(int m){
        if(m%2 == 0 ) return 3;
        return 0;
    }
    public static void frequency(String[] args){
        Scanner sc = new  Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++)arr[i] = sc.nextInt();
        int count = 0;
        int max=0;
        for(int i=0;i<len;i++){
            int coc = 0;
            boolean flag = true;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                for(int j=i;j<len;j++){
                    if(arr[i] == arr[j]) coc++;
                }
                if(i==0){
                    count = coc;
                    max = arr[0];
                }
                else{
                    if(coc>count){
                        count = coc;
                        max = arr[i];
                    }
                    else if(coc == count){
                        if(arr[i]<max) max = arr[i];
                    }
                }
            }
        }
        System.out.print(max);
    }
    public static void swappingFirstAndLast(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String first = s.substring(0,1);
        String last = s.substring(s.length()-1);
        s = last + s.substring(1,s.length()-1)+first;
        System.out.print(s);
    }
    public static void reverse(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num>0){
            System.out.print(num%10);
            num/=10;
        }
    }
    public static void digitsInInteger(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            String s = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = 0;
            for(int j=a;j<b;j++){
                String n = String.valueOf(j);
                if(n.contains(s)) count++;
            }
            System.out.println(count);
        }
    }
    public static void LcmAndGcd(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int l = a<b?a:b;
            int lcm = 0;
            for(int j=1;j<=l;j++){
                if(a%j==0 && b%j==0) lcm = j;
            }
            int gcd = 0;
            int g = 1;
            while(true){
                int e = lcm*g;
                if(e%a==0 && e%b==0){
                    gcd = e;
                    break;
                }
                g++;
            }
            System.out.println(gcd);
            System.out.println(lcm);
        }
    }
    public static void trendy(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length()==3){
            int n = Integer.parseInt(s.substring(1,2));
            if(n%3 == 0) System.out.println("Trendy number");
            else System.out.println("Not a Trendy number");
        }
        else System.out.println("Not a Trendy number");
    }
    public static void fibonacci(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum;
        for(int i=1;i<=n;i++){
            if(i==1 || i==2){
                System.out.print((i==1?a:b) +" ");
            }
            else{
                sum = a+b;
                a = b;
                b = sum;
                System.out.print(sum+" ");
            }
        }
    }
    public static void largestNumberInDigit(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int max = 0;
        while(s>0){
            int e = s%10;
            if(max<e) max = e;
            s/=10;
        }
        System.out.print(max);
    }
    public static void armstrongInBounds(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Armstrong number between "
        + a +" to "+b+" are:");
        for(int i=a;i<b;i++){
            if(armstrong(i)) System.out.print(i+" ");
        }
    }
    public static boolean armstrong(int i){
        Scanner sc = new Scanner(System.in);
        String n = String.valueOf(i);
            int len = n.length();
            int check = Integer.parseInt(n);
            int num = 0;
            while(check>0){
                int rem = check%10;
                num += (int)(Math.pow(rem,len));
                check/=10;
            }
            if(String.valueOf(num).equals(n)) return true;
            else return false;
    }
    public static void uniqueElements(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++) arr[i] = sc.nextInt();
        int unique = Integer.MAX_VALUE;
        boolean flag1 = false;
        for(int i=0;i<len;i++){
            boolean flag = true;
            for(int j=0;j<len;j++){
                if(i==j) continue;
                if(arr[i] == arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                if(unique>arr[i]) unique = arr[i];
                flag1 = true;
            }
        }
        if(!flag1) System.out.print("No unique elements");
        else System.out.print(unique);
    }
    public static void findingRepeatingElements(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i=0;i<len;i++) arr[i] = sc.nextInt();
        int count = 0;
        for(int i=0;i<len;i++){
            count = 0;
            for(int j=i;j<len;j++){
                if(arr[i] == arr[j]) count++;
            }
            if(count>1){
                System.out.print(arr[i]);
                return;
            }
        }
        System.out.print("No repeating elements");
    }
    public static void swappingOddAndEvenInBinary(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] b = Integer.toBinaryString(n).toCharArray();
        for(int i=0;i<=(b.length)/2;i+=2){
            char temp = b[i];
            b[i] = b[i+1];
            b[i+1] = temp;
        }
        String d = new String(b);
        int s = Integer.parseInt(d,2);
        System.out.print(s);
    }
    public static void zoo(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cheap = Math.min(c,Math.min(a,b));
        int cost = Math.max(c,Math.max(a,b));
        int area1 = sc.nextInt();
        int area2 = sc.nextInt();
        int area3 = sc.nextInt();
        int aM = sc.nextInt();
        int aN = sc.nextInt();
        int bM = sc.nextInt();
        int bN = sc.nextInt();
        int cM = sc.nextInt();
        int cN = sc.nextInt();
        int area = sc.nextInt();
        int sum = 0;
        if(cheap == a){
            sum+=(area1*cheap);
            area = area-area1;
            if(cost == b){
                sum+=((bM*bN)*cost);
                area = area - (bM*bN);
                sum+=(area*c);
            }
            else{
                sum+=((cM*cN)*cost);
                area = area - (cM*cN);
                sum+=(area*b);
            }
        }
        else if(cheap == b){
            sum+=(area2*cheap);
            area = area-area2;
            if(cost == a){
                sum+=((aM*aN)*cost);
                area = area - (aM*aN);
                sum+=(area*c);
            }
            else{
                sum+=((cM*cN)*cost);
                area = area - (cM*cN);
                sum+=(area*a);
            }
        }
        else if(cheap == c){
            sum+=(area3*cheap);
            area = area-area3;
            if(cost == b){
                sum+=((bM*bN)*cost);
                area = area - (bM*bN);
                sum+=(area*a);
            }
            else{
                sum+=((aM*aN)*cost);
                area = area - (aM*aN);
                sum+=(area*b);
            }
        }
        System.out.print(sum);
    }
    public static void characterToUpperCase(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        for(int i=0;i<len;i++){
            System.out.print(Character.toUpperCase(sc.next().charAt(0)));
        }
    }
    public static void nthOccurance(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        char c = sc.next().charAt(0);
        int n = sc.nextInt();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == c) count++;
            if(count == n){
                System.out.println(s.length()-i);
                break;
            }
        }
         System.out.print(-1);
    }
    public static void extractingNumberFromString(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        for(int k=0;k<t;k++){
            String str;
            char ch;
            str = s.nextLine();
            boolean flag = false;
            for(int i=0; i<str.length(); i++)
            {
                ch = str.charAt(i);
                if(Character.isDigit(ch)){
                    System.out.print(ch);
                    flag = true;
                }
                else if(flag){
                    System.out.print(" ");
                    flag = false;
                }
            }
            System.out.println();
        }
    }
    public static void capitalizeVowel(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String s = sc.nextLine();
            String vowels="[aeiouAEIOU]{1}";
            for(int j=0;j<s.length();j++){
                String c = ""+s.charAt(j);
                if(c.matches(vowels)){
                    System.out.print(Character.toUpperCase(s.charAt(j)));
                }
                else{
                    System.out.print(Character.toLowerCase(s.charAt(j)));
                }
            }
            System.out.println();
        }
    }
    public static void strongPassword(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String regex = "^(?=.*[A-Z]{1,})(?=.*[a-z]{1,})(?=.*[0-9]{1,})(?=.*[^A-Za-z0-9]{1,}).{8,}$";
        if(s.length()>=8){
            if(s.contains(regex)) System.out.print("Your Password is Strong");
            else System.out.print("Your Password is Not Strong");
        }
        else System.out.print("Your Password is Not Strong");
    }
    public static void numberOccurance(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char n = sc.next().charAt(0);
        int count = 0;
        String res = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == n){
                count++;
                res = res + i + " ";
            }
        }
        System.out.println(count);
        System.out.println(res);
    }
    public static void stealHouses(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int h = (int)Math.ceil(sc.nextDouble()/2);
            int m = sc.nextInt();
            System.out.println(h*m);
        }
    }
    public static void hexaToBinary(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int d = Integer.parseInt(s,16);
        String bin = Integer.toBinaryString(d);
        if(bin.length()<(4*s.length())){
            int a = (4*s.length()) - bin.length();
            bin = "0".repeat(a) + bin;
        }
        System.out.print(bin);
    }
    public static void palindrome(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
    }
    public static void 24Hours(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        sc.nextLine();
        String ap = sc.next();
        if(ap.equals("pm")){
            if(h!=12) h+=12;
        }
        System.out.print((h<10?"0"+h:h)+":"+(m<10?"0"+m:m)+":"+(s<10?"0"+s:s));
    }
    public static void excel(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        int k = 0;
        for(int i=s.length()-1;i>=0;i--){
            sum+= ((int)(Math.pow(26,k)) * (int)(s.charAt(i)-64));
            k++;
        }
        System.out.print(sum);
    }
    public static void setBit(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String bin = Integer.toBinaryString(a);
        int count = 0;
        int start = -1;
        int end = -1;
        for(int i=bin.length()-1;i>=0;i--){
            if(bin.charAt(i) == '1'){
                count++;
                if(start == -1) start = bin.length()-1-i;
                end = bin.length()-1;
            }
        }
        System.out.print(count+"#"+start+"#"+end);
    }
    public static void addingOneToEachBit(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '9') System.out.print((char)(s.charAt(i)+1));
            else  System.out.print(s.charAt(i));
        }
    }
    public static void secondLargestInArray(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int max = 0;
        int  maxx1 = 0;
        for(int i=0;i<len;i++){
            int num = sc.nextInt();
            if(i==0){
                max = num;
                maxx1 = num;
            }
            else{
                if(max<num){
                    maxx1 = max;
                    max = num;
                }
                if(max>num && maxx1<num) maxx1 = num;
            }
        }
        System.out.print(maxx1);
    }
    public static void exactlyTwo(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++){
            int n = sc.nextInt();
            sc.nextLine();
            String[] s = new String[n];
            for(int i=0;i<n;i++) s[i] = sc.next();
            int count = 0;
            int coc;
            for(int i=0;i<n;i++){
                coc = 0;
                for(int j=0;j<n;j++){
                    if(s[i].equals(s[j])) coc++;
                }
                if(coc == 2 ) count++;
            }
            System.out.println(count/2);
        }
    }
    public static void primeAndFibonacci(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int p = 2;
        int f1 = 0;
        int f2 = 1;
        while(count<n){
            count++;
            while(!isPrime(p)) p++;
            System.out.print(p+" ");
            p++;
                System.out.print(f1+" ");
                int temp = f1;
                f1 = f2;
                f2 = temp+f1;
        }
    }
    public static boolean isPrime(int a){
        if(a == 2 || a == 3) return true;
        for(int i=2;i<=a/2;i++){
            if(a%i==0) return false;
        }
        return true;
    }
    public static void decreasingPositionInArrays(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        for(int i=0;i<len-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.print(i+2);
                return;
            }
        }
        System.out.print(-1);
    }
    public static void lengthBetweenRepeatingNumber(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = sc.nextInt();
        int start = s.indexOf(""+a);
        int end = s.lastIndexOf(""+a);
        System.out.print(s.substring(start+1,end).length());
    }
    public static void addingTwoArrays(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr1[] = new int[len];
        int arr2[] = new int[len];
        for(int i=0;i<len;i++) arr1[i] = sc.nextInt();
        for(int i=0;i<len;i++) arr2[i] = sc.nextInt();
        for(int i=0;i<len;i++) System.out.print((arr1[i]+arr2[i])+" ");
    }
    public static void strongNumbers(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        for(int i=1;i<=l;i++){
            if(isStrong(i)) System.out.print(i+" ");
        }
    }
    public static boolean isStrong(int a){
        int sum = 0;
        int n = a;
        while(n>0){
            int rem = n%10;
            int f = fact(rem);
            sum +=f;
            n/=10;
        }
        return a==sum;
    }
    public static int fact(int n){
        int res = 1;
        for(int i=1;i<=n;i++) res = res * i;
        return res;
    }
    public static void insertAtPosition(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        for(int i=0;i<10;i++) arr[i] = sc.nextInt();
        int p = sc.nextInt();
        int ele = sc.nextInt();
        for(int i=10;i>=p;i--){
            arr[i] = arr[i-1];
        }
        arr[p-1] = ele;
        for(int i=0;i<11;i++) System.out.print(arr[i]+" ");
    }
    //--------------------- S3-Pattern-----------------
    public static void S3pattern1(String[] args){
        //input = 4
        //output
        /*
        J
        I H
        G F E
        D C B A
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        int c = (64+sum);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                char q = (char)(c);
                System.out.print(q+" ");
                c--;
            }
            System.out.println();
        }
    }
    public static void S3pattern2(String[] args){
        //input = 5
        //output
        /*
        * * * * *
         * * * *
          * * *
           * *
            *
            *
           * *
          * * *
         * * * *
        * * * * *
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--) System.out.print("* ");
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
    }
    public static void S3pattern3(String[] args){
        //input = 4
        //output
        /*
         4444444
         4333334
         4322234
         4321234
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Value of N: "+n);
        for(int i=1;i<=n;i++){
            for(int j=1;j<2*n;j++){
                if(i==j || i+j == 2*n) System.out.print((n+1-i));
                else if(i<j && i+j<=2*n) System.out.print((n+1-i));
                else if(i>j) System.out.print((n+1-j));
                else System.out.print(j-(n-1));
            }
            System.out.println();
        }
    }
    public static void S3pattern4(String[] args){
        //input = 3
        //output
        /*
         *
         # #
         * * *
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<1) System.out.print("Invalid input");
        else{
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if(i%2==0) System.out.print("# ");
                    else System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    public static void S3pattern5(String[] args){
        //input = 4
        //output
        /*
         1 b c d
         e 6 g f
         i j 11 l
         m n o 16
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 1;
        int s = 97;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i == j){
                    System.out.print(d+" ");
                    d = d + (n+1);
                    s++;
                }
                else{
                    char c = (char)(s);
                    System.out.print(c+" ");
                    s++;
                }
            }
            System.out.println();
        }
    }
    public static void S3pattern6(String[] args){
        //input = 4
        //output
        /*
              *
             * *
            *   *
           *     *
            *   *
             * *
              *
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 1;
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i == 1) {
            }
            else{
                System.out.print(" ".repeat(odd));
                odd+=2;
                System.out.print("*");
            }
            System.out.println();
        }
        odd-=4;
        for(int i=n-1;i>=1;i--){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i>1){
                System.out.print(" ".repeat(odd));
                System.out.print("*");
                odd-=2;
            }
            System.out.println();
        }
    }
    public static void S3pattern7(String args[]){
        //input  = 7
        /*
        ABCDEFGGFEDCBA
        ABCDEF  FEDCBA
        ABCDE    EDCBA
        ABCD      DCBA
        ABC        CBA
        AB          BA
        A            A
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+j));
            }
            for(int j=n-i;j>=1;j--){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print((char)(64+j));
            }
            System.out.println();
        }
    }
    public static void S3pattern8(String[] args){
        /*
          a
         aaa
        aaaaa
         aaa
          a
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char c = sc.next().charAt(0);
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--) System.out.print(" ");
            for(int j=1;j<=(2*i)-1;j++) System.out.print(c);
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=(2*i)-1;j>=1;j--) System.out.print(c);
            System.out.println();
        }
    }
    public static void S3pattern9(String[] args){
        /*
        *         *
         *       *
          *     *
           *   *
            * *
             *
            * *
           *   *
          *     *
         *       *
        *         *
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<2*n;i++){
            for(int j=1;j<2*n;j++){
                if(i==j || i+j == 2*n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void largestOddNumberInAString(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)%2 !=0 ){
                res = s.substring(0,i+1) ;
                break;
            }
        }
        if(res.isEmpty()) System.out.println("Odd Number doesn't exist");
        else System.out.print(res);
    }
    public static void shuffleString(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] res = new int[s.length()];
        for(int i=0;i<s.length();i++) res[i] = sc.nextInt();
        char[] c = new char[res.length];
        for(int i=0;i<res.length;i++){
            char q = s.charAt(i);
            int index = res[i];
            c[index] = q;
        }
        System.out.print(new String(c));
    }
    public static void indicesOfSumInArray(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++) arr[i] = sc.nextInt();
        int target = sc.nextInt();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("Index1: "+i);
                    System.out.println("Index2: "+j);
                    return;
                }
            }
        }
        System.out.println("No two sum solution");
    }
    public static void isomorphic(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        for(int i=0;i<b.length();i++){
            boolean f = true;
            for(int j=0;j<i;j++){
                if(b.charAt(i) == b.charAt(j)){
                    f = false;
                    break;
                }
            }
            if(f){
                a = a.replace(""+a.charAt(i),""+b.charAt(i));
            }
        }
        if(a.equals(b)) System.out.print("true");
        else System.out.print("false");
    }
    public static void numberOfConsecutiveElementsInArray(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int count = 0;
        int[] res = new int[s.length];
        for(int i=0;i<s.length;i++){
             res[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(res);
        int max = 0;
        for(int i=0;i<s.length-1;i++){
            if(res[i]+1 == res[i+1]) count++;
            else{
                if(max<count){
                    max = count;
                    count = 0;
                }
                else if(max == count){
                    System.out.print(0);
                    return;
                }
            }
        }
        if(max>count)System.out.print(max+1);
        else if(count>max) System.out.print(count+1);
        else System.out.print(0);
    }
    public static void spiralMatrix(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++) arr[i][j] = sc.nextInt();
        }
        int right = 0;
        int left = c-1;
        int top = 0;
        int down = r-1;
        while(right<=left && top<=down){
            for(int i=right;i<=left;i++) System.out.print(arr[top][i]+" ");
            top++;
            for(int i=top;i<=down;i++) System.out.print(arr[i][down]+" ");
            left--;
            for(int i=left;i>=right;i--) System.out.print(arr[down][i]+" ");
            down--;
            for(int i=down;i>=top;i--) System.out.print(arr[i][right]+" ");
            right++;
        }
    }
    public static void determinant(String[] args){
        Scanner sc = new Scanner(System.in);
        int len1 = sc.nextInt();
        int len2 = sc.nextInt();
        int[][] arr1 = new int[len1][len2];
        for (int i=0;i<len1;i++){
            for(int j=0;j<len2;j++) arr1[i][j] = sc.nextInt();
        }
        System.out.print("Determinant of the matrix ="+coFactor(arr1));
    }
    public static int coFactor(int arr[][]){
        if(arr[0].length == 2){
            return (arr[0][0]*arr[1][1])-(arr[1][0]*arr[0][1]);
        }
        int d = 0;
        int len = arr[0].length;
        for(int i=0;i<len;i++){
            int s = arr[0][i];
            int[][] n = returnArray(arr,0,i);
            if(i%2==0){
                d+= (s*coFactor(n));
            }
            else d-= (s*coFactor(n));
        }
        return d;
    }
    public static int[][] returnArray(int[][] arr,int r,int c){
        int len = arr[0].length - 1;
        int[][] n = new int[len][len];
        int row = 0;
        int col = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i == r || j == c){
                }
                else{
                    if(col==len){
                        col = 0;
                        row++;
                    }
                    n[row][col++] = arr[i][j];
                }
            }
        }
        return n;
    }
    public static void sparseMatrix(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int check = (row*col)/2;
        int total = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(sc.nextInt() == 0) total++;
            }
        }
        if(total>=check) System.out.print("The given matrix is Sparse matrix");
        else System.out.print("The given matrix is not a Sparse matrix");
    }
    public static void modifiedArray(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++) arr[i] = sc.nextInt();
        int start = len-2;
        int end = 1;
        while(start>=0 && end<=len-1){
            System.out.print(arr[start]+" "+arr[end]+" ");
            start-=2;
            end+=2;
        }
    }
    public static void consecutiveDigits(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = true;
        char c = s.charAt(0);
        int i=1;
        int count1 = 1;
        while(i<s.length()){
            if(c == s.charAt(i)+1){
                c = s.charAt(i);
                count1++;
            }
            i++;
        }
        i = 1;
        c = s.charAt(0);
        int count2 = 1;
        while(i<s.length()){
            if(c == s.charAt(i)-1){
                c = s.charAt(i);
                count2++;
            }
            i++;
        }
        if(count1==3 || count2==3) System.out.print("yes");
        else System.out.print("no");
    }
    public static void numberOfMoves(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len+1];
        int a = 1;
        for(int i=1;i<=len;i++){
            for(int j=1;j<=len;j++){
                if(j%i == 0){
                    if(arr[j]==0) arr[j] =1;
                    else arr[j] = 0;
                }
            }
        }
        int count = 0;
        for(int i=1;i<=len;i++){
            if(arr[i] == 1) count++;
        }
        System.out.print(count);
    }
    public static void addingBinary(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if(a.length()<b.length()){
            a = "0".repeat(b.length()-a.length()) + a;
        }
        else if(a.length()>b.length()){
            b = "0".repeat(a.length()-b.length()) + b;
        }
        a = reverseString(a);
        b = reverseString(b);
        String res = "";
        int borrow = 0;
        for(int i=0;i<a.length();i++){
            int q1 = a.charAt(i) - 48;
            int q2 = b.charAt(i) - 48;
            int sum = borrow+q1+q2;
            if(sum == 2){
                sum = 0;
                borrow = 1;
            }
            else if(sum == 3){
                sum = 1;
                borrow = 1;
            }
            res = res + sum;
        }
        res = res + borrow;
        res = reverseString(res);
        int i=0;
        while (res.charAt(i) == '0') {
            i++;
        }
        System.out.print(res.substring(i));
    }
    public static String reverseString(String s){
        String res = "";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
    public static void slidingWindow(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().replace("[","").replace("]","").split(",");
        int a = sc.nextInt();
        for(int i=0;i<=s.length-a;i++){
            int max = Integer.parseInt(s[i+1]);
            for(int j=i+1;j<i+a;j++){
                if(max<Integer.parseInt(s[j])) max = Integer.parseInt(s[j]);
            }
            System.out.print(Math.max(Integer.parseInt(s[i]),max));
            if(i<s.length-a) System.out.print(",");
        }
    }
    public static void longestSubsequence(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++) arr[i] = sc.nextInt();
        int count = 1;
        int max = 0;
        for(int i=1;i<len;i++){
            if(arr[i]>arr[i-1]) count++;
            else{
                if(max<count){
                    max = count;
                    count = 1;
                }
            }
        }
        if(count>max) max = count;
        System.out.print(max);
    }
    public static void depthOfNestedList(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = 0;
        int sum = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '[') k++;
            else if(s.charAt(i)>=48 && s.charAt(i)<=57){
                sum = sum + ((s.charAt(i)-48)*i);
            }
            else if(s.charAt(i) == ']') k--;
        }
        System.out.print(sum);
    }
    public static void lastDigitOfPower(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();
        a = a%10;
        if(a == 2 || a == 3 || a == 7 || a == 8){
            int rem = b%4;
            if(rem == 0){
                if(a==2||a==8) System.out.print(6);
                else System.out.print(1);
            }
            else System.out.print((int)(Math.pow(a,rem))%10);
        }
        else if(a==4||a==9){
            int rem = b%2;
            if(rem==0) System.out.print(a==4?6:1);
            else System.out.print(a);
        }
        else System.out.print(a);
    }
    public static void rotateArray(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++) arr[i] = sc.nextInt();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int temp = arr[len-1];
            for(int j=len-1;j>0;j--) arr[j] = arr[j-1];
            arr[0] = temp;
        }
        for(int i=0;i<len;i++) System.out.print(arr[i]+" ");
    }
    public static void median(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
            if(i==0)System.out.println(arr[i]);
            else{
                if(i%2!=0){
                    int m = (i)/2;
                    int median = (arr[m]+arr[m+1])/(i+1);
                    System.out.println(median);
                }
                else{
                    int m = i/2;
                    System.out.println(arr[m]/(i+1));
                }
            }
        }
    }
    public static void intersectionOfArray(String[] args){
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int[] a1 = new int[l1];
        int[] a2 = new int[l2];
        for(int i=0;i<l1;i++) a1[i] = sc.nextInt();
        for(int i=0;i<l2;i++) a2[i] = sc.nextInt();
        for(int i=0;i<l1;i++){
            int n = a1[i];
            for(int j=0;j<l2;j++){
                if(n == a2[j]){
                    System.out.print(n+" ");
                    break;
                }
            }
        }
    }
    public static void PinNumber(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] a = new int[len];
        for(int i=0;i<len;i++){
            int n = sc.nextInt();
            n = singleDigit1(n);
            a[i] = n;
            if(a[i]%2!=0){
                System.out.print((char)(96+a[i]));
            }
            else System.out.print(a[i]);
        }
    }
    public static int singleDigit1(int num){
        while(num>9){
            num = r(num);
        }
        return num;
    }
    public static void sortedSquareOfArray(String[] args){
        Scanner sc = new Scanner(System.in);
        int len=sc.nextInt();
        int[] a = new int[len];
        for(int i=0;i<len;i++){
            int n = sc.nextInt();
            a[i] = n*n;
        }
        Arrays.sort(a);
        for(int i=0;i<len;i++) System.out.print(a[i]+" ");
    }
    public static void minimumDifference(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++){
            int len = sc.nextInt();
            int[] a = new int[len];
            for(int i=0;i<len;i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            int min = 0;
            for(int i=0;i<len-1;i++){
                if(i==0){
                    min = a[i+1]-a[i];
                }
                else{
                    if((a[i+1]-a[i])<min) min = (a[i+1]-a[i]);
                }
            }
            System.out.println(min);
        }
    }
    public static void leaders(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i=0;i<len;i++) arr[i] = sc.nextInt();
        for(int i=0;i<len;i++){
            boolean f = true;
            for(int j=i+1;j<len;j++){
                if(arr[i]<arr[j]){
                    f = false;
                    break;
                }
            }
            if(f) System.out.print(arr[i]+" ");
        }
    }
    public static void zigZagOrder(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<len-1;i++){
            if(i%2!=0){
                if(arr[i]<arr[i+1]) swap(arr,i,i+1);
            }
        }
        System.out.print("[");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]);
            if(i<len-1) System.out.print(", ");
        }
        System.out.print("]");
    }
    public static void stringIntegerPair(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String arr1[] = new String[len];
        int arr2[] = new int[len];
        for(int i=0;i<len;i++){
            arr1[i] = sc.next();
            arr2[i] = sc.nextInt();
            sc.nextLine();
        }
        char c = sc.next().charAt(0);
        int sum=0;
        for(int i=0;i<len;i++){
            if(arr1[i].charAt(0) == c) sum+=arr2[i];
        }
        System.out.print(sum);
    }
    public static void leftAndRightRotation(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int r = sc.nextInt();
        String r1 = "";
        String s1 = new String(s);
        String r2 = "";
        String s2 = new String(s);
        for(int i=0;i<r;i++){
            char c = s1.charAt(0);
            for(int j=1;j<s1.length();j++){
                r1+=s1.charAt(j);
            }
            r1 = r1+c;
            s1 = r1;
            r1="";
        }
        System.out.println("Left Rotation:\""+s1+"\"");
        for(int i=0;i<r;i++){
            char c = s2.charAt(s2.length()-1);
            for(int j=0;j<s2.length()-1;j++){
                r2+=s2.charAt(j);
            }
            r2 =""+c+r2;
            s2 = r2;
            r2="";
        }
        System.out.println("Right Rotation:\""+s2+"\"");
    }
    public static void postalAddress(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String regex = "[0-9]{1,}[a-zA-Z]{1} Sector [A-Za-z]{1}";
        if(s.matches(regex)) System.out.println("True");
        else System.out.println("False");
    }
    public static void anagrams(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int k=0;k<t;k++){
            String a = sc.next();
            String b = sc.next();
            boolean flag = true;
            for(int i=0;i<a.length();i++){
                flag = false;
                for(int j=0;j<b.length();j++){
                    if(a.charAt(i) == b.charAt(j)){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    System.out.println("False");
                    break;
                }
            }
            if(flag)System.out.println("True");
        }
    }
    public static void jewelsAndStone(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a = sc.next();
        int count = 0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<a.length();j++){
                if(s.charAt(i) == a.charAt(j)) count++;
            }
        }
        System.out.print(count);
    }
    public static void rotationOfEachOther(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String q = sc.next();
        char[] c = q.toCharArray();
        for(int i=0;i<s.length();i++){
            char temp = c[0];
            for(int j=0;j<c.length-1;j++){
                c[j] = c[j+1];
            }
            c[c.length-1] = temp;
            if(s.equals(new String(c))){
                System.out.print(s+" and "
                + q +" are rotation of each other");
                return;
            }
        }
        System.out.print("Not a rotation of each other");
    }
    public static void nextDate(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate locale = LocalDate.parse(s,formatter);
        LocalDate nextDay = locale.plusDays(1);
        String res = nextDay.format(formatter);
        System.out.print(res);
    }
    public static void modifyOnlyDigit(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                System.out.print((char)(s.charAt(i) + 1));
            }
            else System.out.print(s.charAt(i));
        }
    }
    public static void onesComplement(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("1's complement: ");
        String ones = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0') ones+= "1";
            else ones+="0";
        }
        System.out.print(ones);
        System.out.println("2's complement: "+addingBinary(ones,"1"));
    }
    public static String addingBinary(String a,String b){
        Scanner sc = new Scanner(System.in);
        if(a.length()<b.length()){
            a = "0".repeat(b.length()-a.length()) + a;
        }
        else if(a.length()>b.length()){
            b = "0".repeat(a.length()-b.length()) + b;
        }
        a = reverseString(a);
        b = reverseString(b);
        String res = "";
        int borrow = 0;
        for(int i=0;i<a.length();i++){
            int q1 = a.charAt(i) - 48;
            int q2 = b.charAt(i) - 48;
            int sum = borrow+q1+q2;
            if(sum == 2){
                sum = 0;
                borrow = 1;
            }
            else if(sum == 3){
                sum = 1;
                borrow = 1;
            }
            else borrow = 0;
            res = res + sum;
        }
        res = res + borrow;
        res = reverseString(res);
        int i=0;
        while (res.substring(i).length()>a.length()&&res.charAt(i) == '0') {
            i++;
        }
        return res.substring(i);
    }
    public static void extractingSecondsFromString(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        String regex = "[0-9]{2}:[0-9]{2}:[0-9]{2}:";
        String res = "";
        for(int i=0;i<s.length;i++){
            if(s[i].matches(regex)){
                res = s[i];
                break;
            }
        }
        System.out.println(res.split(":")[2]);
    }
    public static void cricket(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int b1 = 0;
        int b2 = 0;
        int bow = 0;
        int total = 0;
        boolean bat1 = true;
        boolean bat2 = false;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == 'Y'){
                total++;
                bow++;
            }
            else if(c == '.') continue;
            else if(c>=48 && c<=57){
                if(bat1){
                        int n = c - 48;
                        if(n%2!=0){
                            b1+=n;
                            total+=n;
                            bow+=n;
                            bat2 = true;
                            bat1 = false;
                        }
                        else{
                            b1+=n;
                            total+=n;
                            bow+=n;
                        }
                }
                else {
                    int n = c - 48;
                    if(n%2!=0){
                        b2+=n;
                        total+=n;
                        bow+=n;
                        bat1 = true;
                        bat2 = false;
                    }
                    else{
                        b2+=n;
                        total+=n;
                        bow+=n;
                    }
                }
            }
            else{
                System.out.print("Invalid");
                return;
            }
        }
        System.out.println("BATSMAN 1: "+b1);
        System.out.println("BATSMAN 2: "+b2);
        System.out.println("BOWLER: "+total);
    }
    public static void variableTypes(String[] args){
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        int string = 0;
        int integer = 0;
        int fl = 0;
        for(int i=0;i<s.length;i++){
            if(s[i].matches("[0-9]+")) integer++;
            else if(s[i].matches("[0-9]+\\.[0-9]+")) fl++;
            else string++;
        }
        System.out.println("string " + string);
        System.out.println("integer " + integer);
        System.out.println("double " + fl);
    }
    public static void longestPalindrome(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        boolean f = true;
        for(int i=0;i<s.length();i++){
            boolean flag = true;
            int count = 0;
            for(int j=0;j<i;j++){
                if(s.charAt(i) == s.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                for(int j=i;j<s.length();j++){
                    if(s.charAt(i) == s.charAt(j)) count++;
                }
            }
            if(count>1){
                if(count%2==0) sum+=count;
                else sum += (count-1);
            }
            else if(count == 1 && f){
                sum++;
                f = false;
            }
        }
        System.out.println(sum);
    }
    public static void replaceStringWithAnotherString(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int k=0;k<t;k++){
            String s = sc.nextLine();
            String q = sc.nextLine();
            for(int i=0;i<q.length();i++){
                s = s.replaceAll(""+q.charAt(i),"");
            }
            System.out.println(s);
        }
    }
    public static void commonPrefix(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int a[]  = new int[s.length];
        for(int i=0;i<s.length;i++){
            a[i] = s[i].length();
        }
        Arrays.sort(a);
        int len = a[0];
        String t = s[0];
        for(int i=0;i<t.length();i++){
            boolean flag = true;
            for(int j=1;j<s.length;j++){
                if(t.charAt(i) != s[j].charAt(i)){
                    flag = false;
                    return;
                }
            }
            if(flag) System.out.print(t.charAt(i));
        }
    }
    public static void removingLeadingZero(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0;
        while(s.charAt(i) == '0') i++;
        System.out.print(s.substring(i));
    }
    public static void smallestNumberByRemovingDigits(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        if(s.length() == n){
            System.out.print(0);
            return;
        }
        int smallest = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<s.length();j++){
                if(j == 0){
                    smallest = Integer.parseInt(s.substring(1));
                }
                else if(j<s.length()-1){
                    String q = s.substring(0,j) + s.substring(j+1);
                    int now  = Integer.parseInt(q);
                    if(smallest>now) smallest = now;
                }
                else {
                    String q = s.substring(0,j);
                    int now  = Integer.parseInt(q);
                    if(smallest>now) smallest = now;
                }
            }
            s = ""+smallest;
        }
        System.out.print(s);
    }
    public static void largeValuedOddInteger(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max  = 0;
        boolean f = false;
        for(int i=s.length();i>0;i--){
            String q = s.substring(0,i) + s.substring(i+1);
            int k = Integer.parseInt(q);
            if(k%2!=0){
                f = true;
                if(max<k) max = k;
            }
        }
        if(f) System.out.print(max);
        else System.out.print("There are no odd numbers in "+s);
    }
    public static void reverseEachStringInSequence(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        for(int i=0;i<s.length;i++){
            s[i] = s[i].toLowerCase();
            char[] temp = s[i].toCharArray();
            int start = 0;
            int end = temp.length-1;
            while(start<end){
                while(Character.isDigit(temp[start])){
                    start++;
                    if(start>=temp.length) break;
                }
                while(Character.isDigit(temp[end])){
                    end--;
                    if(end<0) break;
                }
               if(start<end) swap(temp,start,end);
               start++;
               end--;
            }
            String res = new String(temp);
            res = res.substring(0,1).toUpperCase()
                    + res.substring(1);
            System.out.print(res+" ");
        }
    }
    public static void swap(char[] c,int i,int j){
        char m = c[i];
        c[i] = c[j];
        c[j] = m;
    }
    public static void substringBetweenTwoEqualCharacter(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        boolean flag = false;
        boolean f;
        for(int i=0;i<s.length();i++){
            f = true;
            int count = 0;
            for(int j=0;j<i;j++){
                if(s.charAt(i) == s.charAt(j)){
                    f = false;
                    break;
                }
            }
            if(f){
                if(s.substring(i+1).contains(""+s.charAt(i))){
                    int k = i+1;
                    while(s.charAt(k) != s.charAt(i)){
                        count++;
                        k++;
                    }
                }
                if(i==0) max = count;
                else {
                    if(max<count) max = count;
                }
            }
        }
        System.out.print(max);
    }
    public static void minimumDenomination(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++){
            int n = sc.nextInt();
            if(n<1 || n>10000){
                System.out.print("Invalid Input");
            }
            else{
                int fiveH = 0;
                int H = 0;
                int fifty = 0;
                int twenty = 0;
                int ten = 0;
                int five = 0;
                int two = 0;
                int one = 0;
                while(n>0){
                    while(n>=500){
                        fiveH = n/500;
                        n = n%500;
                    }
                    while(n>=100){
                        H = n/100;
                        n = n%100;
                    }
                    while(n>=50){
                        fifty = n/50;
                        n = n%50;
                    }
                    while(n>=20){
                        twenty = n/20;
                        n = n%20;
                    }
                    while(n>=10){
                        ten = n/10;
                        n = n%10;
                    }
                    while(n>=5){
                        five = n/5;
                        n = n%5;
                    }
                    while(n>=2){
                        two = n/2;
                        n = n%2;
                    }
                    while(n>=1){
                        one = n/1;
                        n = n%1;
                    }
                }
                System.out.println("500: "+fiveH);
                System.out.println("100: "+H);
                System.out.println("50: "+fifty);
                System.out.println("20: "+twenty);
                System.out.println("10: "+ten);
                System.out.println("5: "+five);
                System.out.println("2: "+two);
                System.out.println("1: "+one);
            }
        }
    }
    public static void maximumTriplet(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++) arr[i] = sc.nextInt();
        int maxSum = 0;
        for(int i=0;i<len-2;i++){
            int sum = arr[i];
            int max1 = -1;
            int max2 = -1;
            for(int j=i+1;j<len-1;j++){
                if(arr[i]<arr[j]){
                    if(j == i+1) max1 = arr[j];
                    else if(arr[j]>max1) max1 = arr[j];
                }
            }
            if(max1 == -1) continue;
            for(int k=i+2;k<len;k++){
                if(max1<arr[k]){
                    if(k == i+2) max2 = arr[k];
                    else if(arr[k]>max2) max2 = arr[k];
                }
            }
            if(max2 == -1) continue;
            int total = sum + max1 + max2;
            if(i==0){
                maxSum = total;
            }
            else if(total>maxSum) maxSum = total;
        }
        System.out.print(maxSum);
    }
    public static void segregate1And0(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        int start = 0;
        int end = len - 1;
        for(int i=0;i<len;i++){
            int n = sc.nextInt();
            if(n == 1){
                arr[end] = n;
                end--;
            }
            else if(n==0){
                arr[start] = n;
                start++;
            }
            else{
                System.out.print("Invalid Input");
                return;
            }
        }
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void tripletZero(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        boolean flag = false;
        for(int i=0;i<len;i++)arr[i] = sc.nextInt();
        for(int i=0;i<len-2;i++){
            for(int j=i+1;j<len-1;j++){
                for(int k=j+1;k<len;k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        flag = true;
                        System.out.println("Elements are "
                        +arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
        if(!flag) System.out.print("No Elements Found");
    }
    public static void pivotListValue(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++) arr[i] = sc.nextInt();
        int p = sc.nextInt();
        ArrayList<Integer> l1 = new ArrayList<>(len);
        ArrayList<Integer> l2 = new ArrayList<>(len);
        ArrayList<Integer> l3 = new ArrayList<>(len);
        for(int i=0;i<len;i++){
            if(arr[i]>p) l3.add(arr[i]);
            else if(arr[i]<p) l1.add(arr[i]);
            else l2.add(arr[i]);
        }
        l1.sort(Comparator.reverseOrder());
        l3.sort(Comparator.reverseOrder());
        for(Integer i : l1){
            System.out.println(i);
        }
        if(!l2.isEmpty()){
            for(Integer i:l2) System.out.println(p);
        }
        for(Integer i : l3) System.out.println(i);
    }
    public static void maximumSumOfConsecutive(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++) arr[i] = sc.nextInt();
        int n = sc.nextInt();
        int maxSum = 0;
        for(int i=0;i<=len-n;i++){
            int sum = 0;
            for(int j = i;j<i+n;j++){
                sum+=arr[j];
            }
            if(i==0) maxSum = sum;
            else if(sum>maxSum)maxSum = sum;
        }
        System.out.print(maxSum);
    }
    public static void mountain(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++) arr[i] = sc.nextInt();
        for(int i=0;i<len;i++){
            if(arr[i]>arr[i+1]){
                System.out.print(i);
                break;
            }
        }
    }
    public static void alternateRotate(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int k=0;k<t;k++){
            String s = sc.nextLine();
            int n = sc.nextInt();
            sc.nextLine();
            if(k%2==0){
                for(int p=0;p<n;p++){
                    String q = s.substring(0,1);
                    s = s.substring(1);
                    s = s+q;
                }
            }
            else{
                for(int p=0;p<n;p++){
                    String q = s.substring(s.length()-1);
                    s = s.substring(0,s.length()-1);
                    s = q+s;
                }
            }
            System.out.println(s);
        }
    }
    public static void reverseStringExceptSpecialCharacter(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] c = sc.nextLine().toCharArray();
        int start = 0;
        int end = c.length-1;
        while (start<end){
            while(!Character.isAlphabetic(c[start])) start++;
            while(!Character.isAlphabetic(c[end])) end--;
            if(start<end){
                swap(c,start,end);
                start++;
                end--;
            }
        }
        String q = new String(c);
        System.out.print(q);
    }
    public static void swap(char[] c,int i,int j){
        char t = c[i];
        c[i] = c[j];
        c[j] = t;
    }
    public static void policeAndThief(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        char[][] q = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                q[i][j] = sc.next().charAt(0);
            }
        }
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(q[i][j] == 'T'){
                    if(search(q[i],j,k)) count++;
                }
            }
        }
        System.out.print(count);
    }
    public static boolean search(char[] c,int j,int k){
        for(int i=0;i<c.length;i++){
            if(c[i] == 'P'){
                if(Math.abs(i-j)<=k){
                    c[i] = 'N';
                    c[j] = 'N';
                    return true;
                }
            }
        }
        return false;
    }
    public static void temperature(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++) arr[i] = sc.nextInt();
        for(int i=0;i<len;i++){
            boolean flag = false;
            for(int j=i+1;j<len;j++){
                if(arr[i]<arr[j]){
                    System.out.print(j-i);
                    flag = true;
                    break;
                }
            }
            if(!flag) System.out.print(0);
            if(i<len-1) System.out.print(",");
        }
    }
    public static void sortingString(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        Arrays.sort(s);
        for(String q : s) System.out.print(q+" "); 
    }
    public static void extractingNumberExcept9(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int l=0;l<t;l++){
            String[] s = sc.nextLine().split(" ");
            boolean f = false;
            for(int i=0;i<s.length;i++){
                s[i] = s[i].replaceAll("[^0-9]","");
                if(s[i].isEmpty()) continue;
                else{
                    if(s[i].contains("9")) continue;
                    else{
                        System.out.print(s[i]+" ");
                        f = true;
                    }
                }
            }
            if(!f) System.out.print(-1);
            System.out.println();
        }
    }
    //------------------------- S4 ---------------------------------------------
     public static void secondFrequentCharacter(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = 0;
        int b = 0;
        char a1 = 'a';
        char b1 = 'b';
        for(int i=0;i<s.length();i++){
            boolean flag = true;
            int count = 0;
            for(int j=0;j<i;j++){
                if(s.charAt(i) == s.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                for(int j=i;j<s.length();j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        count++;
                    }
                }
                if(i == 0){
                    a = count;
                    a1 = s.charAt(i);
                }
                else{
                    if(count>a){
                        b = a;
                        a = count;
                        b1 = a1;
                        a1 = s.charAt(i);
                    }
                    else if(count>b){
                        b = count;
                        b1 = s.charAt(i);
                    }
                }
            }
        }
        if(b>1)System.out.print("Second most frequent character is "+b1);
        else System.out.print("No Second most frequent character");
    }
    public static void master(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String dig =  "^\\D[^aeiouAEIOU]\\d+[AEIOU][A-Z]*\\d+[\\{\\}\\[\\]]";
        boolean flag = true;
        if(s.matches(dig)){
            System.out.print("YES ");
        }
        else{
            System.out.print("NO ");
            flag = false;
        }
        s = s.substring(2,s.length()-1);
        String q[] = s.split("[A-Z]+");
        if(flag){
            int res = Integer.parseInt(q[0])+
                    Integer.parseInt(q[1]);
            System.out.print(res);
        }
        else{
            int res = Integer.parseInt(q[0])-
                    Integer.parseInt(q[1]);
            System.out.print(res);
        }
    }
    public static void reverseTheStringWithSpaces(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int start = 0;
        int end = c.length-1;
        while(start<end){
            while((c[start]<48||c[start]>57)
            &&(c[start]<65||c[start]>90)&&(c[start]<97||c[start]>122)){
                start++;
            }
            while((c[end]<48||c[end]>57)
                    &&(c[end]<65||c[end]>90)&&(c[end]<97||c[end]>122)){
                end--;
            }
            if(start<end){
                swap(c,start,end);
                start++;
                end--;
            }
        }
        String q = new String(c);
        System.out.print(q);
    }
    public static void validParenthesis(String[] args){
        Scanner sc = new Scanner(System.in);
        int test= sc.nextInt();
        sc.nextLine();
        for(int k=0;k<test;k++){
            String s = sc.nextLine();
            if(s.isEmpty()){
                System.out.println("True");
            }
            else{
                boolean flag = true;
                for(int i=0;i<s.length()/2;i++){
                    char c = s.charAt(s.length() - 1 - i);
                    if(s.charAt(i) == '('){
                        if(c != ')'){
                            flag = false;
                            System.out.println("False");
                            break;
                        }
                    }
                    else if(s.charAt(i) == '['){
                        if(c != ']'){
                            flag = false;
                            System.out.println("False");
                            break;
                        }
                    }
                    else if(s.charAt(i) == '{'){
                        if(c != '}'){
                            flag = false;
                            System.out.println("False");
                            break;
                        }
                    }
                    else {
                        flag = false;
                        System.out.println("False");
                        break;
                    }
                }
                if(flag) System.out.println("True");
            }
        }
    }
    public static void rooneyRonaldo(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        sc.nextLine();
        String[][] a = new String[s][2];
        for(int i=0;i<s;i++){
            a[i][0] = sc.next();
            a[i][1] = sc.next();
        }
        String q = sc.next();
        int count = 0;
        ArrayList<String> w = new ArrayList<>();
        for(int i =0;i<s;i++){
            if(a[i][1].equals(q)) w.add(a[i][0]);
        }
        for(int i =0;i<w.size();i++){
            String o = w.get(i);
            for(int j=0;j<s;j++){
                if(a[j][1].equals(o)) count++:
            }
        }
        System.out.print(count);
    }
    public static void destroyingElementsInArray(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++){
            int len = sc.nextInt();
            int[] arr = new int[len];
            int max = 0;
            int in = 0;
            for(int i=0;i<len;i++){
                arr[i] = sc.nextInt();
                if(max<arr[i]){
                    max = arr[i];
                    in = i;
                }
            }
            int turn = len;
            int sum = 0;
            in = in + 1;
            for(int i=1;i<=turn;i++){
                sum+=arr[in]*i + max;
                in = (in+1)%len;
            }
            System.out.println(sum);
        }
    }
    public static void licensePLate(String[] args){
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        String[] words = sc.nextLine().split(" ");
        String reg = "[^a-zA-Z]";
        l = l.replaceAll(reg,"").toLowerCase();
        int index = 0;
        int max = 0;
        for(int i=0;i<words.length;i++){
            String q = words[i].toLowerCase();
            boolean flag = false;
            for(int j=0;j<l.length();j++){
                flag = false;
                for(int k=0;k<q.length();k++){
                    if(l.charAt(j) == q.charAt(k)){
                        flag = true;
                        q = q.replaceFirst(""+l.charAt(j),"");
                        break;
                    }
                }
                if(!flag) break;
            }
            if(flag){
                if(index==0&&max==0){
                    index = i;
                    max = words[i].length();
                }
                else if(max>words[i].length()){
                    index = i;
                    max = words[i].length();
                }
            }
        }
        System.out.print(words[index]);
    }
    public static void christmasAve(String[] args){
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int a = sc.nextInt();
        int b = 0;
        if(money>a){
            System.out.println(a);
            return;
        }
        int count = 0;
        while(a>b){
            count++;
            a--;
            b++;
        }
        System.out.println(count);
    }
    public static void CstyleInnitialization(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(";");
        System.out.println("Integers");
        for(int i=0;i<s.length;i++){
            if(s[i].contains("int")){
                s[i] = s[i].replace("int ","");
                String[] q = s[i].split(",");
                for(String d : q){
                    if(d.length()==1) System.out.println(d+"=junk");
                    else System.out.println(d);
                }
            }
        }
        System.out.println("Characters");
        for(int i=0;i<s.length;i++){
            if(s[i].contains("char")){
                s[i] = s[i].replace("char ","");
                String[] q = s[i].split(",");
                for(String d : q){
                    if(d.length()==1) System.out.println(d+"=junk");
                    else System.out.println(d);
                }
            }
        }
    }
    public static void dictionary(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        String c = sc.nextLine();
        String k = new String(a)+" ";
        for(int i=b.length-1;i>=0;i--){
            a[i] = b[i];
            String q = new String(a);
            if(c.contains(q)){
                k += q+" ";
            }
            else{
                System.out.print("null");
                return;
            }
        }
        System.out.print(k);
    }
    public static void highFrequencyWords(String[] args){
        Scanner sc = new Scanner(System.in);
        String regex = "[^a-zA-Z ]";
        String[] s = sc.nextLine().replaceAll(regex,"").split(" ");
        int max = 0;
        String a = "";
        for(int i=0;i<s.length;i++){
            boolean flag = true;
            int count = 0;
            for(int j=0;j<i;j++){
                if(s[i].equals(s[j])){
                    flag = false;
                    break;
                }
            }
            if(flag){
                for(int j=i;j<s.length;j++){
                    if(s[i].equals(s[j])){
                    count++;
                   }
                }
                if(max<count){
                    max = count;
                    a = s[i];
                }
            }
        }
        if(max == 1) System.out.print("None");
        else System.out.print(a);
    }
    public static void largestElementBetweenPreviousAndNext(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        int[] res = new int[len];
        if(len==2){
            System.out.print(-1);
            return;
        }
        for(int i=0;i<len;i++) arr[i] = sc.nextInt();
        int n = 0;
        int max = 0;
        for(int i=0;i<len;i++){
            if(i==0){
                res[i] = (arr[len-1]*arr[i+1]);
            }
            else if(i==len-1){
                res[i] = (arr[i-1]*arr[0]);
            }
            else res[i] = (arr[i-1]*arr[i+1]);
            if(max<res[i]){
            max = res[i];
            n = i;
        }
        }
        System.out.print(arr[n]);
    }
    public static void ascendingEvenDescendingOdd(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i=0;i<len;i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        ArrayList<Integer> l1 = new ArrayList<>(len);
        ArrayList<Integer> l2 = new ArrayList<>(len);
        for(int i=0;i<len;i++){
            if(arr[i]%2 == 0) l1.add(arr[i]);
        }
        for(int i=len-1;i>=0;i--){
            if(arr[i]%2 != 0) l2.add(arr[i]);
        }
        int small = l1.size()<l2.size()?l1.size():l2.size();
            int i;
        for(i=0;i<small;i++){
            System.out.print(l2.get(i) + " " + l1.get(i)+" ");
        }
        while(i<l1.size()){
            System.out.print(l1.get(i)+" ");
            i++;
        }
        while(i<l2.size()){
            System.out.print(l2.get(i)+" ");
            i++;
        }
    }
    public static void roman(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.next();
        for(int k=0;k<t;k++){
            int a = sc.nextInt();
            if(a>10000){
                System.out.print("Invalid Input");
                return;
            }
            while(a>0){
                if(a>=1000){
                    System.out.print(switchAAA(1000));
                    a = a - 1000;
                }
                else if(a>=500){
                    System.out.print(swichAAA(500));
                    a = a - 500;
                }
                else if(a>=100){
                    System.out.print(swichAAA(100));
                    a = a - 100;
                }
                }
                else if(a>=50){
                    System.out.print(swichAAA(50));
                    a = a - 50;
                }
                }
                else if(a>=10){
                    System.out.print(swichAAA(10));
                    a = a - 10;
                }
                else{
                    for(int i=9;i>=1;i--){
                        if(a==i){
                            System.out.print(switch(i));
                            a = a - i;
                        }
                        if(a==0) return;
                    }
                }
            }
        }
    }
    public static String switchAAA(int c){
        switch(c){
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 50:
                return "L";
            case 100:
                return "C";
            case 500:
                return "D";
            case 1000:
                return "M";
        }
    }
    public static void goatLatin(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        String m = "maa";
        for(int i=0;i<s.length;i++){
            String q = s[i];
            if(q.charAt(0)=='a'||q.charAt(0)=='A'||q.charAt(0)=='E'
              ||q.charAt(0)=='e'||q.charAt(0)=='I'||q.charAt(0)=='i'
              ||q.charAt(0)=='o'||q.charAt(0)=='O'||q.charAt(0)=='u'
               ||q.charAt(0)=='U'){
                System.out.print(q+m+" ");
                m = m+"a";
            }
            else{
                q = q.substring(1) + q.substring(0,1) + m;
                System.out.print(q+" ");
                m = m+"a";
            }
        }
    }
public static void rotateMatrixElements(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int t = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) arr[i][j] = sc.nextInt();
        }
        for(int i=0;i<t;i++) fun(arr);
    }
    public static void fun(int[][] arr){
        int row = 0,col = 0;
        int m = arr.length;
        int n = arr[0].length;
        while(row<m && col<n){
            if(row+1 == m || col+1 == n) break;
            
            int pre = arr[row+1][n-1];
            
            for(int i=n-1;i>=col;i--){
                int cur = arr[row][i];
                arr[row][i] = pre;
                pre = cur;
            }
            row++;
            for(int i=row;i<m;i++){
                int cur = arr[i][col];
                arr[i][col] = pre;
                pre = cur;
            }
            col++;
            for(int i=col;i<n;i++){
                int cur = arr[m-1][i];
                arr[m-1][i] = pre;
                pre = cur;
            }
            m--;
            for(int i=m-1;i>=row;i--){
                int cur = arr[i][n-1];
                arr[i][n-1] = pre;
                pre = cur;
            }
            n--;
        }
    }
static ArrayList<String>
    letterCombinationsUtil(int[] number, int n,
                           String[] table)
    {
        // To store the generated letter combinations
        ArrayList<String> list = new ArrayList<>();
 
        Queue<String> q = new LinkedList<>();
        q.add("");
 
        while (!q.isEmpty()) {
            String s = q.remove();
 
            // If complete word is generated
            // push it in the list
            if (s.length() == n)
                list.add(s);
            else {
                String val = table[number[s.length()]];
                for (int i = 0; i < val.length(); i++) 
                {
                    q.add(s + val.charAt(i));
                }
            }
        }
        return list;
    }
 
    // Function that creates the mapping and
    // calls letterCombinationsUtil
    static void letterCombinations(int[] number, int n)
    {
        // table[i] stores all characters that
        // corresponds to ith digit in phone
        String[] table
            = { "0",   "1",   "abc",  "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz" };
 
        ArrayList<String> list
            = letterCombinationsUtil(number, n, table);
 
        // Print the contents of the list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
 
    // Driver code
    public static void letterC(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("");
        if(s[0].equals("1")){
            System.out.println("No Combination of Strings");
            return;
        }
        int number[] = new int[s.length];
        for(int i=0;i<s.length;i++) number[i] = Integer.parseInt(s[i]);
        int n = number.length;
        letterCombinations(number, n);
    }
static void counterClockspiralPrint(int m, 
                                        int n, 
                                        int arr[][])
    {
        int i, k = 0, l = 0;
 
    /* k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator */
 
        // initialize the count
        int cnt = 0;
 
        // total number of
        // elements in matrix
        int total = m * n;
 
        while (k < m && l < n) 
        {
            if (cnt == total)
                break;
 
            // Print the first column 
            // from the remaining columns
            for (i = k; i < m; ++i)
            {
                System.out.print(arr[i][l] + " ");
                cnt++;
            }
            l++;
 
            if (cnt == total)
                break;
 
            // Print the last row from
            // the remaining rows 
            for (i = l; i < n; ++i) 
            {
                System.out.print(arr[m - 1][i] + " ");
                cnt++;
            }
            m--;
 
            if (cnt == total)
                break;
 
            // Print the last column 
            // from the remaining columns 
            if (k < m) 
            {
                for (i = m - 1; i >= k; --i) 
                {
                    System.out.print(arr[i][n - 1] + " ");
                    cnt++;
                }
                n--;
            }
 
            if (cnt == total)
                break;
 
            // Print the first row 
            // from the remaining rows
            if (l < n) 
            {
                for (i = n - 1; i >= l; --i) 
                {
                    System.out.print(arr[k][i] + " ");
                    cnt++;
                }
                k++;
            }
        }
    }
 
// Driver Code
public static void antiClockwiseSpiral(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int R = sc.nextInt();
    int C = sc.nextInt();
    int arr[][] = new int[R][C];
     for(int i=0;i<R;i++){
         for(int j=0;j<C;j++) arr[i][j] = sc.nextInt();
     }
    // Function calling             
    counterClockspiralPrint(R, C, arr);
}
public static List<Integer> spiralOrder(int[][] matrix) {

        // Number of rows in the matrix
        int m = matrix.length;

        // Number of columns in the matrix
        int n = matrix[0].length;

        // List to store the spiral order elements
        List<Integer> result = new ArrayList<>();

        // Edge case: if matrix is empty
        if (m == 0)
            return result;

        // 2D array to keep track of visited cells
        boolean[][] seen = new boolean[m][n];

        // Arrays to represent the four possible movement
        // directions: right, down, left, up

        // Change in row index for each direction
        int[] dr = {0, 1, 0, -1};

        // Change in column index for each direction
        int[] dc = {1, 0, -1, 0};

        // Initial position in the matrix
        int r = 0, c = 0;

        // Initial direction index (0 corresponds to 'right')
        int di = 0;

        // Iterate through all elements in the matrix
        for (int i = 0; i < m * n; ++i) {

            // Add current element to result list
            result.add(matrix[r][c]);

            // Mark current cell as visited
            seen[r][c] = true;

            // Calculate the next cell coordinates based on
            // current direction
            int newR = r + dr[di];
            int newC = c + dc[di];

            // Check if the next cell is within bounds and not
            // visited
            if (0 <= newR && newR < m && 0 <= newC && newC < n
                    && !seen[newR][newC]) {

                // Move to the next row
                r = newR;

                // Move to the next column
                c = newC;
            } else {

                // Change direction (turn clockwise)
                di = (di + 1) % 4;

                // Move to the next row according to new
                // direction
                r += dr[di];

                // Move to the next column according to new
                // direction
                c += dc[di];
            }
        }

        // Return the list containing spiral order elements
        return result;
    }

    // Main function
    public static void spiralCorrect(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int  c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++) matrix[i][j] = sc.nextInt();
        }
        // Function call to get the spiral order traversal
        List<Integer> result = spiralOrder(matrix);

        // Print the result elements
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static void ordinalString(String[] args){
        String[] s = {"abc","abcd"};
        int m = 2;
        BigInteger[][] arr = new BigInteger[s.length][];
        for(int i=0;i<s.length;i++){
            arr[i] = new BigInteger[s[i].length()];
            for(int j=0;j<s[i].length();j++){
                int o = (int)s[i].charAt(j);
                arr[i][j] = BigInteger.valueOf(o);
                arr[i][j] = arr[i][j].pow(m);
            }
        }
        BigInteger res = new BigInteger("0");
        for(int i=0;i<s.length;i++){
            BigInteger e = multiply(arr[i]);
            System.out.println(e);
            res= res.add(e);
        }
        System.out.print(res);
    }
    public static BigInteger multiply(BigInteger[] arr){
        BigInteger res = arr[0];
        for(int i=1;i<arr.length;i++){
            res = res.multiply(arr[i]);
        }
        return res;
    }
    public static BigInteger add(BigInteger[] arr){
        BigInteger res = arr[0];
        for(int i=1;i<arr.length;i++){
            res = res.add(arr[i]);
        }
        return res;
    }
}
