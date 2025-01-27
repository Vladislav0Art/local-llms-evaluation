package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Map;

public class GeneratedNewUrlBuilder_withUrlIsCorrect {

    @Test
    public void newUrlBuilder_withUrlIsCorrect() {
        URL url = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(url);
        assertTrue(builder.build().toURI().getScheme());
    }

}