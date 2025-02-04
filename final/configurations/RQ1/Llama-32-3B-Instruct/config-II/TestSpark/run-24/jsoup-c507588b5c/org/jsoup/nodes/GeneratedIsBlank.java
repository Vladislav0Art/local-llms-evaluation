package org.jsoup.nodes;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlank {

    @Mock
    private Appendable accum;

    public TextNode testTextNode() {
        return new TextNode("");
    }

    @Test
    public void isBlank() {
        TextNode textNode = testTextNode();
        assertTrue(textNode.isBlank());

        TextNode anotherTextNode = new TextNode(" ");
        anotherTextNode.text(" ");
        assertFalse(anotherTextNode.isBlank());
    }

}