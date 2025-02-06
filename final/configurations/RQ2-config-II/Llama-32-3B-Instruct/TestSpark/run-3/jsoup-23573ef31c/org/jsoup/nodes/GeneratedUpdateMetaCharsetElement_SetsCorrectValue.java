package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedUpdateMetaCharsetElement_SetsCorrectValue {

    @Test
    public void updateMetaCharsetElement_SetsCorrectValue() {
        boolean update = true;
        Document document = new Document();
        document.updateMetaCharsetElement(update);
        assertTrue(document.metaCharsetElement().equals(update));
    }

}