package org.traccar.protocol;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetResponse {

    private String response;

    @Before
    public void prepare() {
        // Mock data for the response
        this.response = "{\"error\": \"Invalid JSON\", \"message\": \"This is an invalid response\"}";
    }

    @Test
    public void testGetResponse() throws Exception {
        Response response = new Response(this.response);
        String actualResponse = response.getResponse();
        System.out.println(actualResponse);
    }

}