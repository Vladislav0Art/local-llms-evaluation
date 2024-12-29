package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedShallowCloneTest {

    @Test
    public void shallowCloneTest() {
        Document document = new Document("http://base.uri");
        Document clonedDocument = document.shallowClone();
        assertEquals(document.location(), clonedDocument.location());
    }

}