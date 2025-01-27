package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.mockito.Mock;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class GeneratedTextNodeConstructWithText_ReturnsTextNode {

    @Mock
    private Document document;

    public String getNormalisedWhitespace() {
        return StringUtil.normaliseWhitespace("   ");
    }

    public void verifyLastCharIsWhitespace(StringBuilder sb) {
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    public static void initMocks(Test test) {
        org.mockito.MockitoAnnotations.initMocks(test);
    }

    public Appendable createMockAppendable() {
        return mock(Appendable.class);
    }

    public ByteArrayOutputStream createMockOutputStream() {
        return mock(ByteArrayOutputStream.class);
    }

    @Before
    public void setup() {
        initMocks(this);
    }

    @Test
    public void textNodeConstructWithText_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello, World!");
        assertNotNull(textNode);
    }

}