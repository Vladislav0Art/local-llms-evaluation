package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedOuterHtmlTail_AppendsNoContentToHtmlOutput {

    @Test
    public void outerHtmlTail_AppendsNoContentToHtmlOutput() throws IOException {
        TextNode textNode = new TextNode("");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Appendable accum = new StringBuilder(out);
        Document.OutputSettings settings = new Document.OutputSettings(true);
        textNode.outerHtmlTail(accum, 0, settings);
    }

}