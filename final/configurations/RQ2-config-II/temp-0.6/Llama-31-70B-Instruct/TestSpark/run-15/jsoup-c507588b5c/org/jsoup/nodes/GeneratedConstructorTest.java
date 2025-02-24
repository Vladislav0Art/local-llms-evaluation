package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructorTest {

    @Test
    public void constructorTest() throws IOException {
        String text = "test";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
        assertEquals("#text", textNode.nodeName());
    }

}