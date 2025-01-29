package org.jsoup.helper;

public class GeneratedNamespaceAwareWithMap {

    private static org.jsoup.nodes.Document document;
    private static org.jsoup.nodes.Document output;

    @Test
    public void namespaceAwareWithMap() {
        Map<String, String> map = new HashMap<>();
        map.put("namespace", "ns");
        document = W3CDom.convert(map);
        assertTrue(document.hasAttribute("namespace"));
    }

}