package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedShouldSplitTextTest {

    @Mock
    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("some text");
    }

    @Test
    public void shouldSplitTextTest() {
        when(textNode.splitText(2)).thenReturn(new TextNode("me text"));
        assertEquals("me text", textNode.splitText(2).getWholeText());
    }

}