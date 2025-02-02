package org.jsoup.helper;

public class GeneratedTest {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

public class Element extends DOMNode {
    private String tagName;
    private Map<String, String> namespaces;

    public Element(String data, String tagName) {
        super(data);
        this.tagName = tagName;
        this.namespaces = new HashMap<>();
    }

    public void addNamespace(String prefix, String namespace) {
        this.namespaces.put(prefix, namespace);
    }

    public Map<String, String> getNamespaces() {
        return namespaces;
    }
}

public class Text extends DOMNode {
}

public class Comment extends DOMNode {
}

public class DataNode extends DOMNode {
}

public class Attribute {
    private String key;
    private String value;

    public Attribute(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

public interface DOMException extends Exception {
}

public class DOMBuilder {
    private Element root;

    public DOMBuilder(Element root) {
        this.root = root;
    }

    public Element build() {
        return root;
    }
}

public class TestDOMBuilder {

}