package org.jsoup.nodes;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedShouldSplitTextNode {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("Test Text");
    }

    @Test
    public void shouldSplitTextNode() {
        TextNode tailNode = textNode.splitText(3);
        assertEquals("Tes", textNode.coreValue());
        assertEquals("t Text", tailNode.coreValue());
    }

}