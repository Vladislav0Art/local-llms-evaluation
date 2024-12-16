package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsEmpty_ReturnsTrue_ForEmptyTags {

    @Test
    public void isEmpty_ReturnsTrue_ForEmptyTags() {
        Tag tag = new Tag("img");
        assertTrue(tag.isEmpty());
    }

}