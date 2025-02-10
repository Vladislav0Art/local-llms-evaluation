package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testGet() {
        // Given
        String url = "https://example.com";

        // When
        Response response = client.get(url);

        // Then
        assertEquals(200, response.getStatus());
    }

    public static class Client {
        public static Response get(String url) {
            return new Response(HttpMethod.GET, url);
        }

        public static Response post(String url) {
            return new Response(HttpMethod.POST, url);
        }
    }

    public static class Response {
        private HttpMethod method;
        private String url;

        public Response(HttpMethod method, String url) {
            this.method = method;
            this.url = url;
        }

        public int getStatus() {
            return 200; // For simplicity
        }

        public enum HttpMethod {
            GET, POST, PUT, DELETE
        }
    }

}