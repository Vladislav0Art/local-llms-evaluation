package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedShallowCloneTest {

    @Test
    public void shallowCloneTest() {
        Document doc = new Document("http://test.com");
        Assert.assertNotSame(doc, doc.shallowClone());
    }

}