package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        JsdslComment comment = new JsdslComment("#comment");
        Comment cloned = (Comment) comment.clone();
        assertEquals(comment, cloned);
    }

}