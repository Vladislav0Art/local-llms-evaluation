package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document doc = new Document("https://google.com");
        Document clone = doc.clone();
        Assert.assertEquals(doc.outerHtml(), clone.outerHtml());
    }

}