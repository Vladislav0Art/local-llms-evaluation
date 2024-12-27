package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestOuterHtmlHeadSetsOutputTextWhenChildNodesAreEmpty {

    @Test
    public void testOuterHtmlHeadSetsOutputTextWhenChildNodesAreEmpty() {
        Document document = Jsoup.parse("<html><body>Hello, World!</body></html>");
        LeafNode childNode = new LeafNode("");

        elementOuterHtmlHead(document, 0, document.outputSettings(), childNode, new TextNode("text"));
    }

    private void elementOuterHtmlHead(Document document, int position, OutputSettings outputSettings, LeafNode childNode, TextNode textNode) {
        if (outputSettings.isAppendChildNodesToOutputText()) {
            textNode.outerHtmlHead(document, 0, outputSettings);
        }

        // Add child node here
    }

    private void elementOuterHtmlTail(Document document, int position, OutputSettings outputSettings, LeafNode childNode, TextNode textNode) {
        if (!outputSettings.isAppendChildNodesToOutputText()) {
            textNode.outerHtmlTail(document, 0, outputSettings);
        }

        // Add child node here
    }

    public static class LeafNode {
        private String value;

        public LeafNode(String value) {
            this.value = value;
        }

        public void setChildValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "LeafNode{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }

    public static class OutputSettings {
        private boolean appendChildNodesToOutputText;

        public OutputSettings setAppendChildNodesToOutputText(boolean appendChildNodesToOutputText) {
            this.appendChildNodesToOutputText = appendChildNodesToOutputText;
            return this;
        }
    }

}