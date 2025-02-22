package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedShouldSetTextTest {

    @Mock
    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("some text");
    }

    @Test
    public void shouldSetTextTest() {
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

}