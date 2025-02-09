package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;
import org.jsoup.nodes.*;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document document = new Document("http://example.com");
        Document clonedDocument = document.clone();
        clonedDocument.updateMetaCharsetElement(true);
        assertNotEquals(document.updateMetaCharsetElement(), clonedDocument.updateMetaCharsetElement());
    }

}