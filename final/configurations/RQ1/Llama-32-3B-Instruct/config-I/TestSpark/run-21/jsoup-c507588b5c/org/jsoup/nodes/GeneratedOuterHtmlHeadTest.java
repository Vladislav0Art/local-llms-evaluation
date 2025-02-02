package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        String text = "Hello World";
        Document doc = new Document(text);
        Appendable accum = mock(Appendable.class);
        TextNode textNode = doc.getNodes().get(0);
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint = true;
        textNode.outerHtmlHead(accum, depth, out);
        assertNotNull(accum.toString());
    }

}