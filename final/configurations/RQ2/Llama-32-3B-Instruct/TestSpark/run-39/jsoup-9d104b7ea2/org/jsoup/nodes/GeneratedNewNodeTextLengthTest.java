package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNewNodeTextLengthTest {

    @Test
    public void newNodeTextLengthTest() {
        String text = "Hello\nWorld";
        TextNode node = new TextNode(text);
        assertEquals(12, node.text().length());
    }

}