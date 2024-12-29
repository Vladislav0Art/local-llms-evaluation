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
public class GeneratedAddAddsNewAttribute {

    @Mock
    private Attribute attribute;

    @Mock
    private Document document;

    @Test
    public void addAddsNewAttribute() {
        Attributes attributes = new Attributes();
        String result = add("new-key", "new-value");
        assertSame(result, "new-value");
        assertEquals(1, attributes.size());
    }

}