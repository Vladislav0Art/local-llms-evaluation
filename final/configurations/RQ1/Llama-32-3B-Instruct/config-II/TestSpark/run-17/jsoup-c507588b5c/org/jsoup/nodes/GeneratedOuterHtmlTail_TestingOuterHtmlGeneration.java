package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTail_TestingOuterHtmlGeneration {

    @Test
    public void outerHtmlTail_TestingOuterHtmlGeneration() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document document = new Document();
        Element element = new Element("");
        TextNode textNode = new TextNode("");
        Appendable accum = out;
        int depth = 0;
        Document.OutputSettings settings = null;

        textNode.outerHtmlTail(accum, depth, settings);
    }

}