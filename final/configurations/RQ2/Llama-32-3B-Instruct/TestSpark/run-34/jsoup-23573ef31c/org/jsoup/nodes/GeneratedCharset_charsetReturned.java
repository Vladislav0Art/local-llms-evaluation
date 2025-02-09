package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class GeneratedCharset_charsetReturned {

    @Test
    public void charset_charsetReturned() {
        Charset charset = Charset.forName("UTF-8");
        Document document = Document.createShell(charset.toString());
        assertEquals(charset, document.charset());
    }

}