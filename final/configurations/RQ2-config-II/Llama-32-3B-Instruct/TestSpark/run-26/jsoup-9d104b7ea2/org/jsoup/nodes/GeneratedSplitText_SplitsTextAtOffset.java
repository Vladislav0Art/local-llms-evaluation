package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedSplitText_SplitsTextAtOffset {

    @Test
    public void splitText_SplitsTextAtOffset() {
        TextNode textNode = new TextNode("test");
        textNode.text("test");
        assertEquals(0, textNode.splitText(1).text().length());
        assertEquals(4, textNode.splitText(2).text().length());
    }

}