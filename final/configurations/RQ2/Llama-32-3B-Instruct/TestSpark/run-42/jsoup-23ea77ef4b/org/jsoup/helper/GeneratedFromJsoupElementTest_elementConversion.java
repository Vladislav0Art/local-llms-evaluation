package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFromJsoupElementTest_elementConversion {

    @Test
    public void fromJsoupElementTest_elementConversion() {
        org.jsoup.nodes.Element in = new org.jsoup.nodes.Element();
        Document out = W3CDom.fromJsoup(in);
        assertNotNull(out);
    }

}