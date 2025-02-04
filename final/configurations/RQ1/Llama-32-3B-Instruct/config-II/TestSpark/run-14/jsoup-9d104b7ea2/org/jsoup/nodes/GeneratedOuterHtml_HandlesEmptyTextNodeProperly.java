package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedOuterHtml_HandlesEmptyTextNodeProperly {

    @Test
    public void outerHtml_HandlesEmptyTextNodeProperly() throws Exception {
        TextNode node = new TextNode("");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings(out);
        node.outerHtmlHead(settings, 0, null);
        String result = out.toString().trim();
        assertEquals("", result);
    }
}

}