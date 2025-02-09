package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetName_SomeName_ReturnsName {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void getName_SomeName_ReturnsName() {
        String name = "some";
        Tag tag = new Tag();
        tag.setName(name);
        assertEquals(name, tag.getName());
    }

}