package org.jsoup.nodes;

public class GeneratedConnection_test {

    @Test
    public void connection_test() {
        Connection connection = Jsoup.connect("http://example.com").get();
        Document document = connection.get().document();
        assertNotNull(document.connection());
    }

}