package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedHashCode_EmptyReturnsZero {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void hashCode_EmptyReturnsZero() {
        setup();
        when(parseSettings.getNameSensitivity()).thenReturn(true);
        assertEquals(0, tag.hashCode());
    }
}

public class Tag {

    private String name;
    private boolean selfClosing;

    public static final int UNKNOWN = -1;

    public Tag(String name) {
        this.name = name;
    }

    public Tag clone() {
        return new Tag(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tag tag = (Tag) o;

        return selfClosing == tag.selfClosing;
    }

    @Override
    public int hashCode() {
        return selfClosing ? 1 : 0;
    }

}