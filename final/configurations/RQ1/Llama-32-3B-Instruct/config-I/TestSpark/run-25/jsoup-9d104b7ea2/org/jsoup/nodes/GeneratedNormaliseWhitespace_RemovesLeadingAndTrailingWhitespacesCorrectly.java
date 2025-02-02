package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.mockito.Mockito;

public class GeneratedNormaliseWhitespace_RemovesLeadingAndTrailingWhitespacesCorrectly {

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
    public void normaliseWhitespace_RemovesLeadingAndTrailingWhitespacesCorrectly() {
        assertEquals("test", TextNode.normaliseWhitespace("   test"));
        assertEquals("", TextNode.stripLeadingWhitespace(""));
        assertEquals(StringUtil.normaliseWhitespace("  "), StringUtil.normaliseWhitespace("   "));
    }

}