package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String textWithLeadingWhitespace = " TestNode";
        String strippedLeadingWhitespaceText = TextNode.stripLeadingWhitespace(textWithLeadingWhitespace);
        assertThat(strippedLeadingWhitespaceText).isEqualTo("TestNode");
    }

}