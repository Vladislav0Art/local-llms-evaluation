package org.jsoup.helper;

public class GeneratedGet {

    @Test
    public void get() throws IOException {
        HttpConnection connection = new HttpConnection();
        Document document = connection.get();
        assertNotNull(document);
    }

}