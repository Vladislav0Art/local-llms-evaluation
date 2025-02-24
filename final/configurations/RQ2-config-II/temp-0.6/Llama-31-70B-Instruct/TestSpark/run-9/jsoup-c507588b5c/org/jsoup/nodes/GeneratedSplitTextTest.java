package org.jsoup.nodes;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitTextTest {

    @Mock
    private TextNode textNode;

    @Test
    public void splitTextTest() {
        when(textNode.splitText(1)).thenReturn(textNode);
        assertEquals(textNode, textNode.splitText(1));
    }

}