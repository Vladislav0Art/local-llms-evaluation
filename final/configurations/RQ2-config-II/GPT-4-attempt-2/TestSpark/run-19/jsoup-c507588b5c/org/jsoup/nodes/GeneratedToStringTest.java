package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedToStringTest {

    @Mock
    Document.OutputSettings outputSettings;

    @Test
    public void toStringTest() {
        TextNode textNode = new TextNode("Test");
        assertEquals("Test", textNode.toString());
    }

}