package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import org.mockito.SpyBean;

@RunWith(JUnit4.class)
public class GeneratedSplitText_Method_SplitsTextNodeAtOffset {

    @SpyBean
    private LeafNode parentNode;

    @Test
    public void splitText_Method_SplitsTextNodeAtOffset() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        int offset = 6;
        TextNode tailNode = textNode.splitText(offset);
        org.junit.Assert.assertEquals(tailNode.text(), "World");
    }

}