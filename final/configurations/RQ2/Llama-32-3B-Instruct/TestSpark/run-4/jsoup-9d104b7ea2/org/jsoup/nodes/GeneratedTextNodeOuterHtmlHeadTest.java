package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTextNodeOuterHtmlHeadTest {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    public TextNode testTreeNode() {
        return new TextNode("test");
    }

    @Test
    public void textNodeOuterHtmlHeadTest() {
        TextNode node = testTreeNode();
        try {
            node.outerHtmlHead(appendable, 0, document.OutputSettings.empty());
            fail("Expected IOException");
        } catch (IOException e) {
        }

        node.outerHtmlHead(new StringBuilder(), 0, document.OutputSettings.empty());
    }

}