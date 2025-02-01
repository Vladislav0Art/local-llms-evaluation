package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedSplitTextExceedOffsetTest {

    @Test
    public void splitTextExceedOffsetTest() {
        TextNode node = new TextNode("Test");
        node.splitText(10);
    }

}