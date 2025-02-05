package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedOuterHtmlHeadAndTailTest {

    @Test
    public void outerHtmlHeadAndTailTest() throws IOException {
        TextNode textNode = new TextNode("TestNode");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlHead(sb, 0, new Document.OutputSettings());
        textNode.outerHtmlTail(sb, 0, new Document.OutputSettings());
        assertThat(sb.toString()).isEqualTo("TestNode");
    }

}