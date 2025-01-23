package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.io.IOException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHead_AppendsHtml {

    @Test
    public void outerHtmlHead_AppendsHtml() throws IOException {
        StringBuilder appendable = new StringBuilder();
        TextNode textNode = new TextNode("text");
        textNode.outerHtmlHead(appendable, 0, new Document.OutputSettings());
        assertEquals("<text>", appendable.toString());
    }

}