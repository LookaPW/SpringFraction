package pw.looka.fraction.math.operators;

import org.apache.commons.math3.fraction.Fraction;
import pw.looka.fraction.FracQuestion;

/**
 * @author Luca
 */
public interface FractionOperator {

    char getOperator();

    Fraction calculate(FracQuestion question);
}
