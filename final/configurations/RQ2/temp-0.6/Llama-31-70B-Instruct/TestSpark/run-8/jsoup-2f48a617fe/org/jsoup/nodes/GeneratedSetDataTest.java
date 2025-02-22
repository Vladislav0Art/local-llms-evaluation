package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetDataTest {

    @Mock
    private Document.OutputSettings outputSettings;
    @Mock
    private Parser parser;

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Hello, World!");
        comment.setData("Goodbye, World!");
        assertEquals("Goodbye, World!", comment.getData());
    }

}