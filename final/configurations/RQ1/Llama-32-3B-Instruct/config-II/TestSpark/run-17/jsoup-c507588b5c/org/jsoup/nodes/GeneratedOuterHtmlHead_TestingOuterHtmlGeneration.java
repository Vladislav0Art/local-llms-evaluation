package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHead_TestingOuterHtmlGeneration {

    @Test
    public void outerHtmlHead_TestingOuterHtmlGeneration() throws IOException, Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document document = new Document();
        Element element = new Element("");
        TextNode textNode = new TextNode("");
        element.appendChild(textNode);
        TextNode textNode2 = new TextNode("Hello World");
        textNode.appendChild(textNode2);

        Appendable accum = out;
        int depth = 0;
        Document.OutputSettings settings = null;
        textNode.outerHtmlHead(accum, depth, settings);

        assertEquals("<div><p>Hello World</p></div>", out.toString());
    }

}