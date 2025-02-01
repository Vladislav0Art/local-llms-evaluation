package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedNormalizeQueryTest {

    @Test
    public void normalizeQueryTest() {
        String query = "jsoup   java";
        String normalized = StringUtil.borrowBuilder().append(query).append("?").toString();

        assertEquals("jsoup+++java", UrlBuilder.normalizeQuery(normalized));
    }

}