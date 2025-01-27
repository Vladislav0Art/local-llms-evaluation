package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncoded_TextnodeCanBeCreatedFromFile {

    @Test
    public void createFromEncoded_TextnodeCanBeCreatedFromFile() throws Exception {
        String encodedText = "Hello World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
    }

}