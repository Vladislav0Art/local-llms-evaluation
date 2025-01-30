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

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws Exception {
        Attributes attr = new Attributes();
        attr.put("key", "value");
        Attributes clone = (Attributes) attr.clone();
        assertThat(clone, is(not(nullValue())));
        assertThat(clone.size(), is(attr.size()));
        assertThat(clone.hasKey("key"), is(true));
    }

}