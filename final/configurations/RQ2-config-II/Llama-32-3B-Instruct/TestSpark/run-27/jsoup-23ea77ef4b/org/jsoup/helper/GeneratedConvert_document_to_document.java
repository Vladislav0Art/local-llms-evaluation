package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConvert_document_to_document {

    @Mock
    private DocumentBuilderFactory factory;

    public W3CDomTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void convert_document_to_document() {
        Document document = new org.jsoup.nodes.Document();
        when(factory.newDocumentBuilder()).thenReturn(new org.w3c.dom.Document.Builder());
        W3CDom w3cdom = new W3CDom();
        Document result = w3cdom.convert(document, new org.w3c.dom.Document.Builder());
        assertNotNull(result);
    }

}