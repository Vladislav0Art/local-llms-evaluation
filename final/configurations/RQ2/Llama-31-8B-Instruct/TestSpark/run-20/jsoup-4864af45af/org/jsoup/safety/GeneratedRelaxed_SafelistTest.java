package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Entity;
import org.jsoup.nodes.NodeList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.jsoup.nodes.Node.COMMENT;
import static org.jsoup.nodes.Node.DATA;
import static org.jsoup.nodes.Node.DOCUMENT_TYPE;
import static org.jsoup.nodes.Node.ENTITY;
import static org.jsoup.nodes.Node.TEXT;
import static org.jsoup.nodes.Node.ELEMENT;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRelaxed_SafelistTest {

    @Test
    public void relaxed_SafelistTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("script"));
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeTag("a"));
    }

}