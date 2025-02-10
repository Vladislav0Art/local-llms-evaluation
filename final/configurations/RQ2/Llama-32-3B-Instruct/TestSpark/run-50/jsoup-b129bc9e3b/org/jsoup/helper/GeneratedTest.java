package org.jsoup.helper;

public class GeneratedTest {

    private boolean ignoreHttpErrors;
    private String data;

    public void setIgnoreHttpErrors(boolean ignoreHttpErrors) {
        this.ignoreHttpErrors = ignoreHttpErrors;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getResponseBody() throws IOException, InterruptedException {
        if (ignoreHttpErrors && data == null) {
            throw new RuntimeException("No response body found");
        } else if (data != null) {
            return data;
        } else {
            throw new RuntimeException("No response body found");
        }
    }

    public void sendRequest() throws IOException, InterruptedException {
        // implement logic to send request and get response
    }

    public void closeConnection() {
        // implement logic to close connection
    }
}

public class Test {

    @Test
    public void test() throws IOException, InterruptedException {
        HttpURLConnection httpURLConnection1 = new HttpURLConnection();
        HttpURLConnection httpURLConnection2 = new HttpURLConnection();
        HttpURLConnection httpURLConnection3 = new HttpURLConnection();
        HttpURLConnection httpURLConnection4 = new HttpURLConnection();
        HttpURLConnection httpURLConnection5 = new HttpURLConnection();

        httpURLConnection1.setIgnoreHttpErrors(true);
        httpURLConnection1.setData("Hello, World!");

        httpURLConnection2.setIgnoreHttpErrors(false);
        httpURLConnection2.setData(null);

        httpURLConnection3.setIgnoreHttpErrors(false);
        httpURLConnection3.setData("Hello, World!");

        httpURLConnection4.setIgnoreHttpErrors(true);
        httpURLConnection4.setData("");

        httpURLConnection5.setIgnoreHttpErrors(false);
        httpURLConnection5.setData("Hello, World!");

        assertEquals("Hello, World!", httpURLConnection1.getResponseBody());
        assertThrows(RuntimeException.class, () -> httpURLConnection2.getResponseBody());

        assertEquals("Hello, World!", httpURLConnection3.getResponseBody());
        assertEquals("", httpURLConnection4.getResponseBody());
        assertEquals("Hello, World!", httpURLConnection5.getResponseBody());

        httpURLConnection1.setRequestMethod("GET");
        httpURLConnection1.sendRequest();

        httpURLConnection2.setRequestMethod("POST");
        try {
            httpURLConnection2.getResponseBody();
        } catch (IOException | InterruptedException e) {
        }

        httpURLConnection3.setRequestMethod("PUT");
        try {
            httpURLConnection3.getResponseBody();
        } catch (IOException | InterruptedException e) {
        }

        httpURLConnection4.setRequestMethod("DELETE");
        try {
            httpURLConnection4.getResponseBody();
        } catch (IOException | InterruptedException e) {
        }

        httpURLConnection5.setRequestMethod("GET");
        assertEquals("Hello, World!", httpURLConnection5.getResponseBody());

        httpURLConnection1.closeConnection();
        httpURLConnection2.closeConnection();
        httpURLConnection3.closeConnection();
        httpURLConnection4.closeConnection();
        httpURLConnection5.closeConnection();
    }

}