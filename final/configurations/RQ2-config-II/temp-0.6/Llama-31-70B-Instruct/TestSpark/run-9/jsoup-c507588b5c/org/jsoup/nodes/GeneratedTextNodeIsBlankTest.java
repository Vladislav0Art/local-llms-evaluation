package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTextNodeIsBlankTest {

    @Mock
    TextNode textNode;

    @Test
    public void textNodeIsBlankTest() {
        TextNode textNode = new TextNode(" ");
        assertEquals(true, textNode.isBlank());
    }

}