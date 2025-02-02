package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedIsBlank_GivenEmptyText_ReturnsTrue {

    @Test
    public void isBlank_GivenEmptyText_ReturnsTrue() {
        Node textNode = new Node("");
        assertTrue(textNode.isBlank());
    }

}