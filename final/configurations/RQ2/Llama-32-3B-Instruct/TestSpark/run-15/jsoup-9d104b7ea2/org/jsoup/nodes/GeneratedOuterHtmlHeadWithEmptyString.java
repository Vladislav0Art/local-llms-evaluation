package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.Callable;

public class GeneratedOuterHtmlHeadWithEmptyString {

    private Document documentBuilder = new Document();

    @Test
    public void outerHtmlHeadWithEmptyString() {
        TextNode node = new TextNode("");
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        documentBuilder.append(node, 0, output);
        assertEquals("<html><body></body></html>", output.toString());
    }

}