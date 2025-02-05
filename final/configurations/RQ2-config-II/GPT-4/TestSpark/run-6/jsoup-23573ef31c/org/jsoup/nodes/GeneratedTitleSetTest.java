package org.jsoup.nodes;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.when;

public class GeneratedTitleSetTest {

    @Test
    public void titleSetTest() {
        Document document = new Document("http://localhost");
        document.title("Test Title");
        Assert.assertEquals("Test Title", document.title());
    }

}