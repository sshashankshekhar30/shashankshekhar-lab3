package com.gl.service;
import java.util.Collections;
import java.util.Stack;
importjava.util.*;

public class Driver {

	public static void main(String[] args) {
		// Stack implementation
		Stack<Character> stack = new Stack<Character>();
		//Checking empty stack
		if(stack.isEmpty())
		{
			System.out.println("Empty expression");
		}
		else
		{
			String exp = "({[)}]";
			boolean res;
			res = checkingBrackets(exp);
			if(res)
				System.out.println("String is correct");
			else
				System.out.println("Incorrect exp");
		

	}

	private static boolean checkingBrackets(String exp) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<Character>();
		int [] num =  {10,20,30,40,50};
		for(int i=0;i<exp.length();i++)
		{
			char x= exp.charAt(i);
			if(x=='(' || x=='{' || x=='[')
			{
				stack.push(x);
				continue;
			}
			if(stack.isEmpty())
				return false;
			char check;
			switch(x)
			{
			case ')' :
				check = stack.pop();
				if(check=='[' || check =='{')
					return false;
				break;
			case '}' :
				check = stack.pop();
				if(check=='[' || check ==')')
					return false;
				break;
			case ']' :
				check = stack.pop();
				if(check=='(' || check =='{')
					return false;
				break;
			}
		}
		
	}

	}

}
