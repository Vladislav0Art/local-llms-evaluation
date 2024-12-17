package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyVal_WithValidKeyValueAndEmptyParamsMap_PutsKeyValueInMap {

    @Mock
    private Connection connection;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void appendKeyVal_WithValidKeyValueAndEmptyParamsMap_PutsKeyValueInMap() {
        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("key1", "value1");
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
        assertEquals(expectedMap, urlBuilder.getParams());
    }

}