package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document original = new Document("http://test.com");
        Document clone = original.clone();
        assertNotNull(clone);
        assertNotSame(original, clone);
    }

}