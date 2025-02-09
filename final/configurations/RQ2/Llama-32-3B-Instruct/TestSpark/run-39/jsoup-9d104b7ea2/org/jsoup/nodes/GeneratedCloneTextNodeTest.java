package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCloneTextNodeTest {

    @Test
    public void cloneTextNodeTest() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode clone = node.clone();
        assertNotNull(clone.text());
        assertEquals(text, clone.text());
    }

}