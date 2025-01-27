package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseReaderDoctypeTest {

    @Mock
    private TreeBuilder treeBuilderMock;

    public XmlTreeBuilder testInstance() {
        return new XmlTreeBuilder(treeBuilderMock);
    }

    @Test
    public void parseReaderDoctypeTest() throws IOException {
        Reader reader = new StringReader("<?xml version=\"1.0\"?><!DOCTYPE html>");
        Document document = testInstance().parse(reader, "");
        assertEquals("html", document.documentElement.tagName());
    }

}