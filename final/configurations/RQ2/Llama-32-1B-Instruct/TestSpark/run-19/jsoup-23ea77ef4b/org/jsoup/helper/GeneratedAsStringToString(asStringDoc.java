package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeList;

public class GeneratedAsStringToString(asStringDoc {

    @Test
    public void asStringToString(asStringDoc() {
        Document doc = new Document();
        StringBuilder sb = new StringBuilder();
        try {
            W3CDom.asStringToString(doc, sb);
            assertEquals(sb.toString(), asStringDoc());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}