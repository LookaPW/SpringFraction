package pw.looka.fraction;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Luca
 */
public class FracQuestion {

    @Size(min=1)
    @NotNull
    private Integer fracTel1;

    @Size(min=1)
    @NotNull
    private Integer fracNoem1;

    @Size(min=1)
    @NotNull
    private Integer fracTel2;

    @Size(min=1)
    @NotNull
    private Integer fracNoem2;

    @NotNull
    private Character operator;


    public FracQuestion() {

    }

    public int getFracTel1() {
        return fracTel1.intValue();
    }

    public void setFracTel1(Integer fracTel1) {
        this.fracTel1 = fracTel1;
    }

    public int getFracNoem1() {
        return fracNoem1.intValue();
    }

    public void setFracNoem1(Integer fracNoem1) {
        this.fracNoem1 = fracNoem1;
    }

    public int getFracTel2() {
        return fracTel2.intValue();
    }

    public void setFracTel2(Integer fracTel2) {
        this.fracTel2 = fracTel2;
    }

    public int getFracNoem2() {
        return fracNoem2.intValue();
    }

    public void setFracNoem2(Integer fracNoem2) {
        this.fracNoem2 = fracNoem2;
    }

    public char getOperator() {
        return operator.charValue();
    }

    public void setOperator(Character operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return fracTel1 + "/" + fracNoem1 + " " + operator + " " + fracTel2 + "/" + fracNoem2;
    }
}
