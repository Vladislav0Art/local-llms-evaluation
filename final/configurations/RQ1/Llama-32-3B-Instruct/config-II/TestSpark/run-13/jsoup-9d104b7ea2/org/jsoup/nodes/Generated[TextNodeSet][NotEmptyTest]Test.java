package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Generated[TextNodeSet][NotEmptyTest]

Test {

    @Mock
    private Document document;

    public TextNode createTextNode () {
        return new TextNode("Test");
    }

    public String testText () {
        return "Test";
    }

    public TextNode splitText () {
        return createTextNode();
    }

    public TextNode textTextNode () {
        return createTextNode();
    }

    @Test
    public void [TextNodeSet][NotEmptyTest]Test() {
        TextNode textNode = createTextNode();
        String text = "Test";
        textNode.text(text);
        assertEquals(text, textNode.text());
    }

}