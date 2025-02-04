package org.jsoup.nodes;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateFromEncoded {

    @Mock
    private Appendable accum;

    public TextNode testTextNode() {
        return new TextNode("");
    }

    @Test
    public void createFromEncoded() {
        String encodedText = "&lt;";
        when(Entities.unescape(encodedText)).thenReturn("&lt;");
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals("&&", textNode.text());
    }

    static class CoverageTest {
    }

}