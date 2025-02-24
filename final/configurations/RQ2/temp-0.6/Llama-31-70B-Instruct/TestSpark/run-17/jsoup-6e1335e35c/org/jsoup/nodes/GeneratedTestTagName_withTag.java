package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestTagName_withTag {

    private Element element;

    @Before
    public void setUp() {
        element = new Element("tag");
    }

    @Test
    public void testTagName_withTag() {
        element.tagName("newTag");
        assertEquals("newTag", element.tagName());
    }

}