package pw.looka.fraction.math.operators;

import org.apache.commons.math3.fraction.Fraction;
import pw.looka.fraction.FracQuestion;

/**
 * @author Luca
 */
public class AddFractionOperator implements FractionOperator {
    @Override
    public char getOperator() {
        return '+';
    }

    @Override
    public Fraction calculate(FracQuestion question) {
        System.out.println("Solving Addition!");
        System.out.println(question);
        Fraction fraction1 = new Fraction(question.getFracTel1(),question.getFracNoem1());
        Fraction fraction2 = new Fraction(question.getFracTel2(),question.getFracNoem2());
        Fraction answer = fraction1.add(fraction2);
        return answer;
    }
}
