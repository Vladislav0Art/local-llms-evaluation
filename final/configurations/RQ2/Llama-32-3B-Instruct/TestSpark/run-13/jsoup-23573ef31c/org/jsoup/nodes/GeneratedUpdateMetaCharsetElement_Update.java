package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUpdateMetaCharsetElement_Update {

    @Mock
    private Connection connection;

    @Mock
    private String baseUri;

    @Test
    public void updateMetaCharsetElement_Update() {
        Document document = new Document(baseUri);
        boolean result = document.updateMetaCharsetElement();
        Mockito.verifyNoMoreInteractions(result);
    }

}