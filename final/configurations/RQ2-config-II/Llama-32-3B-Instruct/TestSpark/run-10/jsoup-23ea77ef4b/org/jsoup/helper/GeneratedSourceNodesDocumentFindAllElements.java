package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSourceNodesDocumentFindAllElements {

    @Mock
    private Document document;

    @Mock
    private Properties properties;

    @Test
    public void sourceNodesDocumentFindAllElements() {
        Document inDoc = document;
        List<Document> nodeList = Mockito.mock(List.class);
        when(inDoc.getElementsByTagName(Mockito.anyString())).thenReturn(nodeList);
        List<Document> result = W3CDom.sourceNodes(Mockito.any(NodeList.class), Mockito.any(Class.class));
        assertNotNull(result);
        assertEquals(nodeList, result);
    }

}