package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.mockito.Mockito;

public class GeneratedShallowCloneTest {

    @Test
    public void shallowCloneTest() {
        Document document = new Document("http://baseUri");
        Document clone = document.shallowClone();
        assertNotNull(clone);
        assertEquals(document.location(), clone.location());
    }

}