package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GeneratedEqualsMethodShouldReturnFalseForUnequalObjects {

    @Test
    public void equalsMethodShouldReturnFalseForUnequalObjects() {
        Tag tag1 = new Tag("tag1");
        Tag tag2 = new Tag("tag2");

        assertFalse(tag1.equals(tag2));
    }

}