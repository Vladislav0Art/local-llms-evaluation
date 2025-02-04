package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedText_GivenWhitespaceText_ReturnsStripedWhitespaceText {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Element parent;

    @Test
    public void text_GivenWhitespaceText_ReturnsStripedWhitespaceText() {
        String originalText = "   Hello World  ";
        TextNode textNode = new TextNode(originalText);
        assertThat(TextNode.normaliseWhitespace(textNode.text()), is("Hello World"));
    }

}