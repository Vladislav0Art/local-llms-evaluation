package com.ezylang.evalex.parser;

import static com.ezylang.evalex.parser.Token.TokenType.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;

public class Generated[Tokenizer]

__getFunctionDict_SimpleScenarioTest {

    public ExpressionConfiguration configure () {
        // Mock expression configuration
        return new ExpressionConfiguration();
    }

    @Test
    public void [Tokenizer]__getFunctionDict_SimpleScenarioTest() throws ParseException {
        // Mock function dictionary
        List<FunctionIfc> functions = new ArrayList<>();
        functions.add(new FunctionIfc());
        Tokenizer tokenizer = new Tokenizer("1 + 2", configure());

        List<Token> tokens = tokenizer.parse(config);
        assertEquals(3, tokens.size());
        assertHasElements(tokens, new String[]{"INT", "INT", "ADD"});
    }

}