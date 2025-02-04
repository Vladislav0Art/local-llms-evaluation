package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedSplitText_atOffset_afterBlank_shouldKeepBlankAsWhole {

    public Node createTextNode(String text) {
        Document doc = new Document();
        Element parent = doc.createElement("root");
        doc.appendChild(parent);
        return doc.body().append(text).firstChild();
    }

    @Test
    public void splitText_atOffset_afterBlank_shouldKeepBlankAsWhole() {
        String text = "   ";
        int offset = 1;
        ArrayList<TextNode> nodes = new ArrayList<>();
        TextNode parent = createTextNode(text);
        TextNode node1 = createTextNode("");
        parent.appendChild(node1);
        TextNode node2 = createTextNode(text.substring(offset));
        parent.appendChild(node2);

        TextNode result = parent.splitText(offset);
        assertEquals(0, result.text().length());
    }

}