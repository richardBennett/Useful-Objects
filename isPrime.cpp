bool isPrime(long number)
{
	if(number == 2) return true;		//If the number is 2 it is prime
	if(number%2 == 0) return false;		//if the number is even it is not prime
	
	for(int i = 3; i*i < number+1; i+= 2) {	//from 3 to the square root of the number, odd numbers only
		if(number%i == 0) return false;			//if the number is evenly divisible it is not prime
	}
	return true;
}

