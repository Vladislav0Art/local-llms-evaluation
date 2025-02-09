package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAsStringReturnsDocumentXml {

    @Mock
    private Node contextNodeMock;

    @Mock
    private Document documentMock;

    @Test
    public void asStringReturnsDocumentXml() {
        String expectedXml = documentMock.getXml();
        when(documentMock.toString()).thenReturn(expectedXml);
        String actualXml = W3CDom.asString(documentMock);
        assertEquals(expectedXml, actualXml);
    }

}