package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedShallowClone_ReturnsShallowCopyOfDocumentObject {

    @Mock
    private Connection connectionMock;

    @Mock
    private Parser parserMock;

    @Mock
    private Element elementMock;

    public static final String BASE_URI = "https://example.com";

    public static final String CSS_QUERY = "#test";

    @Test
    public void shallowClone_ReturnsShallowCopyOfDocumentObject() {
        Document document = new Document(BASE_URI);
        Document copy = document.clone();
        Mockito.verify(elementMock, Mockito.never()).clone();
        Assert.assertEquals(document, copy);
    }

}