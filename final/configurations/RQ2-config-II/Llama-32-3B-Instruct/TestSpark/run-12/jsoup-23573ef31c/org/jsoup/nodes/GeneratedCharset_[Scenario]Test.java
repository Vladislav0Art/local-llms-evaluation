package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCharset_[Scenario]

Test {

    @Test
    public void charset_[ Scenario]Test() {
        Charset charset = Charset.forName("UTF-8");
        Document document = Document.createShell("https://example.com");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

}