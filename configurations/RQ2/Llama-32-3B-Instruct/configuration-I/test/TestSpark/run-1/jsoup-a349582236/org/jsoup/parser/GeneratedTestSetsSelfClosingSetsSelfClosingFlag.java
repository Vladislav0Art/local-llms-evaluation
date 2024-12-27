package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTestSetsSelfClosingSetsSelfClosingFlag {

    @Test
    public void testSetsSelfClosingSetsSelfClosingFlag() {
        Tag tag1 = new Tag();
        Tag expected = new Tag();
        org.junit.Assert.assertTrue(Tag.setSelfClosing(tag1).equals(expected));
    }

}