package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedEscape {

    @Test
    public void escape() throws IOException {
        TextNode node = new TextNode(HTML);
        Appendable accum = new StringBuilder();
        Document outputSettings = new Document.OutputSettings(true, false);
        node.outerHtmlHead(accum, 0, outputSettings);
        assertEquals("<p>Hello World</p>", accum.toString());
    }
}

}