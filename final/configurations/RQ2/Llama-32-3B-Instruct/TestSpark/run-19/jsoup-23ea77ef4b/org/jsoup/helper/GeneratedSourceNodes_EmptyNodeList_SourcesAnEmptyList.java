package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GeneratedSourceNodes_EmptyNodeList_SourcesAnEmptyList {

    @Test
    public void sourceNodes_EmptyNodeList_SourcesAnEmptyList() {
        NodeList nodeList = new ArrayList<>();
        List<Node> result = W3CDom.sourceNodes(nodeList, Document.class);
        assertTrue(result.isEmpty());
    }

}