package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTextNodeSetTextTest {

    @Mock
    TextNode textNode;

    @Test
    public void textNodeSetTextTest() {
        TextNode textNode = new TextNode("Some Text");
        textNode.text("New Text");
        assertEquals("New Text", textNode.coreValue());
    }

}