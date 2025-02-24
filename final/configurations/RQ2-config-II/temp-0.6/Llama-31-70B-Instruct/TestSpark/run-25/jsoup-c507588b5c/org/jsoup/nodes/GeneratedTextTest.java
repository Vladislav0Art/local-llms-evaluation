package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode node = new TextNode("some text");
        assertEquals("some text", node.text());
    }

}