package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.jsoup.nodes.Node.NodeType;
import static org.jsoup.nodes.Node.NodeType.COMMENT;
import static org.jsoup.nodes.Node.NodeType.DATA;
import static org.jsoup.nodes.Node.NodeType.DOCUMENT_TYPE;
import static org.jsoup.nodes.Node.NodeType.ENTITY;
import static org.jsoup.nodes.Node.NodeType.TEXT;
import static org.jsoup.nodes.Node.NodeType.ELEMENT;

@RunWith(org.junit.runners.Parameterized.class)
public class GeneratedRemoveTags_RemoveTagsTest {

    @Parameters
    public static Object[][] data() {
        return new Object[][]{
                {Safelist.none()},
                {Safelist.simpleText()},
                {Safelist.basic()},
                {Safelist.basicWithImages()},
                {Safelist.relaxed()}
        };
    }

    public Safelist safelist;

    public SafelistTest(Object[] data) {
        this.safelist = (Safelist) data[0];
    }

    @Test
    public void removeTags_RemoveTagsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("script", "style");
        safelist.removeTags("script");
        assertFalse(safelist.isSafeTag("script"));
        assertTrue(safelist.isSafeTag("style"));
    }

}