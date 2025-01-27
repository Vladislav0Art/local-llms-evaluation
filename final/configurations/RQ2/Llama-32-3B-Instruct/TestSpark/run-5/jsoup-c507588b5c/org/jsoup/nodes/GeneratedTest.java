package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.OngoingStubbing;
import org.jsoup.helper.Util;

public class GeneratedTest {

    public void testMocking() {
        MockedStatic mockStatic = Mockito.mockStatic(GeneratedTest.class);
        try {
            initMocks(this);
        } finally {
            mockStatic.close();
        }
    }

    public static void initMocks(Test test) {
        org.mockito.Mockito.initFields(test);
        // Use Util.initField() if you need to initialize fields after calling initFields()
        // Util.initField(test, "yourFieldName", yourFieldValue);
    }

    public interface Appendable extends java.io.Writeable {
    }

    @Test
    public void textNodeConstructWithText_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello, World!");
        assertNotNull(textNode);
    }

    @Test
    public void textNodeGetWholeText_ReturnsTextNodeText() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals("Hello, World!", textNode.text());
    }

    @Test
    public void textNodeIsBlank_ReturnsTrueWhenTextIsEmpty() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void textNodeToReturnString_ReturnsTextNodeText() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals("Hello, World!", textNode.toString());
    }

}