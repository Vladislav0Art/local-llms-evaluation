package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws Exception {
        TextNode textNode = new TextNode("text");
        Appendable accum = Mockito.mock(Appendable.class);
        textNode.outerHtmlHead(accum, 0, Jsoup.parse("").outputSettings());
        Mockito.verify(accum).append("text");
    }

}