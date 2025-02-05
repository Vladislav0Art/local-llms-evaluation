package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document doc = new Document("http://test.com");
        Document cloneDoc = doc.clone();
        assertNotSame(doc, cloneDoc);
        assertEquals(doc.location(), cloneDoc.location());
    }

}