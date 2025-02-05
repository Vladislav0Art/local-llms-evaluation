package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode blankTextNode = new TextNode(" ");
        TextNode nonBlankTextNode = new TextNode("Test");
        assertThat(blankTextNode.isBlank()).isTrue();
        assertThat(nonBlankTextNode.isBlank()).isFalse();
    }

}