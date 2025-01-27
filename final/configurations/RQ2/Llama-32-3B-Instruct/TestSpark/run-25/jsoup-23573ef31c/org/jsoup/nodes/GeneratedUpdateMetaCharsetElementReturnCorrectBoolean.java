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

public class GeneratedUpdateMetaCharsetElementReturnCorrectBoolean {

    @Test
    public void updateMetaCharsetElementReturnCorrectBoolean() {
        // Given
        boolean expectedUpdate = true;
        Document document = Jsoup.connect("http://example.com").get();

        // When
        boolean actualUpdate = document.updateMetaCharsetElement();

        // Then
        assertThat(actualUpdate, is(expectedUpdate));
    }

}