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
public class GeneratedGivenTextNodeWhenCreatedWithSingleSpaceAndNextNodeIsIndentingThenSkipThisText {

    @Mock
    private Node parentNode;

    @Test
    public void givenTextNodeWhenCreatedWithSingleSpaceAndNextNodeIsIndentingThenSkipThisText() {
        String text = " ";
        TextNode textNode = new TextNode(text);
        when(parentNode.next()).thenReturn(new Element());
        when((Element) parentNode).shouldIndent(Mockito.any(Document.OutputSettings.class));
        assertThat(textNode.isBlank(), is(true));
    }

}