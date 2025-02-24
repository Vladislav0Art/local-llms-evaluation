package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.HttpConnection;

public class GeneratedTestFollowRedirects {

    @Test
    public void testFollowRedirects() {
        HttpConnection connection = new HttpConnection();
        connection.followRedirects(false);
        assertFalse(connection.request().followRedirects());
    }

}