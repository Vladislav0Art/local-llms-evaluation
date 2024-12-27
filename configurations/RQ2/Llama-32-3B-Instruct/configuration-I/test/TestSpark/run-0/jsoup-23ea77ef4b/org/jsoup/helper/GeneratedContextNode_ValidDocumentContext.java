package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedContextNode_ValidDocumentContext {

    @Test
    public void contextNode_ValidDocumentContext() {
        Document validDoc = org.jsoup.nodes.Document.parse("<div>Hello</div>");
        Node result = W3CDom.contextNode(validDoc);
        assert result != null;
    }

}