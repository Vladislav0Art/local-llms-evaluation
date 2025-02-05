package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateShellTest {

    @Mock
    private Connection mockConnection;

    @Test
    public void CreateShellTest() {
        Document doc = Document.createShell("https://example.com");
        assertNotNull(doc);
    }

}