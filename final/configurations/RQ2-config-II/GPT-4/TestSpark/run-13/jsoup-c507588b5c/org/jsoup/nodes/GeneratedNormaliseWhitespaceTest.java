package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String textWithWhitespace = " Test Node ";
        String normalisedText = TextNode.normaliseWhitespace(textWithWhitespace);
        assertThat(normalisedText).isEqualTo("Test Node");
    }

}