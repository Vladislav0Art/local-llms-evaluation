package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSourceNodes_EmptyElementList {

    @Test
    public void sourceNodes_EmptyElementList() {
        NodeList emptyNodeList = Mockito.mock(NodeList.class);
        List<W3CDom> result = W3CDom.sourceNodes(emptyNodeList, String.class);
        assert result.isEmpty();
    }

}