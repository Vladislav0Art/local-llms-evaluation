package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang_evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;

public class GeneratedParseOperatorEqual {

    private Tokenizer tokenizer = new Tokenizer();

    @Test
    public void parseOperatorEqual() throws ParseException {
        String expressionString = "=";
        ExpressionConfiguration configuration = ExpressionConfiguration.empty();
        List<Token> expectedTokens = parseTokenStrings(expressionString, configuration);
        List<Token> actualTokens = tokenizer.parseOperatorEqual();
        assertEquals(expectedTokens, actualTokens);
    }

    private List<Token> parseTokenStrings(String expressionString, ExpressionConfiguration configuration) {
        List<Token> tokens = new ArrayList<>();
        try {
            String[] parts = expressionString.split("\\s+");
            for (String part : parts) {
                Token token = tokenizer.parse(part);
                if (token instanceof TokenTypeKeyword && ((Tokenizer) token).isExpression()) {
                    continue;
                }
                tokens.add(token);
            }
        } catch (ParseException e) {
            // ignore ParseException
        }
        return tokens;
    }

}