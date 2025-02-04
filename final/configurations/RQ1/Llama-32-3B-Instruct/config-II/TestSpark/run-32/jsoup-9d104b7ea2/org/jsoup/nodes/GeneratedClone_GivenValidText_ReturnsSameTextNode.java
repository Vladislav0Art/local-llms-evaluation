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
public class GeneratedClone_GivenValidText_ReturnsSameTextNode {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Element parent;

    @Test
    public void clone_GivenValidText_ReturnsSameTextNode() {
        String originalText = "Hello World!";
        when(parentNode).thenReturn(originalText);
        TextNode textNode = new TextNode(originalText);
        assertThat(textNode.clone(), is(textNode));
    }

}