package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class GeneratedGetEventsValidRequestTest {

    @Test
    public void getEventsValidRequestTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        GetEventsRequest request = new GetEventsRequest(); // assuming valid request
        GetEventsResponse response = server.getEvents(request);
        Assert.assertNotNull(response);
    }

}