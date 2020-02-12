package expression.operation.unchecked;

import expression.TripleExpression;
import expression.operation.BinaryOperation;

/**
 * @author Popov Vladimir (vova_57@bk.ru)
 */
public class RightShift extends BinaryOperation {
    public RightShift(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    @Override
    protected int evaluateImpl(int left, int right) {
        return left >> right;
    }
}
