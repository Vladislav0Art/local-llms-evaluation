package org.jsoup.nodes;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

}