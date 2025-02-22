package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GeneratedHashCodeMethodShouldReturnSameHashCodeForEqualObjects {

    @Test
    public void hashCodeMethodShouldReturnSameHashCodeForEqualObjects() {
        Tag tag1 = new Tag("tag");
        Tag tag2 = new Tag("tag");

        assertEquals(tag1.hashCode(), tag2.hashCode());
    }

}