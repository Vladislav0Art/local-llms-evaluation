package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHead_AppendsToAccumulator {

    @Test
    public void outerHtmlHead_AppendsToAccumulator() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        TextNode node = new TextNode("<html><body>Hello World</body></html>");
        Document document = new Document(outContent);
        node.outerHtmlHead(accum, 0, document.getOutputSettings());
        String actualHTML = StringUtil.toString(document.getOutputSettings().getOutput());
        assertEquals("<html><body>Hello World</body></html>", actualHTML);
    }

}