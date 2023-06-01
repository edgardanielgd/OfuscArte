package src.utils.Expressions;

import src.gen.SMITHGrammarParser;
import src.utils.Variable;

public class LogicalOperator {
    public static Value evaluate(
            Value leftMost, Value rightMost,
            SMITHGrammarParser.LogicaloperatorContext ctx
    ){
        // Check first if we are able to perform operation
        // Note despite its title, we won't work with numbers all the time actually
        boolean areValidOperands = (
                leftMost.type == Variable.BOOLEAN
        ) && (
                rightMost.type == Variable.BOOLEAN
        );

        if( !areValidOperands )
            return null;

        boolean value;

        if( ctx.AND() != null )
            value = (Boolean) leftMost.value && (Boolean) rightMost.value;

        else if( ctx.OR() != null )
            value = (Boolean) leftMost.value || (Boolean) rightMost.value;

        else
            return null;

        return new Value<>( value, Variable.BOOLEAN );

    }
}
