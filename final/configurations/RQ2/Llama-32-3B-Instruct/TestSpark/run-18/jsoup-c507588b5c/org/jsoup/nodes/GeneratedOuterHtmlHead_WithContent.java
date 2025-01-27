package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class GeneratedOuterHtmlHead_WithContent {

    @Test
    public void outerHtmlHead_WithContent() throws IOException {
        TextNode textNode = new TextNode("test");
        Appendable appendable = new ByteArrayOutputStream();
        Document.OutputSettings out = Document.OutputSettings.empty();
        textNode.outerHtmlHead(appendable, 0, out);
        assertEquals("<text>test</text>", appendable.toString());
    }

}