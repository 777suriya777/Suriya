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
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print((char)(64+j));
            }
            System.out.println();
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
            char c = s.charAt(s2.length()-1);
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
}
