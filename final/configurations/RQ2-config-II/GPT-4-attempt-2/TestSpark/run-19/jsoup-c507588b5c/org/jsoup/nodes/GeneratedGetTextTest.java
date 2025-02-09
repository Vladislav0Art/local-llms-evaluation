package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetTextTest {

    @Mock
    Document.OutputSettings outputSettings;

    @Test
    public void getTextTest() {
        TextNode textNode = new TextNode("Test text");
        assertEquals("Test text", textNode.text());
    }

}