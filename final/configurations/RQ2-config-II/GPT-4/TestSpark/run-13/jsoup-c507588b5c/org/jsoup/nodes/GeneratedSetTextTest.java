package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedSetTextTest {

    @Test
    public void setTextTest() {
        TextNode textNode = new TextNode("Test");
        textNode.text("NewTest");
        assertThat(textNode.text()).isEqualTo("NewTest");
    }

}