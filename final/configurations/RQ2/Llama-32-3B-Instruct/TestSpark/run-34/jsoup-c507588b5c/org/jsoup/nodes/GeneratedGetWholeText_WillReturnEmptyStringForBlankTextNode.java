package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetWholeText_WillReturnEmptyStringForBlankTextNode {

    @Test
    public void getWholeText_WillReturnEmptyStringForBlankTextNode() {
        TextNode node = new TextNode("");
        assertEquals("", node.getWholeText());
    }

}