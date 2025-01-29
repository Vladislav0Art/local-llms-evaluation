package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeList;

public class GeneratedConvertDocToString_conversion {

    @Test
    public void convertDocToString_conversion() {
        Document doc = new Document();
        StringBuilder sb = new StringBuilder();
        try {
            W3CDomHelper helper = new W3CDomHelper();
            String result = helper.asStringToString(doc, sb);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public class W3CDomHelper {
        private boolean namespaceAware;

        public boolean isNamespaceAware() {
            return namespaceAware;
        }

        public void setNamespaceAware(boolean namespaceAware) {
            this.namespaceAware = namespaceAware;
        }

        public String asStringToString(Document doc, StringBuilder sb) throws Exception {
            System.out.println(doc.outerHtml());
            return sb.toString();
        }
    }

}