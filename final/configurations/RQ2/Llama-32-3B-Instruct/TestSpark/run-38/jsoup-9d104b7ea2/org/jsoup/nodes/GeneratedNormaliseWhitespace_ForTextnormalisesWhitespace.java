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

public class GeneratedNormaliseWhitespace_ForTextnormalisesWhitespace {

    @Test
    public void normaliseWhitespace_ForTextnormalisesWhitespace() {
        String text = "   Hello World   ";
        String expectedText = "Hello World";
        assertEquals(expectedText, StringUtil.normaliseWhitespace(text));
    }

}