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
public class GeneratedText_[Scenario3]

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
    public void text_[ Scenario3]Test() {
        TextNode node = new TextNode(getWholeText());
        node.text("New Text");
        assertEquals("New Text", node.text());
    }

}