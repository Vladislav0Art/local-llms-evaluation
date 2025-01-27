package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedClonedAttributesInstance {

    @Test
    public void clonedAttributesInstance() {
        Attributes attributes = new Attributes();
        Attributes cloned = attributes.clone();
        assertNotNull(cloned);
        assertEquals(attributes.size(), cloned.size());
    }

}