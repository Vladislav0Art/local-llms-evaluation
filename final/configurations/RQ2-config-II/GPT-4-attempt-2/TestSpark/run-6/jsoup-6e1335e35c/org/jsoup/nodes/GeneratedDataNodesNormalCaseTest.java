package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDataNodesNormalCaseTest {

    @Test
    public void dataNodesNormalCaseTest() {
        Element element = new Element("div");
        element.appendChild(new DataNode("data"));
        List<DataNode> dataNodes = element.dataNodes();
        assertEquals(1, dataNodes.size());
        assertEquals("data", dataNodes.get(0).getWholeData());
    }

}