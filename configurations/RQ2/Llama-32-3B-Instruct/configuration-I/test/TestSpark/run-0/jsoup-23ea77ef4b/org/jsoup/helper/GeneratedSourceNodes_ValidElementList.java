package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSourceNodes_ValidElementList {

    @Test
    public void sourceNodes_ValidElementList() {
        NodeList validNodeList = Mockito.mock(NodeList.class);
        List<W3CDom> result = W3CDom.sourceNodes(validNodeList, String.class);
        assert !result.isEmpty();
    }

}