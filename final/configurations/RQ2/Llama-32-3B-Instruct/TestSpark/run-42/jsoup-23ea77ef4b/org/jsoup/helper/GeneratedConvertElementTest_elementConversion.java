package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertElementTest_elementConversion {

    @Test
    public void convertElementTest_elementConversion() {
        org.jsoup.nodes.Element in = new org.jsoup.nodes.Element();
        Document out = W3CDom.convert(in, null);
        assertNotNull(out);
    }

}