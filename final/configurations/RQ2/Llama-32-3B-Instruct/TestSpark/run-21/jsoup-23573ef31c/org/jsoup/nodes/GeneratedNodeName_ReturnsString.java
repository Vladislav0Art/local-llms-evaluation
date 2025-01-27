package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedNodeName_ReturnsString {

    @Mock
    private Connection connection;

    @Test
    public void nodeName_ReturnsString() {
        String name = "html";
        Document document = new Document("baseUri", connection);
        document.nodeName(name);
        assertThat(document.nodeName(), is(name));
    }

}