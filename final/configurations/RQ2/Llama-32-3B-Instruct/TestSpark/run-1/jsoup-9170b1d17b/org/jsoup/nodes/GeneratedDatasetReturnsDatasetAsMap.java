package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.Validate.notNull;
import static org.jsoup.internal.Normalizer.lowerCase;
import static org.jsoup.nodes.Attributes.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDatasetReturnsDatasetAsMap {

    @Mock
    private Attribute attribute;

    @Mock
    private Document document;

    @Test
    public void datasetReturnsDatasetAsMap() {
        Attributes attributes = new Attributes();
        attribute.setKey("key");
        attributes.put("key2", "value2");
        Map<String, String> map = attributes.dataset();
        assertEquals(1, map.size());
    }

}