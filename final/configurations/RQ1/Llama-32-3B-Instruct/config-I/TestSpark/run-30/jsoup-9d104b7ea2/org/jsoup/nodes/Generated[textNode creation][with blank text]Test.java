package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Generated[
textNode creation][
with blank
text]

Test {

    @Mock
    private Node parentNode;

    @Mock
    private Node nextSibling;

    @Mock
    private Element parent;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    public TextNode testTextNode () {
        return new TextNode("Hello");
    }

    public TextNode testTextNodeWithBlankText () {
        return new TextNode("");
    }

    public String testWholeText () {
        return "World!";
    }

    public String testNormalisedWhitespace () {
        return "   ";
    }

    @Test
    public void [textNode creation][with blank text]Test() {
        TextNode textNode = testTextNodeWithBlankText();
        assertTrue(textNode.isBlank());
    }

}