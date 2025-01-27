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

public class GeneratedConnectionReturnCorrectConnection {

    @Test
    public void connectionReturnCorrectConnection() {
        // Given
        Connection expectedConnection = Jsoup.connect("http://example.com");
        Document document = Jsoup.connect("http://example.com").get();

        // When
        Connection actualConnection = document.connection();

        // Then
        assertThat(actualConnection, is(expectedConnection));
    }

}