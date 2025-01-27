package org.jsoup.nodes;

public class GeneratedLocationConnection_test {

    @Test
    public void locationConnection_test() {
        Connection connection = Jsoup.connect("http://example.com").get();
        Document document = connection.get().document();
        assertEquals(connection.url(), document.location());
    }

}