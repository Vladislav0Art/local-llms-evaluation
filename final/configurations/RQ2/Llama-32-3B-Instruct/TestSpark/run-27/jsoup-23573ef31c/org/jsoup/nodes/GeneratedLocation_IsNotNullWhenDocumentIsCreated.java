package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedLocation_IsNotNullWhenDocumentIsCreated {

    @Mock
    private Connection connectionMock;

    @Mock
    private Parser parserMock;

    @Mock
    private Element elementMock;

    public static final String BASE_URI = "https://example.com";

    public static final String CSS_QUERY = "#test";

    @Test
    public void location_IsNotNullWhenDocumentIsCreated() {
        Document document = new Document(BASE_URI);
        Mockito.verify(connectionMock, Mockito.never()).location();
        Mockito.when(elementMock.location()).thenReturn("");
    }

}