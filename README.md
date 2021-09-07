# 3n-plus-1

My solution for Chapter 8 Exercise 2 of “Introduction to Programming Using Java”.

Problem Description:
As discussed in Section 8.1, values of type int are limited to 32 bits. Integers that are too
large to be represented in 32 bits cannot be stored in an int variable. Java has a standard
class, java.math.BigInteger, that addresses this problem. An object of type BigInteger
is an integer that can be arbitrarily large. (The maximum size is limited only by the
amount of memory available to the Java Virtual Machine.) Since BigIntegers are objects,
they must be manipulated using instance methods from the BigInteger class. For example,
you can’t add two BigIntegers with the + operator. Instead, if N and M are variables that
refer to BigIntegers, you can compute the sum of N and M with the function call N.add(M).
The value returned by this function is a new BigInteger object that is equal to the sum of
N and M.
The BigInteger class has a constructor new BigInteger(str), where str is a string.
The string must represent an integer, such as “3” or “39849823783783283733”. If the string
does not represent a legal integer, then the constructor throws a NumberFormatException.
There are many instance methods in the BigInteger class. Here are a few that you will
find useful for this exercise. Assume that N and M are variables of type BigInteger.
• N.add(M) — a function that returns a BigInteger representing the sum of N and M.
• N.multiply(M) — a function that returns a BigInteger representing the result of
multiplying N times M.
• N.divide(M) — a function that returns a BigInteger representing the result of divid-
ing N by M, discarding the remainder.
• N.signum()—a function that returns an ordinary int. The returned value represents
the sign of the integer N. The returned value is 1 if N is greater than zero. It is -1 if
N is less than zero. And it is 0 if N is zero.
• N.equals(M) — a function that returns a boolean value that is true if N and M have
the same integer value.
• N.toString() — a function that returns a String representing the value of N.
• N.testBit(k)—a function that returns a boolean value. The parameter k is an inte-
ger. The return value is true if the k-th bit in N is 1, and it is false if the k-th bit is 0.
Bits are numbered from right to left, starting with 0. Testing “if (N.testBit(0))”
is an easy way to check whether N is even or odd. N.testBit(0) is true if and only
if N is an odd number.
For this exercise, you should write a program that prints 3N+1 sequences with starting
values specified by the user. In this version of the program, you should use BigIntegers
to represent the terms in the sequence. You can read the user’s input into a String with
the TextIO.getln() function or with the nextLine() function of a Scanner. Use the
input value to create the BigInteger object that represents the starting point of the 3N+1
sequence. Don’t forget to catch and handle the NumberFormatException that will occur if
the user’s input is not a legal integer! The program should not end when that happens;
it should just output an error message. You should also check that the input number is
greater than zero.
If the user’s input is legal, print out the 3N+1 sequence. Count the number of terms
in the sequence, and print the count at the end of the sequence. Exit the program when
the user inputs an empty line.
