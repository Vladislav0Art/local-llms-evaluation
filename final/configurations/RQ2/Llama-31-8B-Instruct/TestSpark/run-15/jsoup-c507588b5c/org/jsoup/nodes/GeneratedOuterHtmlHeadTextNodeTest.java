package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHeadTextNodeTest {

    @Test
    public void outerHtmlHeadTextNodeTest() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlHead(sb, 0, Document.OutputSettings.defaultSettings());
        assertEquals("<text>Hello World</text>", sb.toString());
    }

}