package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedToString_ReturnsCorrectStringForEmptyText {

    @Test
    public void toString_ReturnsCorrectStringForEmptyText() {
        TextNode node = new TextNode("");
        assertEquals("text=''", node.toString());
    }

}