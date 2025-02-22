package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @BeforeEach
    void setUp() throws MalformedURLException {
        urlBuilder = new UrlBuilder(new URL("https://www.example.com"));
    }

}