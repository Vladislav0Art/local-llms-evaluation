package org.jsoup.nodes;

public class GeneratedTestDocumentOutputSettings {

    @Test
    public void testDocumentOutputSettings() {
        // create output settings
        OutputSettings out = new OutputSettings();
        // assert properties
        assertEquals(0, out.getIndent());
    }
}

public class Node {

    private String cssSelector;
    private int elementSiblingIndex;

    public String getCssSelector() {
        return cssSelector;
    }

    public void setCssSelector(String cssSelector) {
        this.cssSelector = cssSelector;
    }

    public int getElementSiblingIndex() {
        return elementSiblingIndex;
    }

    public void setElementSiblingIndex(int elementSiblingIndex) {
        this.elementSiblingIndex = elementSiblingIndex;
    }
}

public class Element extends Node {

    @Override
    public String html(String html) {
        // implementation
        return "";
    }

    @Override
    public <T extends Appendable> T html(T appendable) {
        // implementation
        return null;
    }

    @Override
    public void setCssSelector(String cssSelector) {
        super.setCssSelector(cssSelector);
    }
}

public class Document {

    private String cssSelector;

    public String getCssSelector() {
        return cssSelector;
    }

    public void setCssSelector(String cssSelector) {
        this.cssSelector = cssSelector;
    }

    public boolean hasText() {
        // implementation
        return false;
    }
}

public class OutputSettings {

    private int indent;

    public int getIndent() {
        return indent;
    }

    public void setIndent(int indent) {
        this.indent = indent;
    }

}