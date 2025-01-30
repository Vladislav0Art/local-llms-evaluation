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

public class GeneratedAddAllAttributesTest {

    @Test
    public void addAllAttributesTest() {
        Attributes srcAttributes = new Attributes();
        srcAttributes.put("srcKey", "srcValue");

        Attributes destAttributes = new Attributes();
        destAttributes.put("destKey", "destValue");

        destAttributes.addAll(srcAttributes);

        assertThat(destAttributes.hasKey("srcKey"), is(true));
        assertThat(destAttributes.hasKey("destKey"), is(true));
        assertThat(destAttributes.get("srcKey"), is("srcValue"));
        assertThat(destAttributes.get("destKey"), is("destValue"));
    }

}