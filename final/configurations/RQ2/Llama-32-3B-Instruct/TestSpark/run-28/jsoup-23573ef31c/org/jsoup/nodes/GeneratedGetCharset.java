package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedGetCharset {

    @Test
    public void getCharset() {
        Document document = new Document("https://www.example.com");
        Charset charset = document.charset();
        assertNotNull(charset);
    }

}