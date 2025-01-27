package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedCreateTextNodesFromEncodedStringThrowsNullPointerExceptionOnNullInput {

    @Test
    public void createTextNodesFromEncodedStringThrowsNullPointerExceptionOnNullInput() {
        assertThrows(NullPointerException.class, () -> TextNode.createFromEncoded(null));
    }

}