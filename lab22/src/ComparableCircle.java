
public class ComparableCircle extends Circle implements Comparable{
	
	public ComparableCircle(double radius) {
		super(radius);
	}
	
	
	@Override
	public int compareTo(Object k) {
		if ((getRadius()-((ComparableCircle)k).getRadius()) > 0)
			return 1;
		else if ((getRadius()-((ComparableCircle)k).getRadius()) == 0)
			return 0;
		else
			return -1;
	}
}


