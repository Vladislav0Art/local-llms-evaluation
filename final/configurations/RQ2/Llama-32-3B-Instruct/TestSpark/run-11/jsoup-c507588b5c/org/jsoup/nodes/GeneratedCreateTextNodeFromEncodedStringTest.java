package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtilImpl;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.mockito.Mockito;

public class GeneratedCreateTextNodeFromEncodedStringTest {

    @Test
    public void createTextNodeFromEncodedStringTest() {
        String encodedText = "%3Cp%3EHello%2C+World%3C%2Fp%3E";
        TextNode node = new TextNode(encodedText);
        assertNotNull(node.text());
        assertEquals("Hello, World!", node.text());
    }
}

public class StringUtilImpl {

    public static String stripLeadingWhitespace(String text) {
        while (!text.isEmpty() && Character.isWhitespace(text.charAt(0))) {
            text = text.substring(1);
        }
        return text;
    }

    public static boolean lastCharIsWhitespace(StringBuilder sb) {
        return sb.length() > 0 && Character.isWhitespace(sb.charAt(sb.length() - 1));
    }

}