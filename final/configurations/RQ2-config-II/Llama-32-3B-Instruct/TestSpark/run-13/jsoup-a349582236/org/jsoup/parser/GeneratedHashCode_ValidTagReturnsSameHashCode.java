package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedHashCode_ValidTagReturnsSameHashCode {

    @Mock
    private ParseSettings settings;

    @Mock
    private String tagName;

    @Test
    public void hashCode_ValidTagReturnsSameHashCode() {
        Tag tag1 = new Tag(settings);
        Tag tag2 = new Tag(settings);
        assertEquals(tag1.hashCode(), tag2.hashCode());
    }

}