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
            for(int j=num;j>=2;j--){
                boolean flag = true;
                for(int k = 2;k<=j/2;k++){
                    if(j%k == 0){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    prime = j;
                    System.out.print(prime);
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
        int unique = 0;
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
                System.out.print(arr[i]+" ");
                flag1 = true;
            }
        }
        if(flag1) System.out.print("No unique elements");
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
            if(s.charAt(i) == '1'){
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
}
