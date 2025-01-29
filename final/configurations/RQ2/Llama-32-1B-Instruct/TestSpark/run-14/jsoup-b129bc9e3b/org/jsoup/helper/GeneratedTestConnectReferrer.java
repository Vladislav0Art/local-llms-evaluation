package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectReferrer {

    @Test
    public void testConnectReferrer() {
        String referrer = "https://www.example.com";
        HttpConnection connection = new HttpConnection(referrer);
        assertEquals(referrer, connection.referrer());
    }

}