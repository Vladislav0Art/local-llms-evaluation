package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("text");
        Appendable appendable = new StringBuilder();
        textNode.outerHtmlHead(appendable, 0, new Document.OutputSettings());
        assertEquals("text", appendable.toString());
    }

}