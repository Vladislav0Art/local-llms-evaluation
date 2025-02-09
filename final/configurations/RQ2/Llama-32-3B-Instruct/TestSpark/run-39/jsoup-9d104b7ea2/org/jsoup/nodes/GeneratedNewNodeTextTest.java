package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNewNodeTextTest {

    @Test
    public void newNodeTextTest() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertNotNull(node.text());
        assertEquals(text, node.text());
    }

}