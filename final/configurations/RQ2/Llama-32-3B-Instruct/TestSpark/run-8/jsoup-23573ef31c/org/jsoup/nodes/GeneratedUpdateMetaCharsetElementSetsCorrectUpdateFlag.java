package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedUpdateMetaCharsetElementSetsCorrectUpdateFlag {

    @Test
    public void updateMetaCharsetElementSetsCorrectUpdateFlag() {
        boolean update = true;
        Document document = new Document("http://example.com");
        document.updateMetaCharsetElement(update);
        assertTrue(document.updateMetaCharsetElement());
    }

}