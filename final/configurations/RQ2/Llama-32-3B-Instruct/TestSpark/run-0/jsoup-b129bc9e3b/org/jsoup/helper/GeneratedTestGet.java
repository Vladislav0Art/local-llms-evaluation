package org.jsoup.helper;

public class GeneratedTestGet {

    public Response get(URL url) throws IOException {
        // Send a GET request to the specified URL
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Get the response object from the connection
        return new Response(connection);
    }

    private class Response {
        private int status;

        public Response(HttpURLConnection connection) throws IOException {
            // Read the response status from the connection
            int statusCode = connection.getResponseCode();

            // Set the response status to the read value
            this.status = statusCode;
        }

        public int getStatus() {
            return this.status;
        }
    }
}

public class URL {
    private String url;

    public URL(String url) {
        this.url = url;
    }

    public HttpURLConnection openConnection() throws IOException {
        // Send a GET request to the specified URL
        return (HttpURLConnection) new URL(url).openConnection();
    }
}

public class HttpURLConnection {

    public void setRequestMethod(String method) {
        // Set the request method to the provided value
    }

    public int getResponseCode() throws IOException {
        // Get the response code from the connection
        return 200;
    }
}

public class Test {

    @Test
    public void testGet() throws IOException, InterruptedException {
        // Create an instance of the HttpConnection class
        HttpConnection connection = new HttpConnection();

        // Call the get method on the connection object
        Response response = connection.get(new URL("http://www.example.com"));

        // Assert that the status code of the response is 200
        assertEquals(200, response.getStatus());
    }

}