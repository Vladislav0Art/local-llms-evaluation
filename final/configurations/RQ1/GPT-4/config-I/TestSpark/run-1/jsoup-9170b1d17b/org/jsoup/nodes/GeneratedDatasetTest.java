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

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Attributes attr = new Attributes();
        attr.put("data-href", "http://jsoup.org");
        assertThat(attr.dataset().size(), is(1));
        assertThat(attr.dataset().get("href"), is("http://jsoup.org"));
    }

}