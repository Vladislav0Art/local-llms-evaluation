package org.jsoup.nodes;

public class GeneratedTest {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

public class TextNode extends Node {
    @Override
    public boolean isBlank() {
        return value.isEmpty();
    }

    public void splitText(int index, Node resultTextNode1) {
        if (index > 0 && !value.substring(0, index).isEmpty()) {
            resultTextNode1.setValue(value.substring(0, index));
            this.value = value.substring(index);
        }
    }

    @Override
    public String toString() {
        return "Text Node with Value: " + value;
    }
}

public class TestSpark {

}