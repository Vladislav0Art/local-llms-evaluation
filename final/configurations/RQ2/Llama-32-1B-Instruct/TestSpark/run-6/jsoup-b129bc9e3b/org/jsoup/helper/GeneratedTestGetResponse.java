package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetResponse {

    @Test
    public void testGetResponse() {
        Response response = new Response();
        assertEquals(200, response.getStatusCode());
        assertEquals("OK", response.getResponse());
    }

}