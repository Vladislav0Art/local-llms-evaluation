package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTextWithTextTextNodeTest {

    @Mock
    private TextNode textNode;

    @Test
    public void textWithTextTextNodeTest() {
        doReturn("New Text").when(textNode).text("New Text");
        assertEquals("New Text", textNode.text());
    }

}