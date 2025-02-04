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
public class GeneratedGivenTextNodeWhenSplitsAtOffsetOfLastCharacterAndParentIsBlankThenCreatesNewTextNode {

    @Mock
    private Node parentNode;

    @Test
    public void givenTextNodeWhenSplitsAtOffsetOfLastCharacterAndParentIsBlankThenCreatesNewTextNode() {
        String text = "Hello World";
        when(parentNode).thenReturn(new Element());
        TextNode textNode = new TextNode(text);
        TextNode splitTextNode = textNode.splitText(5);
        assertEquals("", splitTextNode.text());
    }

}