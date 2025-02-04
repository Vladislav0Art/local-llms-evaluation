package org.jsoup.nodes;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateTextNode_EmptyText_ReturnsTextNode {

    @Mock
    private Appendable accum;

    public TextNode testTextNode() {
        return new TextNode("");
    }

    @Test
    public void createTextNode_EmptyText_ReturnsTextNode() {
        when(accum.length()).thenReturn(0);
        TextNode textNode = new TextNode(testTextNode());
        assertNotNull(textNode);
        assertTrue(StringUtil.isBlank(textNode.text()));
    }

}