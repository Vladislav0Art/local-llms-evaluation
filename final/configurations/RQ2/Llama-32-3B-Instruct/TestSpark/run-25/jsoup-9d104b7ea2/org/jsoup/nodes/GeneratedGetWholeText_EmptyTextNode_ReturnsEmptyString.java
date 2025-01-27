package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetWholeText_EmptyTextNode_ReturnsEmptyString {

    @Test
    public void getWholeText_EmptyTextNode_ReturnsEmptyString() {
        TextNode node = new TextNode("");
        assertEquals("", node.getWholeText());
    }

}