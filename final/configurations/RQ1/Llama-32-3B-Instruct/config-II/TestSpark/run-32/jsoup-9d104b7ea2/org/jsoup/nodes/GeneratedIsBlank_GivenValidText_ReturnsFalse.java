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
public class GeneratedIsBlank_GivenValidText_ReturnsFalse {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Element parent;

    @Test
    public void isBlank_GivenValidText_ReturnsFalse() {
        TextNode textNode = new TextNode("Hello");
        assertThat(textNode.isBlank(), is(false));
    }

}