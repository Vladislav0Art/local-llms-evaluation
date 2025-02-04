package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayBuilder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateTextNode_EmptyString_ReturnsEmptyTextNode {

    @Test
    public void createTextNode_EmptyString_ReturnsEmptyTextNode() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

}