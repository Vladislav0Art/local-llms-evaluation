package org.jsoup.nodes;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTextTest {

    @Mock
    private TextNode textNode;

    @Test
    public void textTest() {
        when(textNode.text()).thenReturn("This is a text");
        assertEquals("This is a text", textNode.text());
    }

}