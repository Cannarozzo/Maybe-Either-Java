package Testes;

import Either.Either;
import Either.Left;
import Either.Right;
import Maybe.Just;
import Maybe.Maybe;
import Maybe.Nothing;

public class Main {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Maybe<Double> safeDiv(Double v1, Double v2) {
		if(v2 == 0) {
			return new Nothing();
		}
		return new Just<Double>(v1 / v2);
	}
	
	public static Either<String,Double> safeDivEither(Double v1, Double v2) {
		if(v2 == 0) {
			return new Left<String,Double>("Erro, não é possivel dividir por zero");
		}
		return new Right<String,Double>(v1 / v2);
	}
	public static void main(String[] args) {
		System.out.println("Maybe safeDiv");		
		System.out.println(safeDiv(2.0,0.0));
		System.out.println();
		System.out.println("Either safeDiv");
		System.out.println(safeDivEither(2.0,0.0));
		
		
	}
}
