package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConvertFromJsoupElementReturnsDocument {

    @Mock
    private Node contextNodeMock;

    @Mock
    private Document documentMock;

    @Test
    public void convertFromJsoupElementReturnsDocument() {
        Element elementMock = mock(Element.class);
        Document expectedDoc = documentMock;
        when(elementMock.getXml()).thenReturn(expectedDoc);
        when(W3CDom.fromJsoup(elementMock)).thenReturn(expectedDoc);
        Document actualDoc = W3CDom.fromJsoup(elementMock);
        assertEquals(expectedDoc, actualDoc);
    }

}