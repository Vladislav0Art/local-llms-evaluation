package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode(" Test Text. ");
        assertEquals(" Test Text. ", textNode.getWholeText());
    }

}