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

public class GeneratedOuterHtmlHead_ForTextNode_GivenOutputSettingsOutputsTextNodeInOuterHTML {

    @Test
    public void outerHtmlHead_ForTextNode_GivenOutputSettingsOutputsTextNodeInOuterHTML() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        Appendable output = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings(output, "UTF-8", false);
        textNode.outerHtmlHead(new java.io.StringWriter(), 0, out);
        assertEquals("<text-node>Hello World</text-node>", output.toString());
    }

}