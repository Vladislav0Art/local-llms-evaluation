package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedCreateShellValidUriTest {

    @Test
    public void createShellValidUriTest() {
        Document document = Document.createShell("http://test.com");
        assertNotNull(document);
    }

}