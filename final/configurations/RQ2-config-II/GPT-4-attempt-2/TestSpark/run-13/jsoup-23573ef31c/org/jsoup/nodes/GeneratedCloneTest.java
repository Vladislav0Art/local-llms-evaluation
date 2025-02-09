package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.mock;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document document = new Document("");
        Document clone = document.clone();
        Assert.assertNotSame(document, clone);
    }

}