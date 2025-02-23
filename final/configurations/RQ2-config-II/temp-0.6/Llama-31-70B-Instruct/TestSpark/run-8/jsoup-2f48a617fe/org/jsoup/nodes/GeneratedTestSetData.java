package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class GeneratedTestSetData {

    @Mock
    private String data;
    private Comment comment;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        comment = new Comment(data);
    }

    @Test
    public void testSetData() {
        String newData = "new data";
        comment.setData(newData);
        String actual = comment.getData();
        String expected = newData;
        assertEquals(expected, actual);
    }

}