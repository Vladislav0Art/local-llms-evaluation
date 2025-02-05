package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "TestNode";
        TextNode textNode = TextNode.createFromEncoded(encodedText, false);
        assertThat(textNode.getWholeText()).isEqualTo("TestNode");
    }

}