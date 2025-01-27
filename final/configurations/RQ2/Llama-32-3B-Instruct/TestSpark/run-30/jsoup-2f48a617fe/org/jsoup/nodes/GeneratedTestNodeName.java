package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Appendable;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        Document document = new Document();
        Element element = new Element();
        element.setName("test");
        assertThat(element.getName(), is("test"));
    }

}