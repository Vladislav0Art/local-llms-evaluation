package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
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

import org.jsoup.nodes.NodeType;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddTags_SafelistTest {

    @Test
    public void addTags_SafelistTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p", "img");
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("img"));
    }

}