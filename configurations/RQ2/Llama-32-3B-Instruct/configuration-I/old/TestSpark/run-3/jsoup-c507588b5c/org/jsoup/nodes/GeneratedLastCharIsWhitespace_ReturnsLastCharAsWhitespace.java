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
public class GeneratedLastCharIsWhitespace_ReturnsLastCharAsWhitespace {

    public TextNode textNode() {
        return new TextNode("test");
    }

    @Test
    public void lastCharIsWhitespace_ReturnsLastCharAsWhitespace() {
        StringBuilder sb = new StringBuilder("test ");
        boolean expected = true;
        when(TextNode.lastCharIsWhitespace(sb)).thenReturn(expected);
        assertThat(TextNode.lastCharIsWhitespace(sb), is(true));
    }

}