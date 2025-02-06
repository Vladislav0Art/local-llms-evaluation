package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class GeneratedFromJsoup convertsElement {

    @Test
    public void fromJsoup

    convertsElement() {
        org.jsoup.nodes.Element inElem = new org.jsoup.nodes.Element();
        Document outDoc = W3CDom.fromJsoup(inElem);
        assertNotNull(outDoc);
    }

}