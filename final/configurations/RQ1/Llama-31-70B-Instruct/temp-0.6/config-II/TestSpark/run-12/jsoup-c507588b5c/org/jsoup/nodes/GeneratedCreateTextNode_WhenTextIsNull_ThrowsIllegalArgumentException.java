package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCreateTextNode_WhenTextIsNull_ThrowsIllegalArgumentException {

    @Test
    public void createTextNode_WhenTextIsNull_ThrowsIllegalArgumentException() {
        try {
            new TextNode(null);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            return;
        }
        assertTrue(false);
    }

}