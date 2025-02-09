package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

public class GeneratedToStringReturnsCorrectText {

    @Test
    public void toStringReturnsCorrectText() {
        String text = "text";
        TextNode node = new TextNode(text);
        assertThat(node.toString(), is(text));
    }

}