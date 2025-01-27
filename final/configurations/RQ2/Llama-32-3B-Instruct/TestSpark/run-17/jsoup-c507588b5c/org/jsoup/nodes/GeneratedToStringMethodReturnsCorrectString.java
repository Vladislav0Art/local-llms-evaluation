package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedToStringMethodReturnsCorrectString {

    @Test
    public void toStringMethodReturnsCorrectString() {
        String text = "hello";
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals("<text>" + text + "</text>", node.toString());
    }

}