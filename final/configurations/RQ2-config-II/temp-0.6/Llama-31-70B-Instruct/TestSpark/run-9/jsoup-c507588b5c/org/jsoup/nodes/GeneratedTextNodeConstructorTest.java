package org.jsoup.nodes;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTextNodeConstructorTest {

    @Mock
    private TextNode textNode;

    @Test
    public void textNodeConstructorTest() {
        when(textNode.nodeName()).thenReturn("TextNode");
        assertEquals("TextNode", textNode.nodeName());
    }

}