package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedUpdateMetaCharsetElementMethodTest {

    @Test
    public void updateMetaCharsetElementMethodTest() {
        boolean update = true;
        Document document = new Document();
        document.updateMetaCharsetElement(update);
        assertTrue(update);
    }

}