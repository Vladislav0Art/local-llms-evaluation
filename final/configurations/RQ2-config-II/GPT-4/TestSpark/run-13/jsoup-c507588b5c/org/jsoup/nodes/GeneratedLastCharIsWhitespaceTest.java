package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder stringBuilderWhitespace = new StringBuilder("Test ");
        StringBuilder stringBuilderNonWhitespace = new StringBuilder("Test");
        assertThat(TextNode.lastCharIsWhitespace(stringBuilderWhitespace)).isTrue();
        assertThat(TextNode.lastCharIsWhitespace(stringBuilderNonWhitespace)).isFalse();
    }

}