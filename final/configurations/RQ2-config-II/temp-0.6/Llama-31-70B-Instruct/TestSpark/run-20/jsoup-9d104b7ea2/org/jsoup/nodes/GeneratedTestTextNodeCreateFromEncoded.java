package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestTextNodeCreateFromEncoded {

    @Mock
    private TextNode textNode;

    @Test
    public void testTextNodeCreateFromEncoded() {
        when(TextNode.createFromEncoded("Test Text")).thenReturn(textNode);
        assertEquals(textNode, TextNode.createFromEncoded("Test Text"));
    }

}