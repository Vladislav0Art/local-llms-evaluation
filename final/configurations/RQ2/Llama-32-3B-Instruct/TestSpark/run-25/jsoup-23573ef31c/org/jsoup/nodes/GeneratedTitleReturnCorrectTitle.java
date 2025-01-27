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

public class GeneratedTitleReturnCorrectTitle {

    @Test
    public void titleReturnCorrectTitle() {
        // Given
        String expectedTitle = "Document Title";
        Document document = Jsoup.connect("http://example.com").get();

        // When
        String actualTitle = document.title();

        // Then
        assertThat(actualTitle, is(expectedTitle));
    }

}