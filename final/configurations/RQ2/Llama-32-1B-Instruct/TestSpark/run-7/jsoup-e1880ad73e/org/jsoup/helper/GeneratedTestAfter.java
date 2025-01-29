package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.ConnectionBuilder;
import org.jsoup.Javascript;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestAfter {

    private Document doc;

    @Before
    public void setup() {
        Connection connection = ConnectionBuilder.newConnection();
        connection.connect("https://example.com");
        doc = connection.build().document();
    }

    @Test
    public void testAfter() {
        System.out.println("After called.");
    }
}

class KeyVal {
    private Element inputElement;
    private String value;

    public KeyVal(Element inputElement, String value) {
        this.inputElement = inputElement;
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyVal{" +
                "inputElement=" + inputElement.toString() +
                ", value='" + value + '\'' +
                '}';
    }
}

class URLBuilder {
    private Document doc;

    public URLBuilder(Document doc) {
        this.doc = doc;
    }

    public void appendKeyVal(KeyVal keyVal) throws Exception {
        System.out.println("Appended KeyVal");
        System.out.println(keyVal.toString());
    }

    @Override
    public String toString() {
        return "URLBuilder{" +
                "doc=" + doc +
                '}';
    }

}