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

public class GeneratedTest {

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

    @Test
    public void createElementReturnCorrectElement() {
        // Given
        String expectedTagName = "div";
        Document document = Jsoup.connect("http://example.com").get();

        // When
        Element actualElement = document.createElement(expectedTagName);

        // Then
        assertThat(actualElement.tagName(), is(expectedTagName));
    }

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

    @Test
    public void createElementReturnCorrectElementWithMock() {
        // Given
        String expectedTagName = "div";
        Connection connection = mock(Connection.class);
        when(connection.get()).thenReturn("http://example.com");
        Document document = Jsoup.connect(connection).get();

        // When
        Element actualElement = document.createElement(expectedTagName);

        // Then
        assertThat(actualElement.tagName(), is(expectedTagName));
    }

    @Test
    public void createElementReturnCorrectElementWithNoMock() {
        // Given
        String expectedTagName = "div";
        Document document = Jsoup.connect("http://example.com").get();

        // When
        Element actualElement = document.createElement(expectedTagName);

        // Then
        assertThat(actualElement.tagName(), is(expectedTagName));
    }

}