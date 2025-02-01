package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendToAsciiWithSpecialCharTest {

    @Test
    public void appendToAsciiWithSpecialCharTest() {
        try {
            URL inputUrl = new URL("http://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            StringBuilder sb = StringUtil.borrowBuilder();
            urlBuilder.appendToAscii("あ", false, sb);
            assertTrue(URLEncoder.encode("あ", UTF_8.name()).equals(sb.toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}