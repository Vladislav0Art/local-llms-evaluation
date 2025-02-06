package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedUpdateMetaCharsetElementMethodUpdatesCorrectMetaTag {

    @Test
    public void updateMetaCharsetElementMethodUpdatesCorrectMetaTag() {
        boolean update = true;
        Document document = new Document();
        document.updateMetaCharsetElement(update);
        assertTrue(document.updateMetaCharsetElement());
    }

}