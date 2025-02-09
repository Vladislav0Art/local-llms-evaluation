package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;

public class GeneratedSplitText_SplitsTextAtGivenOffset {

    @Test
    public void splitText_SplitsTextAtGivenOffset() throws IOException {
        TextNode node = new TextNode("text");
        TextNode leftPart = new TextNode("leftText");
        leftPart.text = "leftText";
        node.splitText(4);
        assertEquals("leftText", leftPart.text);
        assertEquals("t", node.text());
    }

}