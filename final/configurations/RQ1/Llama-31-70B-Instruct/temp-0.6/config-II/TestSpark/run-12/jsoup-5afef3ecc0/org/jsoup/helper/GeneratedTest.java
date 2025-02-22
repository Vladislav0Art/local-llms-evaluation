package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Test
    public void appendKeyValTest() throws Exception {
        // arrange
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // act
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "val1"));

        // assert
        assertEquals("key1=val1", urlBuilder.q.toString());
    }

}