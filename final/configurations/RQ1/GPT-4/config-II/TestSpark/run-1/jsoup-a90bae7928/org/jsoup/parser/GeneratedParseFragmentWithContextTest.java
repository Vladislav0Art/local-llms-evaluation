package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.Reader;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseFragmentWithContextTest {

    @Mock
    private Reader reader;

    @Mock
    private Parser parser;

    @Test
    public void parseFragmentWithContextTest() throws Exception {
        Element context = new Element(Tag.valueOf("test"), "test");
        when(parser.parseFragment(any(), any(), any())).thenReturn(null);
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse(reader, "", parser);
        Assert.assertNull(treeBuilder.parseFragment("<test>content</test>", context, "", parser));
    }

}