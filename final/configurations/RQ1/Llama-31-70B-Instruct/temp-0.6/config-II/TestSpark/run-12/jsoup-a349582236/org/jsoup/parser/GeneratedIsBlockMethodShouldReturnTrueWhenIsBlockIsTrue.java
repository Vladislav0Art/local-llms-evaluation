package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GeneratedIsBlockMethodShouldReturnTrueWhenIsBlockIsTrue {

    @Test
    public void isBlockMethodShouldReturnTrueWhenIsBlockIsTrue() {
        Tag tag = new Tag("tag");
        tag.isBlock = true;

        assertTrue(tag.isBlock());
    }

}