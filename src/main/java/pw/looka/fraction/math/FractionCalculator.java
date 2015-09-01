package pw.looka.fraction.math;

import org.apache.commons.math3.fraction.Fraction;
import pw.looka.fraction.FracQuestion;
import pw.looka.fraction.math.operators.*;

/**
 * @author Luca
 */
public class FractionCalculator {
    public Fraction solve(FracQuestion question) {
        return resolveOperator(question).calculate(question);
    }

    public FractionOperator resolveOperator(FracQuestion question) {
        System.out.println(question);
        switch(question.getOperator()) {
            case '+':
                return new AddFractionOperator();
            case '-':
                return new SubtractFractionOperator();
            case '*':
                return new MultiplyFractionOperator();
            case '/':
                return new DivideFractionOperator();
        }
        return null;
    }
}
