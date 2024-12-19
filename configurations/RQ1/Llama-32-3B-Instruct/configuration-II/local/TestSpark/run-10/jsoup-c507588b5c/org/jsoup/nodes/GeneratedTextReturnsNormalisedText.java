package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class GeneratedTextReturnsNormalisedText {

    @Mock
    private LeafNode parent;
    @Mock
    private Appendable accum;
    @Mock
    private Document.OutputSettings out;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() {
        // Empty
    }

    @Test
    public void textReturnsNormalisedText() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        assertEquals(StringUtil.normaliseWhitespace(text), textNode.text());
    }

}