package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayBuilder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedOuterHtmlHead_IndentsAndEscapesTextProperly {

    @Test
    public void outerHtmlHead_IndentsAndEscapesTextProperly() throws IOException {
        String text = "Hello\nWorld!";
        Document document = new Document();
        TextNode node = new TextNode(text);
        Appendable accum = new ByteArrayBuilder(1024);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        node.outerHtmlHead(accum, depth, out);
        String expected = "<div><p>Hello</p><br><p>World!</p></div>";
        assertEquals(expected, accum.toString());
    }

}