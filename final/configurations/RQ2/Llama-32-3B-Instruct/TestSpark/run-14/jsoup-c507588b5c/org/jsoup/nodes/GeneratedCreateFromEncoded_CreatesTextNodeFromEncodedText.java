package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)
public class GeneratedCreateFromEncoded_CreatesTextNodeFromEncodedText {

    @Test
    public void createFromEncoded_CreatesTextNodeFromEncodedText() {
        TextNode node = TextNode.createFromEncoded("<test>");
        assertEquals("test", node.text());
    }

}