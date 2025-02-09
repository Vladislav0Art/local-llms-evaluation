package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedLastCharIsWhitespaceWillReturnTrueForEmptyStringBuilder {

    @Test
    public void lastCharIsWhitespaceWillReturnTrueForEmptyStringBuilder() {
        StringBuilder sb = new StringBuilder();
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}