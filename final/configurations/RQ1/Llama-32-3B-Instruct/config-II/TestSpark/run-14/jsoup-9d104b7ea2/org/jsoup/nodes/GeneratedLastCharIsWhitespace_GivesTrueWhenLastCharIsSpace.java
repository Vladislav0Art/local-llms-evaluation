package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedLastCharIsWhitespace_GivesTrueWhenLastCharIsSpace {

    @Test
    public void lastCharIsWhitespace_GivesTrueWhenLastCharIsSpace() {
        StringBuilder sb = new StringBuilder("Hello ");
        assertTrue(StringUtil.lastCharIsWhitespace(sb));
    }

}