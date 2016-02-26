bool checkPalindrome(int suspect)
{
	int number = suspect;
	int reverseSuspect = 0;

	while(number != 0) {
		reverseSuspect = (reverseSuspect*10) + (number%10);		//Putting the digits in opposite order;
		number /= 10;
	}
	return (reverseSuspect == suspect);
}
