package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.junit.Assert.assertThat;

public class GeneratedHtmlAttributeTest {

    @Test
    public void htmlAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String html = attributes.html();
        assertThat(html, is("key=\"value\""));
    }

}