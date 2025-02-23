package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTextNodeOuterHtmlHeadTest {

    @Mock
    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("test");
    }

    @Test
    public void textNodeOuterHtmlHeadTest() {
        Appendable appendable = new StringBuilder();
        textNode.outerHtmlHead(appendable, 0, new Document.OutputSettings());
        assertEquals("test", appendable.toString());
    }

}