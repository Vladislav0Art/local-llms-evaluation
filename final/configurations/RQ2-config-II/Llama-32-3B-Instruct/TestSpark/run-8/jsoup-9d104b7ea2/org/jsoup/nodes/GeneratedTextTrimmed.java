package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTextTrimmed {

    @Test
    public void textTrimmed() {
        TextNode node = new TextNode("\t\nHello World\t\n");
        assertEquals("Hello World", StringUtil.trim(node.text()));
    }

}