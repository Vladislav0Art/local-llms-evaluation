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
public class GeneratedLocation_EmptyDocument_LocationReturnsEmptyString {

    @Mock
    private Element element;

    @Test
    public void location_EmptyDocument_LocationReturnsEmptyString() {
        Document document = new Document("");
        assertEquals("", document.location());
    }

}