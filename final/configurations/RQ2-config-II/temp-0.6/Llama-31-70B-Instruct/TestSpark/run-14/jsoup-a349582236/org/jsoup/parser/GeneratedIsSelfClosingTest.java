package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedIsSelfClosingTest {

    Tag tag = new Tag();

    @Test
    public void isSelfClosingTest() {
        assertFalse(tag.isSelfClosing());
    }

}