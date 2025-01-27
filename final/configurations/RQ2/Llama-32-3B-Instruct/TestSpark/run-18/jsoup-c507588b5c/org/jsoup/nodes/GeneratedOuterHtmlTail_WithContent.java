package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class GeneratedOuterHtmlTail_WithContent {

    @Test
    public void outerHtmlTail_WithContent() {
        TextNode textNode = new TextNode("test");
        Appendable appendable = new ByteArrayOutputStream();
        Document.OutputSettings out = Document.OutputSettings.empty();
        textNode.outerHtmlTail(appendable, 0, out);
        assertEquals("", appendable.toString());
    }

}