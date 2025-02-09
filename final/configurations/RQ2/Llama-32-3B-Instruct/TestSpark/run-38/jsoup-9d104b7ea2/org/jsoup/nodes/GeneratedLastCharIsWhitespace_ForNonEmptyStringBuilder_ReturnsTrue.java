package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Appendable;

public class GeneratedLastCharIsWhitespace_ForNonEmptyStringBuilder_ReturnsTrue {

    @Test
    public void lastCharIsWhitespace_ForNonEmptyStringBuilder_ReturnsTrue() {
        StringBuilder sb = new StringBuilder("Hello World");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}