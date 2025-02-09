package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsBlank_WillReturnTrueForBlankTextNode {

    @Test
    public void isBlank_WillReturnTrueForBlankTextNode() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}