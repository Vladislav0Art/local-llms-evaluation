package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode(" Test ");
        assertEquals(" Test ", node.getWholeText());
    }

}