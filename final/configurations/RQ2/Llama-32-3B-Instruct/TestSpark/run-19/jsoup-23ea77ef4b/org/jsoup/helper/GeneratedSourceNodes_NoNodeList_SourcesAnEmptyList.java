package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GeneratedSourceNodes_NoNodeList_SourcesAnEmptyList {

    @Test
    public void sourceNodes_NoNodeList_SourcesAnEmptyList() {
        NodeList nodeList = null;
        List<Node> result = W3CDom.sourceNodes(nodeList, Document.class);
        assertTrue(result.isEmpty());
    }

}