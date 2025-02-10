package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratedCheckNotNull_NullValue_ReturnsEmptyString {

    @Test
    public void checkNotNull_NullValue_ReturnsEmptyString() {
        assertEquals(Attributes.checkNotNull(null), "");
    }

}