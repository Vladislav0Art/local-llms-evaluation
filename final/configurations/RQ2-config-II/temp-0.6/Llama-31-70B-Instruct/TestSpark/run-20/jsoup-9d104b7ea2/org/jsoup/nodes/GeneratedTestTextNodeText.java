package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestTextNodeText {

    @Mock
    private TextNode textNode;

    @Test
    public void testTextNodeText() {
        when(textNode.text()).thenReturn("Test Text");
        assertEquals("Test Text", textNode.text());
    }

}