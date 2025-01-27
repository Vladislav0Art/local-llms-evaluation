package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.Callable;

public class GeneratedOuterHtmlHeadWithNewLine {

    private Document documentBuilder = new Document();

    @Test
    public void outerHtmlHeadWithNewLine() {
        TextNode node = new TextNode("Hello\nWorld");
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        documentBuilder.append(node, 0, output);
        assertEquals("<html><body>Hello<br>World</body></html>", output.toString());
    }

}