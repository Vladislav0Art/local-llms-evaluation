package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHead_AppendsHtml {

    @Test
    public void outerHtmlHead_AppendsHtml() throws Exception {
        TextNode textNode = new TextNode("text");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlHead(sb, 0, Document.OutputSettings.defaultSettings());
        assertEquals("<text>", sb.toString());
    }

}