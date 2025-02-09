package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedShallowCloneTest {

    // Test constructor

    @Test
    public void shallowCloneTest() {
        Document document = new Document("http://localhost");
        Document shallowClonedDoc = document.shallowClone();
        assertNotNull(shallowClonedDoc);
        assertNotSame(document, shallowClonedDoc);
    }

}