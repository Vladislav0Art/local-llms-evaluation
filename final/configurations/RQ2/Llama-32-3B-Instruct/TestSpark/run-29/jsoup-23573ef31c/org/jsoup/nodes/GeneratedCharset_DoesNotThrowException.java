package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCharset_DoesNotThrowException {

    @Mock
    private Connection connection;

    @Mock
    private Parser parser;

    @Mock
    private QuirksMode quirksMode;

    @InjectMocks
    private Document document;

    @Test
    public void charset_DoesNotThrowException() {
        Charset expectedCharset = Charset.forName("UTF-8");
        Document testDocument = new Document("https://example.com");
        testDocument.charset(expectedCharset);
        assertEquals(expectedCharset, testDocument.charset());
    }

}