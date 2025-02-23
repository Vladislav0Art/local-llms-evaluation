package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestTextNode {

    @Mock
    private TextNode textNode;

    @Test
    public void testTextNode() {
        when(textNode.nodeName()).thenReturn("#text");
        assertEquals("#text", textNode.nodeName());
    }

}