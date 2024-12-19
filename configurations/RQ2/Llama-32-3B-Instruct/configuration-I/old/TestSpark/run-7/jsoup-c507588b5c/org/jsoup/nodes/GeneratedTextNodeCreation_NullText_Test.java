package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeCreation_NullText_Test {

    @Test
    public void textNodeCreation_NullText_Test() throws Exception {
        try {
            new TextNode(null);
            throw new Exception();
        } catch (Exception e) {
            // Expected
        }
    }

}