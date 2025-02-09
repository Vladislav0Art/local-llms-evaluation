package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.mock;

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        Document document = new Document("");
        document.title("test title");
        Assert.assertEquals("test title", document.title());
    }

}