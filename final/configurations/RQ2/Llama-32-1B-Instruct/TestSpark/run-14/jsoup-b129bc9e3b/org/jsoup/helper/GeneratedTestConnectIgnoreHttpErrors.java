package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectIgnoreHttpErrors {

    @Test
    public void testConnectIgnoreHttpErrors() {
        boolean ignoreHttpErrors = true;
        HttpConnection connection = new HttpConnection(ignoreHttpErrors(ignoreHttpErrors));
        assertTrue(connection.ignoreHttpErrors(ignoreHttpErrors) == true);
        assertFalse(connection.ignoreHttpErrors(ignoreHttpErrors) == false);
    }

}