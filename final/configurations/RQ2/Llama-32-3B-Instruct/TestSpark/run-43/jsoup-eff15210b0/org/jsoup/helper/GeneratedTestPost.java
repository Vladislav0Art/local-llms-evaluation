package org.jsoup.helper;

public class GeneratedTestPost {

    @Test
    public void testPost() {
        // Given
        String url = "https://example.com";

        // When
        Response response = client.post(url);

        // Then
        assertEquals(201, response.getStatus());
    }

    public static class Client {
        public Response post(String url) {
            return Response.create(HttpMethod.POST, url);
        }
    }

    // ...
}

}