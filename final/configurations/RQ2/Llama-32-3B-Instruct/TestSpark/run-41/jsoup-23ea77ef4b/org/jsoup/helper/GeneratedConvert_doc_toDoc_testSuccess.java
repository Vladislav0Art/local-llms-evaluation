package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedConvert_doc_toDoc_testSuccess {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private Transformer transformer;

    @Test
    public void convert_doc_toDoc_testSuccess() {
        Document in = Mockito.mock(Document.class);
        Document out = Mockito.mock(Document.class);
        when(documentBuilder.newDocumentBuilder()).thenReturn(out);
        new W3CDom().convert(in, out);
    }

}