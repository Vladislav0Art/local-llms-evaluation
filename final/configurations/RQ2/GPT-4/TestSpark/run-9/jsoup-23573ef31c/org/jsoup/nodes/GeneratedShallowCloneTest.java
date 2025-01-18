package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedShallowCloneTest {

    @Test
    public void shallowCloneTest() {
        Document doc1 = new Document("http://example.com");
        Document doc2 = doc1.shallowClone();

        Assert.assertNotSame(doc1, doc2);
    }

}