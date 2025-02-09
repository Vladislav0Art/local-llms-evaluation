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
public class GeneratedAsString_doc_testSuccess {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private Transformer transformer;

    @Test
    public void asString_doc_testSuccess() {
        Document document = Mockito.mock(Document.class);
        String result = "test";
        when(document.toString(Mockito.any(String.class))).thenReturn(result);
        assertEquals(result, new W3CDom().asString(document));
    }

}