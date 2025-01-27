package org.jsoup.helper;

public class GeneratedTestSelect {

    public static List<Node> sourceNodes(Element element, Class<?> nodeClass) {
        List<Node> nodes = new ArrayList<>();
        // implementation of sourceNodes method
        return nodes;
    }

    public static List<Node> select(String xpath, String nodeValue) {
        List<Node> nodes = new ArrayList<>();
        // implementation of select method
        return nodes;
    }

    public static Element createElement(String tag) {
        // implementation of createElement method
        return null;
    }
}

public class Node {
}

public class Element {
}

public class TestW3CDom {

    @Test
    public void testSelect() {
        List<Node> nodes = new ArrayList<>();
        nodes.add(new Node());
        List<Node> result = W3CDom.select("/div", nodes.get(0).toString());
        assertEquals(1, result.size());
    }

}