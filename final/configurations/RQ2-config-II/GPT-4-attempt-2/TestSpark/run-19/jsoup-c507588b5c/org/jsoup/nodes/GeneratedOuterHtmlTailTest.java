package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTailTest {

    @Mock
    Document.OutputSettings outputSettings;

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("Test");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlTail(sb, 1, outputSettings);
        assertEquals("", sb.toString());
    }

}