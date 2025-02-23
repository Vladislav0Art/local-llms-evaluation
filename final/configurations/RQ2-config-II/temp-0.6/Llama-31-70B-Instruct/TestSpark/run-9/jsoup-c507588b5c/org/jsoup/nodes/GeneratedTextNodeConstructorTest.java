package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTextNodeConstructorTest {

    @Mock
    TextNode textNode;

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("Some Text");
        assertEquals("Some Text", textNode.coreValue());
    }

}