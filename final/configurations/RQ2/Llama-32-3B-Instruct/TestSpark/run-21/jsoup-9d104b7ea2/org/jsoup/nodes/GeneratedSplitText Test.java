package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitText Test {

    @Test
    public void splitText

    Test() throws IOException {
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings(true, false);
        TextNode node = new TextNode("hello world");
        node.outerHtmlHead(ba, 0, settings);
        assertEquals("<span>hello</span> <span>world</span>", ba.toString());
    }

}