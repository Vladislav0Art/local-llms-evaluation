package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;

public class GeneratedTextNodeSplitText {

    @Test
    public void textNodeSplitText() {
        String text = "Hello\nWorld";
        TextNode textNode = new TextNode(text);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        Appendable accum = output;
        Document.OutputSettings out = Document.OutputSettings.defaultValues();
        int offset = 1;
        TextNode splitTextNode = textNode.splitText(offset);
        assertEquals("World", splitTextNode.text());
    }

}