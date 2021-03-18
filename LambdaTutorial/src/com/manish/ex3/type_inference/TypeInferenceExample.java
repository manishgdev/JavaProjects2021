package com.manish.ex3.type_inference;

public class TypeInferenceExample {
	public static void main(String[] args) {
//		StringLenLambda strLambda = (String a) -> a.length();
		StringLenLambda strLambda = (a) -> a.length(); // Compiler automatically infers the type of parameter for the lambda expression as it already knows the signature of method in the interface
//		StringLenLambda strLambda = (a) -> a.length(); we can eliminate the parenthesis for single parameter lambda expression
		
		System.out.println("String length :- "+strLambda.getLength("Manish"));
		
		lambdaParamMethod(s -> s.length());
		lambdaParamMethod(s -> s.length() * 2);
	}
	
	interface StringLenLambda {
		int getLength(String s);
	}
	
	public static void lambdaParamMethod(StringLenLambda l) {
		System.out.println("Get length of String :- "+ l.getLength("Lambda as parameter;"));
	}
}
