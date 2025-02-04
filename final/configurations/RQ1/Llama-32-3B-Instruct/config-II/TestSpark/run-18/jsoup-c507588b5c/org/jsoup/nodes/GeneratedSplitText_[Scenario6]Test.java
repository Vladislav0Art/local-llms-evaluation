package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitText_[Scenario6]

Test {

    @Mock
    private Node parentNode;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    public String getWholeText () {
        return "Hello World";
    }

    public String coreValue () {
        return "Hello World";
    }

    @Test
    public void splitText_[ Scenario6]Test() throws IOException {
        TextNode node = new TextNode(getWholeText());
        TextNode tail = node.splitText(7);
        assertEquals("Hello ", tail.getWholeText());
        assertEquals(" World", node.getWholeText());
    }

}