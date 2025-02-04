package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenTextNodeWhenSplitAtOffsetThenCreatesNewTextNode {

    @Mock
    private Node parentNode;

    @Test
    public void givenTextNodeWhenSplitAtOffsetThenCreatesNewTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        when(parentNode).thenReturn(new Element());
        TextNode splitTextNode = textNode.splitText(5);
        assertEquals("World", splitTextNode.text());
    }

}