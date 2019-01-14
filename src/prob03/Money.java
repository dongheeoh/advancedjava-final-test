package prob03;

public class Money {

	private int amount;
    
	public Money(int amout) {
		
	}

	public Object add(Money three) {
		
		return three;
	}

	public Object minus(Money two) {
		// TODO Auto-generated method stub
		return two;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}

	public Object multiply(Money two) {
		// TODO Auto-generated method stub
		return two;
	}

	public Object devide(Money five) {
		// TODO Auto-generated method stub
		return five;
	}
    
}
