/* 
Q1
public static int getMaximum(int a, int b, int c) {
    return Math.max(Math.max(a, b), c);
}

Q2
public static boolean isSquareNumber(int n) {
    double sqrt = Math.sqrt(n);
    return sqrt == (int) sqrt;
}

Q3
public static int combinationFunction(int n, int k) {
    if (k == 0 || n == k) {
        return 1;
    }
    return combinationFunction(n - 1, k - 1) + combinationFunction(n - 1, k);
}

Q4
public static boolean isPalindrome(int n) {
    int originalNumber = n;
    int reversedNumber = 0;
    
    while (n > 0) {
        int digit = n % 10;
        reversedNumber = reversedNumber * 10 + digit;
        n /= 10;
    }
    
    return originalNumber == reversedNumber;
}

Q5
public static int getDigitsCount(String s) {
    return s.length();
}

Q6
public static int[] generateRandomNumbers() {
    int[] randomNumbers = new int[10];
    for (int i = 0; i < 10; i++) {
        randomNumbers[i] = (int) (Math.random() * 101);
    }
    return randomNumbers;
}

Q7
public static double[] getCircleProperties(double radius) {
    double area = Math.PI * radius * radius;
    double circumference = 2 * Math.PI * radius;
    return new double[] { area, circumference };
}

Q8
public static int getFirstRandomNumberTwice() {
    int randomNumber = (int) (Math.random() * 11);
    return randomNumber;
}
*/
