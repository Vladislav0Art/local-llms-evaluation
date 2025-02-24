package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.ParseSettings;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckNotNullTest {

    private Attributes attributes;

    @Before
    public void setUp() {
        attributes = Mockito.mock(Attributes.class);
    }

    @Test
    public void checkNotNullTest() {
        String value = Mockito.when(Attributes.checkNotNull("val")).thenReturn("val");
        assert value.equals("val");
    }

}