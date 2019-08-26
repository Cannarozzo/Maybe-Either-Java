package Either;

public class Right<L,R> implements Either<L,R> {
	private R right;	
	
	public Right(R right) {
		super();
		this.right = right;
	}

	public R getRight() {
		return right;
	}

	@Override
	public String toString() {
		return "Right [right=" + right + "]";
	}
	
	
}
