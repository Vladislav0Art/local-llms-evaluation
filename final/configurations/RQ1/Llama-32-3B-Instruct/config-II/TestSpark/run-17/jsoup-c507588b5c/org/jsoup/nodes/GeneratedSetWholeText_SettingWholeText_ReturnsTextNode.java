package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSetWholeText_SettingWholeText_ReturnsTextNode {

    @Test
    public void setWholeText_SettingWholeText_ReturnsTextNode() throws Exception {
        TextNode textNode = new TextNode("");
        textNode.setWholeText("Hello World");
        assertEquals("Hello World", textNode.getWholeText());
        return;
    }

}