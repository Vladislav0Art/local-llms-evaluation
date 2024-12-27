package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedShallowClone_ShallowCloneElement {

    @Test
    public void shallowClone_ShallowCloneElement() {
        Element element = new Element();
        Element cloned = element.shallowClone();
        assertNotNull(cloned);
    }

}