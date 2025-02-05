package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Test");
        assertThat(textNode.text()).isEqualTo("Test");
    }

}