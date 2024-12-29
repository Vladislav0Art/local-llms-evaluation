package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.DataNode;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.NodeFilter;
import org.jsoup.nodes.Tag;
import org.jsoup.parser.ParseSettings;
import org.jsoup.helper.Consumer;
import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.helper.Validate;
import org.jsoup.internal.NonnullByDefault;
import org.jsoup.internal.StringUtil;
import org.jsoup.internal.Normalizer;
import org.jsoup.select.Collector;
import org.jsoup.select.QueryParser;
import org.jsoup.select.Selector;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(org.junit.runners.Parameterized.class)
public class GeneratedTestHasAttributes {

    @Test
    public void testHasAttributes() {
        Element element = new Element(Tag.valueOf("div"));
        assertFalse(element.hasAttributes());
    }

}