package org.jsoup.nodes;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitText_SplitAtEnd_ReturnsNewTextNodeWithSameText {

    @Mock
    private Appendable accum;

    public TextNode testTextNode() {
        return new TextNode("");
    }

    @Test
    public void splitText_SplitAtEnd_ReturnsNewTextNodeWithSameText() {
        TextNode textNode = testTextNode();
        textNode.text("ab");
        TextNode result = textNode.splitText(textNode.text().length());
        assertNotNull(result);
        assertEquals(textNode, result.splitText(0));
        assertTrue(StringUtil.isBlank(result.text()));
    }

}