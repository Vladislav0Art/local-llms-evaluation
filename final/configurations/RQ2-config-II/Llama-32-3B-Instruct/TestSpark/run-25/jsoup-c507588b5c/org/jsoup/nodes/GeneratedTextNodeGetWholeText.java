package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;

public class GeneratedTextNodeGetWholeText {

    @Test
    public void textNodeGetWholeText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        Appendable accum = output;
        Document.OutputSettings out = Document.OutputSettings.defaultValues();
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("Hello World", textNode.getWholeText());
    }

}