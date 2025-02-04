package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import org.mockito.SpyBean;

@RunWith(JUnit4.class)
public class GeneratedSplitText_Method_SplitsTextNodeAtOffsetWithLeadingWhitespace {

    @SpyBean
    private LeafNode parentNode;

    @Test
    public void splitText_Method_SplitsTextNodeAtOffsetWithLeadingWhitespace() throws IOException {
        String text = "   Hello World";
        int offset = 3;
        TextNode tailNode = new TextNode(text).splitText(offset);
        org.junit.Assert.assertEquals(tailNode.text(), "World");
    }

}