class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int number = x;
        int reverse = 0;
        if(number < 0)
        {
            return false;
        }
        while(x != 0)
        {
            int digit = x % 10; //get last digit
            reverse = (reverse*10 + digit); //add digit to reverse 
            x /= 10; //remove digit from current
        }
        if (number == reverse)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
