package org.jsoup.nodes;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedClone {

    @Mock
    private Appendable accum;

    public TextNode testTextNode() {
        return new TextNode("");
    }

    @Test
    public void clone() {
        TextNode textNode = testTextNode();
        TextNode clonedTextNode = (TextNode) textNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(textNode, clonedTextNode);
    }
}

@Category(CoverageTest.class)
@RunWith(MockitoJUnitRunner.class)
public class TextNodeLeafNodeMethodsTests {

    @Mock
    private LeafNode parentNode;

    public TextNode testTextNode() {
        return new TextNode("");
    }

}