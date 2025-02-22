package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GeneratedCloneMethodShouldCloneObject {

    @Test
    public void cloneMethodShouldCloneObject() {
        Tag tag = new Tag("tag");
        Tag tagClone = tag.clone();

        assertThat(tagClone, is(not(sameInstance(tag))));
    }

}