package org.jsoup.helper;

public class GeneratedTestMaxBodySize {

    @Test
    public void testMaxBodySize() throws IOException {
        HttpURLConnection connection = (HttpURLConnection) HttpConnection.connect("https://example.com", 1024 * 1024 * 1);
        InputStream inputStream = connection.getInputStream();
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            // Do something with the data
        }
    }

}