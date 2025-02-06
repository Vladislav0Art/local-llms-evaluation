package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedNodeName_emptyText_ReturnsEmptyString {

    @Test
    public void nodeName_emptyText_ReturnsEmptyString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.nodeName());
    }

}