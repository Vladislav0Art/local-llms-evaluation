package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedAsStringWithEmptyMapReturnsCorrectResult {

    @Test
    public void asStringWithEmptyMapReturnsCorrectResult() {
        String result = W3CDom.asString(new Document(), new HashMap<>());
        assertNotNull(result);
    }

}