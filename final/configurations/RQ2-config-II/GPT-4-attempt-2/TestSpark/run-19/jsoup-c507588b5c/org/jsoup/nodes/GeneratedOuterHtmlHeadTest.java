package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHeadTest {

    @Mock
    Document.OutputSettings outputSettings;

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("Test");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlHead(sb, 1, outputSettings);
        assertEquals("Test", sb.toString());
    }

}