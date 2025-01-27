package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.charset.Charset;
import org.jsoup.nodes.Connection;
import org.jsoup.nodes.OutputSettings;

public class GeneratedTestDocumentOutputSettings {

    public static Connection getConnection() {
        return new Connection();
    }

    @Test
    public void testDocumentOutputSettings() {
        Document document = new Document();
        OutputSettings settings = getOutputSettings();
        document.outputSettings(settings);
        assertNotNull(document.outputSettings());
    }
}

public class Connection implements org.jsoup.nodes.Connection {
}

public class Element extends org.jsoup.nodes.Element {
}

public class Elements extends org.jsoup.select.Elements {
}

public class Charset extends org.jsoup.charset.Charset {
}

}