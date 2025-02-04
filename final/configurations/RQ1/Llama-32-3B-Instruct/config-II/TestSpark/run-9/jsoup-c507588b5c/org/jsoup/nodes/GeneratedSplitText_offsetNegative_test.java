package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;

public class GeneratedSplitText_offsetNegative_test {

    @Test
    public void splitText_offsetNegative_test() throws IOException {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        int offset = -1;
        textNode.splitText(offset);
    }

}