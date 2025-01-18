package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.junit.Test;
import org.w3c.dom.Document;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedFromJsoupElementInTest {

    @Test
    public void fromJsoupElementInTest() throws Exception {
        W3CDom object = new W3CDom();
        org.jsoup.nodes.Element in = Jsoup.parse("<div></div>").body().child(0);
        Document out = object.fromJsoup(in);
        assertNotNull(out);
        assertEquals("div", out.getDocumentElement().getTagName());
    }

}