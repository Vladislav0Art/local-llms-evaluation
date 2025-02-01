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
public class GeneratedInsertTest {

    @Mock
    private Reader reader;

    @Mock
    private Parser parser;

    @Test
    public void insertTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse(reader, "", parser);
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("test").selfClosing();
        Element element = treeBuilder.insert(startTag);
        Assert.assertEquals("test", element.tagName());
    }

}