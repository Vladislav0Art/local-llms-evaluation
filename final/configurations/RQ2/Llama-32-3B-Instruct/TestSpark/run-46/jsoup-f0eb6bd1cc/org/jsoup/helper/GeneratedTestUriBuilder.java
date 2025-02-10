package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

public class GeneratedTestUriBuilder {

    @Test
    public void testUriBuilder() {
        // Create URI object manually as it's not available in JUnit
        String uri = "/path/to/resource";
        try {
            java.net.URI parsedUri = new java.net.URI(uri);
            System.out.println(parsedUri);
        } catch (Exception e) {
            System.out.println("Invalid URI");
        }
    }

}