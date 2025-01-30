package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        Constructor<KeyVal> constructor = KeyVal.class.getDeclaredConstructor(String.class, String.class);
        constructor.setAccessible(true);

        URL url = new URL("https://www.example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        KeyVal kv = constructor.newInstance("param", "value");
        urlBuilder.appendKeyVal(kv);

        String queryAfterAppend = extractQueryBuilderValue(urlBuilder);
        assertEquals("param=value", queryAfterAppend);

        KeyVal kv2 = constructor.newInstance("param2", "value2");
        urlBuilder.appendKeyVal(kv2);

        String queryAfterSecondAppend = extractQueryBuilderValue(urlBuilder);
        assertEquals("param=value&param2=value2", queryAfterSecondAppend);
    }

    private String extractQueryBuilderValue(UrlBuilder urlBuilder) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {

        Method m = UrlBuilder.class.getDeclaredMethod("result");
        m.setAccessible(true);
        return StringUtil.releaseBuilder((StringBuilder) m.invoke(urlBuilder));
    }

}