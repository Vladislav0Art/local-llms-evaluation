package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.mockito.Mockito;

public class GeneratedLastCharIsWhitespace_ReturnsCorrectBooleanValue {

    private TextNode textNode;

    @Before
    public void setup() {
        textNode = new TextNode("");
    }

    public TextNodeMethodUnderTestTest(String method) {
        this.method = method;
    }

    public String methodName() {
        return "[MethodUnderTest]" + method + "Test";
    }

    @Test
    public void lastCharIsWhitespace_ReturnsCorrectBooleanValue() {
        assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder(" ")));
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder("abc")));
    }

}