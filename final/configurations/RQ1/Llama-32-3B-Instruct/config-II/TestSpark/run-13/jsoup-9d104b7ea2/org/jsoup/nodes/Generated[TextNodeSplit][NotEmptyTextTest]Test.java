package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Generated[TextNodeSplit][NotEmptyTextTest]

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
    public void [TextNodeSplit][NotEmptyTextTest]Test() {
        when(document.getNodeValue()).thenReturn("Test");
        TextNode textNode = createTextNode();
        TextNode resultNode = textNode.splitText(1);
        assertNotNull(resultNode);
        assertEquals("Test", resultNode.text());
    }

}