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
public class GeneratedIsBlank_ReturnsTrueIfEmptyOrWhitespaceOnly {

    public TextNode textNode() {
        return new TextNode("test");
    }

    @Test
    public void isBlank_ReturnsTrueIfEmptyOrWhitespaceOnly() {
        boolean expected = true;
        when(textNode().isBlank()).thenReturn(expected);
        assertThat(textNode().isBlank(), is(expected));

        TextNode newNode = textNode();
        newNode.text("test");
        when(newNode.isBlank()).thenReturn(false);
        assertThat(newNode.isBlank(), is(false));
    }

}