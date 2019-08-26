package Either;

public class Left<L,R> implements Either<L,R> {
	private L left;
	
	

	public Left(L left) {
		super();
		this.left = left;
	}

	public L getLeft() {
		return left;
	}

	@Override
	public String toString() {
		return "Left [left=" + left + "]";
	}
	
	
	
}
