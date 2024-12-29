package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeList;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConvertJsoupDocumentTest {

    @InjectMocks
    private W3CDom w3CDom;

    @Test
    public void convertJsoupDocumentTest() {
        org.jsoup.nodes.Document jsoupDoc = new Document();
        org.w3c.dom.Document w3cDoc = w3CDom.convertJsoup(org.jsoup.nodes.Document.class.cast(jsoupDoc));
        assertNotNull(w3cDoc);
    }

}