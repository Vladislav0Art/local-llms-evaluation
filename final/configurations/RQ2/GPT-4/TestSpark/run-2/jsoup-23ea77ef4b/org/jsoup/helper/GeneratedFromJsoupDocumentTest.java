package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFromJsoupDocumentTest {

    private W3CDom w3CDom = new W3CDom();

    @Test
    public void fromJsoupDocumentTest() {
        Document documentMock = Mockito.mock(Document.class);
        w3CDom.fromJsoup(documentMock);
    }

}