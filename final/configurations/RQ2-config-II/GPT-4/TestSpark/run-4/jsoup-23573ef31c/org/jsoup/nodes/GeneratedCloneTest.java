package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document document = new Document("https://www.example.com");
        Document clone = document.clone();
        Assert.assertNotSame(document, clone);
    }

}