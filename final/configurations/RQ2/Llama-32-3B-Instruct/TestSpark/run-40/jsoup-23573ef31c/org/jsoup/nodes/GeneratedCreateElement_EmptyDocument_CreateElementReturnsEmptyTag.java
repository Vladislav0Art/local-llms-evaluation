package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateElement_EmptyDocument_CreateElementReturnsEmptyTag {

    @Mock
    private Element element;

    @Test
    public void createElement_EmptyDocument_CreateElementReturnsEmptyTag() {
        Document document = new Document("");
        Element tag = document.createElement("");
        assertNotNull(tag);
        assertEquals("", tag.tagName());
    }

}