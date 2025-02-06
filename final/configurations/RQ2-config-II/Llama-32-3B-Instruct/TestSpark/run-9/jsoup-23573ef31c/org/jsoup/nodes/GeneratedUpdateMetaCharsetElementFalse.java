package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedUpdateMetaCharsetElementFalse {

    @Test
    public void updateMetaCharsetElementFalse() {
        Document document = new Document("");
        boolean result = document.updateMetaCharsetElement(false);
        assert !result;
    }

}