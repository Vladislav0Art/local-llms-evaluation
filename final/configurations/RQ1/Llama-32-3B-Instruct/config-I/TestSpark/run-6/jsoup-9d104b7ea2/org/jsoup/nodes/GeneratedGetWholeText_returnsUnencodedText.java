package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedGetWholeText_returnsUnencodedText {

    @Test
    public void getWholeText_returnsUnencodedText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertThat(textNode.getWholeText(), is(text));
    }

}