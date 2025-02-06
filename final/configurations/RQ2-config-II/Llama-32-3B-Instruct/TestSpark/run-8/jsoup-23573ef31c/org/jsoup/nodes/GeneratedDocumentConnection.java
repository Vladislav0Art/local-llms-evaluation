package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedDocumentConnection {

    @Test
    public void documentConnection() {
        Connection connection = new Connection();
        Document document = Document.createShell(connection);
        assertNotNull(document.connection());
    }

}