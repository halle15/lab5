import java.util.ArrayList;

/**
 * The Builder class.
 * @author Tim
 * @version 1
 */
public class Builder
{
    /**
     * Creates a Builder.
     * @param makefile the makefile
     * @throws ParseException
     * @throws UnknownTargetException
     * @throws CycleDetectedException
     */
    public Builder(StringBuffer makefile) throws ParseException,
            UnknownTargetException, CycleDetectedException {
    }

    /**
     * Figures out how to make the given target.
     * @param targetName the target
     * @return the list of required steps
     */
    public ArrayList<String> makeTarget(String targetName)
            throws CycleDetectedException {
        return null;
    }
}
