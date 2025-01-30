package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedBuildTest_WithNonASCIICharacter {

    @Test
    public void buildTest_WithNonASCIICharacter() throws Exception {
        URL inputUrl = new URL("http://例子.卷筒纸");
        UrlBuilder obj = new UrlBuilder(inputUrl);
        obj.build();
    }

}