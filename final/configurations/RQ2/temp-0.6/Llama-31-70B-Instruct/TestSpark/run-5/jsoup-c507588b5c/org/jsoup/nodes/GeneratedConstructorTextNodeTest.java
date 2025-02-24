package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructorTextNodeTest {

    @Mock
    private TextNode textNode;

    @Test
    public void constructorTextNodeTest() {
        TextNode textNode = new TextNode("Text");
        assertEquals("Text", textNode.text());
    }

}