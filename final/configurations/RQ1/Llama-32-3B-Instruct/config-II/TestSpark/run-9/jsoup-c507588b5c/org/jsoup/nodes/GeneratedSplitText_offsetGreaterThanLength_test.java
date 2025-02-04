package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;

public class GeneratedSplitText_offsetGreaterThanLength_test {

    @Test
    public void splitText_offsetGreaterThanLength_test() throws IOException {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        int offset = 12; // 11 characters for "Hello" + null terminator
        textNode.splitText(offset);
    }

}