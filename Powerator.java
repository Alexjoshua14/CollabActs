import structure5.*;

public class Powerator extends AbstractIterator<Double>{
    //Base number for iterator
    protected Double base;

    //Max number of elements to produce
    protected int rounds;

    //Current number of elements produced
    protected int currentRound;

    //Current power
    protected Double currentNumber;

   
    public Powerator(Double base, int rounds) {
	this.base = base;
	this.rounds = rounds;
	reset();

    }

    //Resets the currrent round back to 0 and
    //the currentNumber back to the basic base
    public void reset() {
	currentRound = 0;
	currentNumber = 1.0;
    }

    //Checks if the currentRound is still less than rounds
    public boolean hasNext() {
	if (currentRound < rounds) {
	    return true;
	}
	return false;
    }

    //Uses the get method and increments the currentRound
    public Double next() {
	currentNumber = get();
	currentRound++;
	return currentNumber;
    }

    public Double get() {
	//Anything to the power of 0 is 12
	//Likewise anything to the power of 1 is itself
	if (currentRound == 0) {
	    return currentNumber;
	}// else if (currentRound == 1) {
	//    return currentNumber;
	//}
	
	Double value;
	value = currentNumber * base;
	return value;
    }

    public static void main(String[] args) {
	Powerator po = new Powerator(2.0, 20);

	for (Double d: po) {
	    System.out.println(d);
	}
	
    }
    
}
