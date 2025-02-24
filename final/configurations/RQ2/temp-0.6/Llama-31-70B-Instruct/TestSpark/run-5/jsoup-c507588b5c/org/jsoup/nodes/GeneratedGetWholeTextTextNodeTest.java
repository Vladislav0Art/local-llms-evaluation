package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetWholeTextTextNodeTest {

    @Mock
    private TextNode textNode;

    @Test
    public void getWholeTextTextNodeTest() {
        doReturn("Whole Text").when(textNode).getWholeText();
        assertEquals("Whole Text", textNode.getWholeText());
    }

}