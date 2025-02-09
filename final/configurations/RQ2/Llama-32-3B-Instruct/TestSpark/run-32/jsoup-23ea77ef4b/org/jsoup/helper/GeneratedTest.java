package org.jsoup.helper;

public class GeneratedTest {

    private int id;

    public Node(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

public class NodeList {
    private List<Node> elements;

    public NodeList() {
        this.elements = new ArrayList<>();
    }

    public void add(Node element) {
        this.elements.add(element);
    }

    public List<Node> getElements() {
        return elements;
    }

    @FunctionalInterface
    interface Factory<T> {
        T create();
    }

    public static <T> List<T> sourceNodes(NodeList nodeList, Class<T> clazz) {
        List<T> result = new ArrayList<>();
        for (Node node : nodeList.getElements()) {
            if (clazz.isInstance(node)) {
                result.add(clazz.getConstructor(int.class).newInstance(node.getId()));
            }
        }
        return result;
    }

    public static NodeList copy(NodeList original) {
        NodeList copy = new NodeList();
        for (Node node : original.getElements()) {
            copy.addElement(new Node(node.getId()));
        }
        return copy;
    }
}

public class W3CDom {
    public static NodeList selectXpath(String xpath, String html) {
        // Implement XPATH parsing logic here
        // For simplicity, let's assume we have a simple HTML parser
        return NodeList.copy(new NodeList());
    }

    public static List<Node> sourceNodes(NodeList nodeList, Class<Node> clazz) {
        return NodeList.sourceNodes(nodeList, clazz);
    }
}

public class GeneratedTest {

    @Test
    public void testSelectXpath() {
        String html = "<div><p id='para'>Hello</p></div>";
        NodeList result = W3CDom.selectXpath("//div//p[@id='para']", html);
        List<Node> nodes = W3CDom.sourceNodes(result, Node.class);
        for (Node node : nodes) {
            System.out.println(node.getId());
        }
    }

    @Test
    public void testSourceNodes() {
        NodeList nodeList = new NodeList();
        nodeList.addElement(new Node(1));
        nodeList.addElement(new Node(2));
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        for (Node node : result) {
            System.out.println(node.getId());
        }
    }

}