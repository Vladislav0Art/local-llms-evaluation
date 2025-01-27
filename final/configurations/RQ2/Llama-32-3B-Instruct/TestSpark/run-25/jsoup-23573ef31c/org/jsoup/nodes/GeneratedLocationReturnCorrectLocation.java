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

public class GeneratedLocationReturnCorrectLocation {

    @Test
    public void locationReturnCorrectLocation() {
        // Given
        String baseUri = "http://example.com";
        Document document = Jsoup.connect(baseUri).get();

        // When
        String expectedLocation = "/index.html";

        // Then
        assertThat(document.location(), is(expectedLocation));
    }

}