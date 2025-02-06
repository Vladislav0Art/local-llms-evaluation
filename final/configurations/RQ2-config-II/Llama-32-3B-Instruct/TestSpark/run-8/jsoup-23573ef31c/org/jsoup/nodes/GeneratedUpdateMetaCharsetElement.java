package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedUpdateMetaCharsetElement {

    @Test
    public void updateMetaCharsetElement() {
        Document document = Jsoup.parse("<meta charset=\"UTF-8\"></meta>");
        boolean update = true;
        document.updateMetaCharsetElement(update);
        assertTrue(update);
    }

}