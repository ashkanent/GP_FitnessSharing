
package ec.app.BreastCancer;
import ec.gp.*;
/**
 *
 * @author Ashkan Entezari
 */

public class DoubleData extends GPData
    {
    public double x;    // return value

    public void copyTo(final GPData gpd)   // copy my stuff to another DoubleData
        { ((DoubleData)gpd).x = x; }
    }
