package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("    Test    ");
        assertEquals("    Test    ", node.getWholeText());
    }

}