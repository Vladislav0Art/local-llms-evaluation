package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendToAscii_non_ascii {

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void appendToAscii_non_ascii() {
        // arrange
        String s = "\u00e9";
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));

        // act
        StringBuilder sb = new StringBuilder();
        builder.appendToAscii(s, false, sb);

        // assert
        Mockito.verify(builder.u).getPath();
    }

}