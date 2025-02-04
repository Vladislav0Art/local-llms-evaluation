package org.jsoup.nodes;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlIndent {

    @Mock
    private Appendable accum;

    public TextNode testTextNode() {
        return new TextNode("");
    }

    @Test
    public void outerHtmlIndent() {
        TextNode textNode = testTextNode();
        StringBuilder builder = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true);
        try {
            textNode.outerHtmlHead(builder, 0, out);
            assertEquals("<span>    <span> </span></span>", builder.toString());
        } catch (IOException e) {
        }
    }
}

@Category(CoverageTest.class)
@RunWith(MockitoJUnitRunner.class)
public class TextNodeLeafNodeTests {

    @Mock
    private LeafNode parentNode;

    public TextNode testTextNode() {
        return new TextNode("");
    }

}