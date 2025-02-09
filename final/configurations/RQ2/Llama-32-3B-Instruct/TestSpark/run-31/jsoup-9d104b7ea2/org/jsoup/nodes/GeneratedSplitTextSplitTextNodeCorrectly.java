package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

public class GeneratedSplitTextSplitTextNodeCorrectly {

    @Test
    public void splitTextSplitTextNodeCorrectly() {
        String text = "text";
        TextNode node = new TextNode(text);
        node.text("another");
        Optional<String> result = node.splitText(0);
        assertThat(result.orElse(null), is(text));
        node.text("and another");
        Optional<String> splitResult = node.splitText(3);
        assertThat(splitResult.orElse(null), is("and"));
    }

}