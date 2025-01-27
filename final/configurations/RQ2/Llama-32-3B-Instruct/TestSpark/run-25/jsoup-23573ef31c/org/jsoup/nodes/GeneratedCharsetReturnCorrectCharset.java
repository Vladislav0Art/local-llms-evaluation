package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCharsetReturnCorrectCharset {

    @Test
    public void charsetReturnCorrectCharset() {
        // Given
        Charset expectedCharset = Charset.forName("UTF-8");
        Document document = Jsoup.connect("http://example.com").get();

        // When
        Charset actualCharset = document.charset();

        // Then
        assertThat(actualCharset, is(expectedCharset));
    }

}