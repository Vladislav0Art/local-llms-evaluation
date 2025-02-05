package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("test");
        Appendable appendable = Mockito.mock(Appendable.class);
        textNode.outerHtmlHead(appendable, 0, null);
        Mockito.verify(appendable).append("test");
    }

}