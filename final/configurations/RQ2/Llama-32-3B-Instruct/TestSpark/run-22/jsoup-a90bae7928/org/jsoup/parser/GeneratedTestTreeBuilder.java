package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestTreeBuilder {

    @Test
    public void testTreeBuilder() {
        TreeBuilder treeBuilder = new TreeBuilder();
        Element rootElement = treeBuilder.insert("root").buildElement();
        assertEquals("root", rootElement.getStartTag());

        Element childElement1 = treeBuilder.insert("child1").insert("grandchild1").buildElement();
        assertEquals("child1", childElement1.getStartTag());

        Element childElement2 = treeBuilder.insert("child2").insert("grandchild2").buildElement();
        assertEquals("child2", childElement2.getStartTag());
    }
}

public class TreeBuilder {

    private StringBuilder output;

    public TreeBuilder() {
        this.output = new StringBuilder();
    }

    public Element insert(String tag) {
        output.append("<").append(tag).append(">").append("\n");
        return new StartTag(this);
    }

    public Element buildElement() {
        return new Element(output.toString());
    }
}

public class StartTag extends Element {

    private TreeBuilder treeBuilder;

    public StartTag(TreeBuilder treeBuilder) {
        this.treeBuilder = treeBuilder;
    }

    @Override
    public String getStartTag() {
        return "<" + super.getStartTag();
    }
}

public class Element {

    private String startTag;
    private StringBuilder content;

    public Element(String content) {
        this.content = new StringBuilder(content);
        this.startTag = "<" + content.toString().split(">")[0] + ">";
    }

    @Override
    public String getStartTag() {
        return startTag;
    }
}

}