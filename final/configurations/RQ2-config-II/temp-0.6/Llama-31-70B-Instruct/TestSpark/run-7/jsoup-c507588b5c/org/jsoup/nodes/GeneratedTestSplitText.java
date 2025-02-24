package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSplitText {

    @InjectMocks
    private TextNode textNode;

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("Text");
        assertEquals(new TextNode(""), textNode.splitText(0));
    }

}