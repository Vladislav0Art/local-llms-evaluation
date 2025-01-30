package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderDecodePart {

    @Test
    public void urlBuilderDecodePart() throws Exception {
        String encoded = "%C3%B8";
        Method method = UrlBuilder.class.getDeclaredMethod("decodePart", String.class);
        method.setAccessible(true);

        String result = (String) method.invoke(null, encoded);

        assertEquals("ø", result);
    }

}