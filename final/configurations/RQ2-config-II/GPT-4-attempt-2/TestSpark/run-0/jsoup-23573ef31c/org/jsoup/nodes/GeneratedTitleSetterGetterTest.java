package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;
import org.jsoup.nodes.*;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTitleSetterGetterTest {

    @Test
    public void titleSetterGetterTest() {
        String uri = "http://example.com";
        Document document = new Document(uri);
        String title = "Test Title";
        document.title(title);
        assertEquals(title, document.title());
    }

}