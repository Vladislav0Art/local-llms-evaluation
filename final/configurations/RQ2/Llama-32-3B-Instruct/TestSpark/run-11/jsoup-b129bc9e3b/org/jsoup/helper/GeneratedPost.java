package org.jsoup.helper;

public class GeneratedPost {

    @Test
    public void post() throws IOException {
        HttpConnection connection = new HttpConnection();
        Document document = connection.post();
        assertNotNull(document);
    }

}