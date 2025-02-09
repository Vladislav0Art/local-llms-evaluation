package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCharsetSetsCharset SetsCharsetSuccessfully {

    @Test
    public void charsetSetsCharset

    SetsCharsetSuccessfully() {
        Document document = new Document("https://example.com");
        Charset charset = Charset.forName("UTF-8");
        document.charset(charset);
        assertNotNull(document.charset());
    }

}