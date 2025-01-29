package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.jsoup.helper.DataUtil.UTF_8;
import static org.junit.jupiter.api.Assertions.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

public class GeneratedBuild_InvalidUrlTest {

    @Test
    public void build_InvalidUrlTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertThrows(MalformedURLException.class, () -> urlBuilder.build());
    }

}