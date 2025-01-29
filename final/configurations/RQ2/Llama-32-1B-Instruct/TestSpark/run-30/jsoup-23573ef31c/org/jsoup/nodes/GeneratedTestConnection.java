package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestConnection {

    public String connection() {
        return "Jsoup Node";
    }

    @Before
    public void setup() {
        JsoupNode.main(new String[]{"JsoupNode", "Connection"});
    }
}

public class DocumentTest {
    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void testConnection() {
        Connection connection = (Connection) document.connection();
        assertNotNull(connection);
    }
}

public class FormElementTest {
    private Document document;

    @Before
    public void setup() {
        document = new Document();
    }

}