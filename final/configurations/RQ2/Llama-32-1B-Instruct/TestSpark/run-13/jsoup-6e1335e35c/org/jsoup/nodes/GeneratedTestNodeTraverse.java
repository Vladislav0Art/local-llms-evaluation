package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestNodeTraverse {

    @Test
    public void testNodeTraverse() {
        NodeList nodeList = new NodeList();
        nodeList.addElement("Hello");
        nodeList.addElement("World");
        nodeList.addElement("Java");
        Node root = nodeList.root();
        traverse(root, node -> System.out.println(node.text()));
    }
}

class NodeTraversal implements NodeVisitor {
    @Override
    public void visit(Node element) {
        System.out.println(element.text());
    }

    @Override
    public void doTraverse(Node parent, Node currentNode) {
        if (parent == null && currentNode != null) {
            currentNode.visit(currentNode);
        }
    }
}

class NodeList {
    private List<Node> elements = new ArrayList<>();

    public void addElement(String text) {
        elements.add(new Element(text));
    }

    @Override
    public Node root() {
        return elements.get(0);
    }

    @Override
    public void traverse(NodeVisitor nodeVisitor, Consumer<? super Node> action) {
        for (Node element : elements) {
            action.accept(element);
        }
    }

    @Override
    public void forEach(Consumer<? super Element> action) {
        for (Node element : elements) {
            action.accept(element);
        }
    }

    @Override
    public boolean hasText() {
        return !elements.isEmpty();
    }

    private class Element implements Node {
        private String text;

        public Element(String text) {
            this.text = text;
        }

        @Override
        public String text() {
            return text;
        }

        @Override
        public int hashCode() {
            return text.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            Element other = (Element) obj;
            return text.equals(other.text);
        }
    }

}