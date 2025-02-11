package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import javax.annotation.Nullable;

public class GeneratedEmptyUrlReturnsOriginal {

    @Test
    public void emptyUrlReturnsOriginal() throws MalformedURLException {
        URL u = null;
        UrlBuilder builder = new UrlBuilder(u);
        URL original = u;
        URL built = builder.build();
        assertSame(original, built);
    }

}