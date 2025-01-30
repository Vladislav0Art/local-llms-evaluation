package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextOutOfBoundsOffsetTest {

    @Test
    public void splitTextOutOfBoundsOffsetTest() {
        TextNode tn = new TextNode("SplitText");
        tn.splitText(20);
    }

}