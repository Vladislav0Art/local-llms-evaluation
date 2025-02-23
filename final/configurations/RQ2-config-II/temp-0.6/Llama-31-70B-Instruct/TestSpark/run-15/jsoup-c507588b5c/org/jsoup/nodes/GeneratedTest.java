package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("test");
    }

    @Test
    public void textNodeNodeNameTest() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textNodeTextTest() {
        assertEquals("test", textNode.text());
    }

    @Test
    public void textNodeGetWholeTextTest() {
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void textNodeIsBlankTest() {
        assertEquals(false, textNode.isBlank());
    }

    @Test
    public void textNodeSplitTextTest() {
        TextNode splitTextNode = textNode.splitText(2);
        assertEquals("test", splitTextNode.getWholeText());
    }

    @Test
    public void textNodeOuterHtmlHeadTest() {
        Appendable appendable = new StringBuilder();
        textNode.outerHtmlHead(appendable, 0, new Document.OutputSettings());
        assertEquals("test", appendable.toString());
    }

    @Test
    public void textNodeToStringTest() {
        assertEquals("test", textNode.toString());
    }

    @Test
    public void textNodeCloneTest() {
        TextNode clonedTextNode = textNode.clone();
        assertEquals("test", clonedTextNode.getWholeText());
    }

}