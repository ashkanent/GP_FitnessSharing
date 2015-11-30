
package ec.app.BreastCancer;
import ec.*;
import ec.gp.*;
import ec.util.*;
/**
 *
 * @author Ashkan Entezari
 */
public class SECS extends GPNode
{
     public String toString() { return "SECS"; }

     public int expectedChildren() { return 0; }

     public void eval(final EvolutionState state,
        final int thread,
        final GPData input,
        final ADFStack stack,
        final GPIndividual individual,
        final Problem problem)
        {
        DoubleData rd = ((DoubleData)(input));
        rd.x = ((CancerAnalyzer)problem).SingleEpithelialCellSize;
        }
}
