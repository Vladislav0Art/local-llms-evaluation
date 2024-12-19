package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.Connection;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.net.URL;

public class GeneratedAppendKeyVal_connectionKeyVal_notStringReturnNewUrlBuilder {

    @Test
    public void appendKeyVal_connectionKeyVal_notStringReturnNewUrlBuilder() {
        // Arrange and Act
        Connection.KeyVal kv = new Connection.KeyVal(123L);
        UrlBuilder builder = new UrlBuilder("");
        builder.appendKeyVal(kv);

        boolean result = false; // assuming not string should not add anything

        // Assert
        assertThat(builder, is(result));
    }

}