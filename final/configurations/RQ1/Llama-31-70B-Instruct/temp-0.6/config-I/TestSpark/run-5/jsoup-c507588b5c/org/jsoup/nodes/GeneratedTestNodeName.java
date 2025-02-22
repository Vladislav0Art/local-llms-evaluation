package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

@RunWith(PowerMockRunner.class)
public class GeneratedTestNodeName {

    TextNode .class,Entities .class
})

public class TextNodeTest {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("Test Text");
        assertEquals(textNode.nodeName(), "#text");
    }

}