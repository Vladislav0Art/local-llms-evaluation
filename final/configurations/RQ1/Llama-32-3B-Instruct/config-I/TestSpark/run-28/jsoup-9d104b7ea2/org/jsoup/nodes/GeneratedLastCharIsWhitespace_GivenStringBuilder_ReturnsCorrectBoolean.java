package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayBuilder;
import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedLastCharIsWhitespace_GivenStringBuilder_ReturnsCorrectBoolean {

    @Test
    public void lastCharIsWhitespace_GivenStringBuilder_ReturnsCorrectBoolean() {
        StringBuilder sb = new StringBuilder();
        sb.append(' ');
        assertTrue(TextNode.lastCharIsWhitespace(sb));
        sb.setLength(0);
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}