package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.mockito.Mockito;

public class GeneratedTextAssignsCorrectValueToTextNode {

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
    public void textAssignsCorrectValueToTextNode() {
        String value = "test";
        textNode.text(value);
        assertEquals(value, textNode.text());
    }

}