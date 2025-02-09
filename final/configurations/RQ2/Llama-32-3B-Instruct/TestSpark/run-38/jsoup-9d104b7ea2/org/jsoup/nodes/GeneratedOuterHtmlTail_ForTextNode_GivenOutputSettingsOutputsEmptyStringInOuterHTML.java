package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Appendable;

public class GeneratedOuterHtmlTail_ForTextNode_GivenOutputSettingsOutputsEmptyStringInOuterHTML {

    @Test
    public void outerHtmlTail_ForTextNode_GivenOutputSettingsOutputsEmptyStringInOuterHTML() throws IOException {
        TextNode textNode = new TextNode("");
        Appendable output = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings(output, "UTF-8", false);
        textNode.outerHtmlTail(new java.io.StringWriter(), 0, out);
        assertEquals("", output.toString());
    }

}