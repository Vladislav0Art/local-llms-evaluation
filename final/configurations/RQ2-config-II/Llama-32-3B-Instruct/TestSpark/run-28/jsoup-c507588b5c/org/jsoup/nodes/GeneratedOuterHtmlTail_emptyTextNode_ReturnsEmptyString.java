package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedOuterHtmlTail_emptyTextNode_ReturnsEmptyString {

    @Test
    public void outerHtmlTail_emptyTextNode_ReturnsEmptyString() {
        Document document = new Document();
        Appendable accum = new ByteArrayOutputStream();
        int depth = 0;
        Document.OutputSettings out = null;
        TextNode textNode = new TextNode("");
        textNode.outerHtmlTail(accum, depth, out);
    }

}