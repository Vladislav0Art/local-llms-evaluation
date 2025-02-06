package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCharsetDefaultCharset {

    @Test
    public void charsetDefaultCharset() {
        Document document = new Document("");
        Charset charset = document.charset();
        assert charset != null;
    }

}