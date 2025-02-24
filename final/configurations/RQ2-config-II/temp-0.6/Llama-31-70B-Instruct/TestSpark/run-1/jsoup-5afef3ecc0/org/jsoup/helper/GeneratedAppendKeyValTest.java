package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValTest {

    @Mock
    URL inputUrl;

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        // Arrange
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal("key1", "val1");

        // Act
        urlBuilder.appendKeyVal(keyVal);

        // Assert
        // TODO: Assert the expected behavior
    }

}