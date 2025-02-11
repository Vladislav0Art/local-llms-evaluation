package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.TextNode;

import java.io.Reader;
import java.util.List;

public class GeneratedInsertNode_CallsOnNodeInserted {

    @Test
    public void insertNode_CallsOnNodeInserted() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Tag tag = new Tag("tag", null, null);
        final Node node = new Node(tag);
        Tag elementTag = new Tag("element");
        assertEquals(0, TagCounters.get(tag));
        builder.insert(elementTag);
        assertEquals(1, TagCounters.get(tag));
    }

}