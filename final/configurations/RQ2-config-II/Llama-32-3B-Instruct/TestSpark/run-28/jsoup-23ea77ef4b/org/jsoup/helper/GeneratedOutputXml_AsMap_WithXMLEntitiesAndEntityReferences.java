package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOutputXml_AsMap_WithXMLEntitiesAndEntityReferences {

    @Mock
    private Document doc;

    @Test
    public void OutputXml_AsMap_WithXMLEntitiesAndEntityReferences() {
        Map<String, String> result = W3CDom.OutputXml();
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.containsKey("&amp;"));
        assertTrue(result.containsKey("&#x27;"));
    }

}