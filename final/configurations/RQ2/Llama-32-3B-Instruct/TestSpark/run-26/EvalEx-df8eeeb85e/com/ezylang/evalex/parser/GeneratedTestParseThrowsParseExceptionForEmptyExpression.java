package com.ezylang.evalex.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.reflect.Method;

public class GeneratedTestParseThrowsParseExceptionForEmptyExpression {

    @Test
    public void testParseThrowsParseExceptionForEmptyExpression() {
        String expression = "";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(configuration.getFunctionDictionaryIfc()).thenReturn(null);
        assertThrows(ParseException.class, () -> new Tokenizer(expression, configuration).parse());
    }
}

class FunctionDictionaryIfc {
}

class ExpressionConfiguration {
    public FunctionDictionaryIfc getFunctionDictionaryIfc() {
        return null;
    }
}

class Token {
    private String type;

    public Token(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Token token = (Token) o;
        return Objects.equals(type, token.type);
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }
}

class ParseException extends Exception {
}

public class Tokenizer {
    private String expression;
    private ExpressionConfiguration configuration;

    public Tokenizer(String expression, ExpressionConfiguration configuration) {
        this.expression = expression;
        this.configuration = configuration;
    }

    public List<Token> parse() throws ParseException {
        // implementation
    }
}
		
		import static org.junit.jupiter.api.Assertions .*;
        import org.junit.jupiter.api.Test;
		import java.util.List;
		import java.util.function.Function;
		import java.lang.reflect.InvocationHandler;
		import java.lang.reflect.Proxy;
		import java.lang.reflect.Method;

class MockedObject<T> implements InvocationHandler {
    private T object;

    public MockedObject(T object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return object.getClass().getMethod(method.getName(), method.getParameterTypes()).invoke(object, args);
    }
}

public class ExpressionConfigurationImpl extends ExpressionConfiguration {
    @Override
    public FunctionDictionaryIfc getFunctionDictionaryIfc() {
        return new FunctionDictionaryIfc();
    }
}

}