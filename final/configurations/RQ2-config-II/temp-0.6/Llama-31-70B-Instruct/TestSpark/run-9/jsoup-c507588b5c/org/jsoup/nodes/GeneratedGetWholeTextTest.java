package org.jsoup.nodes;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetWholeTextTest {

    @Mock
    private TextNode textNode;

    @Test
    public void getWholeTextTest() {
        when(textNode.getWholeText()).thenReturn("This is a whole text");
        assertEquals("This is a whole text", textNode.getWholeText());
    }

}