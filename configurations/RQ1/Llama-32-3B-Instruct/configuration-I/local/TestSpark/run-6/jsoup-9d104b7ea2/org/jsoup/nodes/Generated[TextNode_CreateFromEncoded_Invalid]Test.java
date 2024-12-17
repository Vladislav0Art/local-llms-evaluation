package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class Generated[TextNode_CreateFromEncoded_Invalid]

Test {

    @Test
    public void [TextNode_CreateFromEncoded_Invalid]Test() {
        String encodedText = "<&lt;";
        try {
            TextNode.createFromEncoded(encodedText);
            fail("Expected IOException");
        } catch (IOException e) {
        }
    }

}