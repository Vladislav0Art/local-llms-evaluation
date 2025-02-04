package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayBuilder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedIsBlank_ChecksForEmptyOrWhitespaceText_ReturnsTrue {

    @Test
    public void isBlank_ChecksForEmptyOrWhitespaceText_ReturnsTrue() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

}