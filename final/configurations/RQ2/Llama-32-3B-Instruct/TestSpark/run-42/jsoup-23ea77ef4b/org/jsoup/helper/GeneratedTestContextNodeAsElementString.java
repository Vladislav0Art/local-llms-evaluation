package org.jsoup.helper;

public class GeneratedTestContextNodeAsElementString {

    @Test
    public void testContextNodeAsElementString() {
        Document wDoc = new org.jsoup.nodes.Document();
        Element element = wDoc.createElement("div");
        wDoc.appendChild(element);
        String contextNodeStr = W3CDom.asString(W3CDom.contextNode(wDoc));
        assertEquals("<div>", contextNodeStr);
    }
}

public class W3CDom {

    public static Node contextNode(Document doc) {
        return null;
    }

    public static String asString(Node node) {
        return "";
    }

}