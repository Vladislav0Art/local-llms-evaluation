package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtml_GivenTextNode_ReturnsEncodedHtml {

    @Test
    public void outerHtml_GivenTextNode_ReturnsEncodedHtml() throws IOException {
        Document document = new Document("<html><body>" + new TextNode("Hello World").outerHtml());
        assertEquals(document.body().outerHTML(), "<html><body>Hello World</body></html>");
    }

}