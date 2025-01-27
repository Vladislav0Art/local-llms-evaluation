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

public class GeneratedCreateShellDocument {

    @Test
    public void createShellDocument() {
        // Given
        String baseUri = "http://example.com";
        List<Tag> tags = new ArrayList<>();
        Document document = Jsoup.connect(baseUri).get();

        // When
        Document expectedDocument = Document.createShell(baseUri);
        assertThat(expectedDocument, is(document));
    }

}