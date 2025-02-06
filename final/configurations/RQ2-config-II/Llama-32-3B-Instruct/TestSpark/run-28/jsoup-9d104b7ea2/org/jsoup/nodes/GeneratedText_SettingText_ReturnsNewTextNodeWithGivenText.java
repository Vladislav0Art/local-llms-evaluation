package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedText_SettingText_ReturnsNewTextNodeWithGivenText {

    @Test
    public void text_SettingText_ReturnsNewTextNodeWithGivenText() throws IOException {
        TextNode textNode = new TextNode("");
        TextNode newTextNode = textNode.text("example");
        assertNotNull(newTextNode);
        assertEquals("example", newTextNode.text());
    }

}