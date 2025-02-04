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
public class GeneratedText_GivenBlankText_ReturnsBlankText {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Element parent;

    @Test
    public void text_GivenBlankText_ReturnsBlankText() {
        TextNode textNode = new TextNode("");
        assertThat(textNode.text(), is(""));
    }

}