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
public class GeneratedText_ReturnsUnencodedText {

    public TextNode textNode() {
        return new TextNode("test");
    }

    @Test
    public void text_ReturnsUnencodedText() {
        String expected = "test";
        when(textNode().text()).thenReturn(expected);
        assertThat(textNode().text(), is(expected));
    }

}