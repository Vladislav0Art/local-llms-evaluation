package org.jsoup.nodes;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTextSetterTest {

    @Mock
    private TextNode textNode;

    @Test
    public void textSetterTest() {
        when(textNode.text("This is a text")).thenReturn(textNode);
        assertEquals(textNode, textNode.text("This is a text"));
    }

}