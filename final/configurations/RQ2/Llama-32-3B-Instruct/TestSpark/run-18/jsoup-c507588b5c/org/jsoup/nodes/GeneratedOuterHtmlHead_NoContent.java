package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class GeneratedOuterHtmlHead_NoContent {

    @Test
    public void outerHtmlHead_NoContent() throws IOException {
        TextNode textNode = new TextNode("");
        Appendable appendable = new ByteArrayOutputStream();
        Document.OutputSettings out = Document.OutputSettings.empty();
        textNode.outerHtmlHead(appendable, 0, out);
        assertEquals("<text></text>", appendable.toString());
    }

}