public class SquareRootProgression extends Progression<Double>{

    /**
     * Constructs a progression with given start value.
     *
     * @param start
     */
    protected Double base;

  //default Constructor
    public SquareRootProgression() {
        this(65536.0);
    }

 //parameter Constructor
    public SquareRootProgression(Double start) {
        super(start);
        base = start;
    }

 //advance method
    @Override
    protected void advance() {
        Double temp = base;
        current = Math.sqrt(temp);
        base = current;

    }
}
