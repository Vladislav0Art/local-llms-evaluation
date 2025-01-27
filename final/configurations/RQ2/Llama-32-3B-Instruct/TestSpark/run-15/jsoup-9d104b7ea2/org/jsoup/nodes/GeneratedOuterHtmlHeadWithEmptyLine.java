package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.Callable;

public class GeneratedOuterHtmlHeadWithEmptyLine {

    private Document documentBuilder = new Document();

    @Test
    public void outerHtmlHeadWithEmptyLine() {
        TextNode node = new TextNode("\n");
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        documentBuilder.append(node, 0, output);
        assertEquals("<html><body></body></html>", output.toString());
    }

}