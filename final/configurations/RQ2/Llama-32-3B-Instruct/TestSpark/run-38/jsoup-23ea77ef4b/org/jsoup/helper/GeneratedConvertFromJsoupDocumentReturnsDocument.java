package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConvertFromJsoupDocumentReturnsDocument {

    @Mock
    private Node contextNodeMock;

    @Mock
    private Document documentMock;

    @Test
    public void convertFromJsoupDocumentReturnsDocument() {
        Document expectedDoc = documentMock;
        when(documentMock.getXml());
        when(W3CDom.convert(documentMock)).thenReturn(expectedDoc);
        Document actualDoc = W3CDom.convert(documentMock);
        assertEquals(expectedDoc, actualDoc);
    }

}