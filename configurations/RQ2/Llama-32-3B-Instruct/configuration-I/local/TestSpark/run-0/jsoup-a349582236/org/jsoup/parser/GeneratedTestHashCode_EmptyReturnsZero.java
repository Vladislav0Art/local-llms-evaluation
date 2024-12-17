package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestHashCode_EmptyReturnsZero {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testHashCode_EmptyReturnsZero() {
        setup();
        when(parseSettings.getNameSensitivity()).thenReturn(true);
        assertEquals(0, tag.hashCode());
    }
}

public class Tag {

    private String name;

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isSelfClosing() {
        // implementation
        return false;
    }

    public boolean formatAsBlock() {
        // implementation
        return false;
    }

    public String normalName() {
        // implementation
        return "";
    }

}