package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedPropertiesFromMap_WorksCorrectly {

    @Test
    public void propertiesFromMap_WorksCorrectly() {
        Map<String, String> map = new HashMap<>();
        map.put("attr1", "val1");
        Properties result = W3CDom.propertiesFromMap(map);
        assert result != null;
    }

}