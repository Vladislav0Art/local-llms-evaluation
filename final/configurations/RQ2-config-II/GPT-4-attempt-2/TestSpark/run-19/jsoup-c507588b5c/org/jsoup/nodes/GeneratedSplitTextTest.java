package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitTextTest {

    @Mock
    Document.OutputSettings outputSettings;

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode split = textNode.splitText(7);
        assertEquals("World!", split.text());
        assertEquals("Hello,", textNode.text());
    }

}