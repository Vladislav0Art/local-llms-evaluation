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
public class GeneratedCreateFromEncoded_GivenValidText_ReturnsTextNode {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Element parent;

    @Test
    public void createFromEncoded_GivenValidText_ReturnsTextNode() {
        String encodedText = "&lt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertThat(textNode.text(), is(" "));
    }

}