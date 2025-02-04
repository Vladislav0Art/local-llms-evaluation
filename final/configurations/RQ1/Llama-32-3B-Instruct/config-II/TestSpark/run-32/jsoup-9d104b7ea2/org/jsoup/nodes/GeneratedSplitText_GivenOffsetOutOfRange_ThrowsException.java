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
public class GeneratedSplitText_GivenOffsetOutOfRange_ThrowsException {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Element parent;

    @Test
    public void splitText_GivenOffsetOutOfRange_ThrowsException() {
        String originalText = "Hello World!";
        int offset = 6;
        when(parentNode).thenReturn(originalText);
        TextNode textNode = new TextNode(originalText);
        assertThat(() -> textNode.splitText(offset), throws(IllegalArgumentException.class));
    }

}