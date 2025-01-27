package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.Callable;

public class GeneratedOuterHtmlHead {

    private Document documentBuilder = new Document();

    @Test
    public void outerHtmlHead() {
        TextNode node = new TextNode("Hello World");
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        documentBuilder.append(node, 0, output);
        assertEquals("<html><body>Hello World</body></html>", output.toString());
    }

}