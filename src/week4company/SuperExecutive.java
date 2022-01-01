package week4company;

public class SuperExecutive extends Executive {

    public SuperExecutive () {
        super ("23", "23", "23", "23", 0);

    }

    @Override
    public double pay() {
        return super.pay() + 10000000;
    }
}
