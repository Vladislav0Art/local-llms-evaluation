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
public class GeneratedParseFragmentTest {

    @Mock
    private Reader reader;

    @Mock
    private Parser parser;

    @Test
    public void parseFragmentTest() throws Exception {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse(reader, "", parser);
        List<Node> nodes = treeBuilder.parseFragment("<test>content</test>", "", parser);
        Assert.assertEquals(1, nodes.size());
    }

}