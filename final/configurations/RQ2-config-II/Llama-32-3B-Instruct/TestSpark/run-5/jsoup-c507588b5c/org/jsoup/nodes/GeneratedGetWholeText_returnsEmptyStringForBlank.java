package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetWholeText_returnsEmptyStringForBlank {

    @Test
    public void getWholeText_returnsEmptyStringForBlank() {
        TextNode node = new TextNode(StringUtil.stripHtmlTags("<br/>"));
        assertTrue(node.isBlank());
        assertEquals("", node.getWholeText());
    }

}