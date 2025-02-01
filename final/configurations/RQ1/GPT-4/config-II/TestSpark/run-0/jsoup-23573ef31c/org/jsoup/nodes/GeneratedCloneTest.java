package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document doc = new Document("http://example.com");
        doc.charset(StandardCharsets.ISO_8859_1);
        doc.updateMetaCharsetElement(true);

        Document clone = doc.clone();
        assertEquals(doc.charset(), clone.charset());
        assertEquals(doc.updateMetaCharsetElement(), clone.updateMetaCharsetElement());
        assertEquals(doc.location(), clone.location());
    }

}