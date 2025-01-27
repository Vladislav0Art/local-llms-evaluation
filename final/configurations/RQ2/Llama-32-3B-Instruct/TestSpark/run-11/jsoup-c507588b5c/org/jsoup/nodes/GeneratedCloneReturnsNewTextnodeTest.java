package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.mockito.Mockito;

public class GeneratedCloneReturnsNewTextnodeTest {

    @Test
    public void cloneReturnsNewTextnodeTest() {
        TextNode node = new TextNode("Hello, World!");
        TextNode clone = node.clone();
        assertNotNull(clone);
        assertEquals(node.text(), clone.text());
    }

}