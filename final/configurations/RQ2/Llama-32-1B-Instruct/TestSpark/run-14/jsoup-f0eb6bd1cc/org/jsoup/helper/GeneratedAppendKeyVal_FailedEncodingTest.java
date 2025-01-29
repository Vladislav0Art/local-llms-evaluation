package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class GeneratedAppendKeyVal_FailedEncodingTest {

    public String build() {
        return "http://example.com";
    }

    @Test
    public void appendKeyVal_FailedEncodingTest() {
        try {
            build();
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
            // expected
        }
    }

}