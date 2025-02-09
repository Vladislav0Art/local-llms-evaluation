package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedCharset_CharsetIsSet {

    @Mock
    private Connection connection;

    @Mock
    private Parser parser;

    @Mock
    private QuirksMode quirksMode;

    @Mock
    private OutputSettings outputSettings;

    @Test
    public void charset_CharsetIsSet() {
        Charset charset = Charset.forName("UTF-8");
        Document document = new Document("http://example.com");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

}