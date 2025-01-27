package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedConstructorWithNullUrlThrowsNullPointerException {

    @Test
    public void constructorWithNullUrlThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

}