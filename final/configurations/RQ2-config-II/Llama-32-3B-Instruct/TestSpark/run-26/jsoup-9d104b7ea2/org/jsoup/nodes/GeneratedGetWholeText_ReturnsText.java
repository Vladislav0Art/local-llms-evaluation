package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedGetWholeText_ReturnsText {

    @Test
    public void getWholeText_ReturnsText() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

}