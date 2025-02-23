package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestTextNodeClone {

    @Mock
    private TextNode textNode;

    @Test
    public void testTextNodeClone() {
        when(textNode.clone()).thenReturn(textNode);
        assertEquals(textNode, textNode.clone());
    }

}