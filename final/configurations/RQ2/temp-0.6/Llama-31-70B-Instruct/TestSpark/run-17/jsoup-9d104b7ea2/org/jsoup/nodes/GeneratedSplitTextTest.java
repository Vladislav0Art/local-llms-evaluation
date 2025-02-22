package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitTextTest {

    @Mock
    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("mockText");
    }

    @Test
    public void splitTextTest() {
        TextNode result = textNode.splitText(1);
        assertEquals("ockText", result.getWholeText());
    }

}