package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNormaliseWhitespace_ReturnsNormalisedWhitespace {

    public TextNode textNode() {
        return new TextNode("test");
    }

    @Test
    public void normaliseWhitespace_ReturnsNormalisedWhitespace() {
        String text = "   ";
        String expected = "";
        when(TextNode.normaliseWhitespace(text)).thenReturn(expected);
        assertThat(TextNode.normaliseWhitespace(text), is(expected));
    }

}