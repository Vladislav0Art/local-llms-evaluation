package org.jsoup.nodes;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedToStringTest {

    @Mock
    private TextNode textNode;

    @Test
    public void toStringTest() {
        when(textNode.toString()).thenReturn("TextNode");
        assertEquals("TextNode", textNode.toString());
    }

}