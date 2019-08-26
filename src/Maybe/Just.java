package Maybe;

public class Just<A> implements Maybe<A>{
	private A just;

	public A getJust() {
		return just;
	}

	public Just(A just) {
		super();
		this.just = just;
	}

	@Override
	public String toString() {
		return "Just [just=" + just + "]";
	}	
	
	
}
