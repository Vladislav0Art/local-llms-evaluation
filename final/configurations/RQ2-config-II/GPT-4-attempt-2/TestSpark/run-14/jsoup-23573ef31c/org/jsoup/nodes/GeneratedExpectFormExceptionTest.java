package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedExpectFormExceptionTest {

    @Test
    public void expectFormExceptionTest() {
        Document document = new Document("http://baseUri.com");
        document.expectForm("nonexistent");
    }

}