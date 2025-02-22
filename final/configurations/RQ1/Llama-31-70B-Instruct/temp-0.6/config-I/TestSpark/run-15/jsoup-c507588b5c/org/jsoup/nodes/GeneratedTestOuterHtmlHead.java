package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestOuterHtmlHead {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("some text");
    }

    @Test
    public void testOuterHtmlHead() throws java.io.IOException {
        Appendable appendable = Mockito.mock(Appendable.class);
        Document.OutputSettings outputSettings = Mockito.mock(Document.OutputSettings.class);
        doReturn(true).when(outputSettings).prettyPrint();
        doReturn(true).when(outputSettings).outline();
        textNode.outerHtmlHead(appendable, 2, outputSettings);
    }

}