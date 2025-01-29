package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.NodeResult;

public class GeneratedClone_test {

    @Test
    public void clone_test() {
        // Arrange
        String text = "Hello World";
        TextNode node = new TextNode(text);

        // Act
        TextNode clonedNode = new TextNode(node.clone());

        // Assert
        assertEquals(node, clonedNode);
    }

    private static Node createTextNode(String text) {
        Document document = new Document();
        Appendable accum = document.appendNode(new TextNode(text));
        return nodeResult -> new TextNode(text).setWholeText(nodeResult.getWholeText());
    }

    private String getOuterHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        StringBuilder result = new StringBuilder("  ");
        while (depth > 0) {
            result.append("<").append(getOuterHtmlTail(accum, depth - 1, out)).append("\n");
            if (depth > 1) {
                result.append("</").append(getOuterHtmlHead(accum, depth - 2, out)).append(">\n");
            }
        }
        return result.toString();
    }

    private String getOuterHtmlTail(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        StringBuilder result = new StringBuilder("\n");
        while (depth > 0) {
            if (depth == 1) {
                result.append("  <").append(getHead(accum)).append("</head>");
            } else {
                result.append("  <").append(getTail(accum, depth - 2, out)).append("</body>\n");
            }
        }
        return result.toString();
    }

    private String getHead(Appendable accum) throws IOException {
        Appendable firstNode = null;
        while (accum != null && !accum.isEmpty()) {
            if (firstNode == null || firstNode.getWholeText().isEmpty()) {
                firstNode = new TextNode(accum.nextLine());
            } else {
                break;
            }
        }

        return firstNode != null ? "<!" + firstNode.nodeName() + ">" : "";
    }

    private String getTail(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        StringBuilder result = new StringBuilder();
        while (accum != null && !accum.isEmpty()) {
            if (depth == 1) {
                result.append("<").append(accum.nextLine()).append("</head>");
            } else {
                result.append("  <").append(accum.nextLine()).append("</body>\n");
            }
        }

        return result.toString();
    }

}