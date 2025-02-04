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
public class GeneratedGivenTextNodeWhenCreatedWithEmptyStringThenBlank {

    @Mock
    private Node parentNode;

    @Test
    public void givenTextNodeWhenCreatedWithEmptyStringThenBlank() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertThat(textNode.isBlank(), is(true));
    }

}