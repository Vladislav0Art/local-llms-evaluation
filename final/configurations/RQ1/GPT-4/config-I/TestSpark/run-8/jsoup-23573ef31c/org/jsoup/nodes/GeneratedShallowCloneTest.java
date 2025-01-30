package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class GeneratedShallowCloneTest {

    @Test
    public void shallowCloneTest() {
        Document doc = new Document("http://example.com");
        Document clone = doc.shallowClone();
        assertNotNull(clone);
        assertEquals(doc.outputSettings(), clone.outputSettings());
    }

}