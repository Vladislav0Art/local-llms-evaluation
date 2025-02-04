package org.jsoup.nodes;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetWholeText_EmptyText_ReturnsEmptyString {

    @Mock
    private Appendable accum;

    public TextNode testTextNode() {
        return new TextNode("");
    }

    @Test
    public void getWholeText_EmptyText_ReturnsEmptyString() {
        TextNode textNode = testTextNode();
        String text = textNode.getWholeText();
        assertTrue(text.isEmpty());
    }

}