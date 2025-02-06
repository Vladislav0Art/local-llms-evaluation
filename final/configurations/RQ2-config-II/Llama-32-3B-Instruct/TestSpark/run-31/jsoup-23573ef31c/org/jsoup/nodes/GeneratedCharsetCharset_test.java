package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCharsetCharset_test {

    @Test
    public void charsetCharset_test() {
        Charset charset = Charset.forName("UTF-8");
        Document document = Document.createShell("http://example.com").charset(charset);
        assertNotNull(document.charset());
        assertTrue(document.charset() == charset);
    }

}