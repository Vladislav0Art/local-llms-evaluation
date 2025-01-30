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

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        List<Attribute> attributeList = attributes.asList();
        assertThat(attributeList, is(not(empty())));
        assertThat(attributeList.get(0).getKey(), is("key"));
        assertThat(attributeList.get(0).getValue(), is("value"));
    }

}