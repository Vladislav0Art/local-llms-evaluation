package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

public class GeneratedGetWholeTextReturnsOriginalText {

    @Test
    public void getWholeTextReturnsOriginalText() {
        String text = "original text";
        TextNode node = new TextNode(text);
        assertThat(node.getWholeText(), is(text));
    }

}