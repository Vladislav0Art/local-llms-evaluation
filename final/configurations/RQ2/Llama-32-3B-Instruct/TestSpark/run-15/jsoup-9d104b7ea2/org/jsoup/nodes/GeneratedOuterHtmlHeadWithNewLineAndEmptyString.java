package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.Callable;

public class GeneratedOuterHtmlHeadWithNewLineAndEmptyString {

    private Document documentBuilder = new Document();

    @Test
    public void outerHtmlHeadWithNewLineAndEmptyString() {
        TextNode node = new TextNode("\n");
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        documentBuilder.append(node, 1, output);
        assertEquals("<br><html><body></body></html>", output.toString());
    }

}