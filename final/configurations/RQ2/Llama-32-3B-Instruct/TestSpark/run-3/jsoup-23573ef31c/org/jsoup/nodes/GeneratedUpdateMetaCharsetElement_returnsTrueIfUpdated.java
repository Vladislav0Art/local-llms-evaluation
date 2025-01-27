package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.jsoup.Jsoup.connect;

public class GeneratedUpdateMetaCharsetElement_returnsTrueIfUpdated {

    private Connection connectionMock = Mockito.mock(Connection.class);

    @Test
    public void updateMetaCharsetElement_returnsTrueIfUpdated() {
        Document document = new Document();
        boolean result = document.updateMetaCharsetElement();
        assertTrue(result);
    }

}