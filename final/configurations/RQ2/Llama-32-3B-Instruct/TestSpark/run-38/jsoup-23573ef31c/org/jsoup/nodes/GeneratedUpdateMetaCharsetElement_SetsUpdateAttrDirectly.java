package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedUpdateMetaCharsetElement_SetsUpdateAttrDirectly {

    @Test
    public void updateMetaCharsetElement_SetsUpdateAttrDirectly() {
        boolean update = true;
        Document document = new Document("");
        document.updateMetaCharsetElement(update);
        assertTrue(document.hasAttribute("update-meta-charset"));
    }

}