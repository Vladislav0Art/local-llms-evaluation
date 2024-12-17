package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;

import java.io.ByteArrayBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

public class GeneratedSplitTextOffsetLessThanZeroThrowException[]

Test {

    @Test
    public void splitTextOffsetLessThanZeroThrowException[] Test() {
        try {
            new TextNode("hello").splitText(-1);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            assertEquals("Split offset must be not be negative", e.getMessage());
        }
    }

}