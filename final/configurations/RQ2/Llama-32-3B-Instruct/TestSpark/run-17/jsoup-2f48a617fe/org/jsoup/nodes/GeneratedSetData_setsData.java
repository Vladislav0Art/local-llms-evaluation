package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetData_setsData {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private Parser parser;

    @Test
    public void setData_setsData() {
        Comment comment = Comment.create("");
        when(accum.append(anyString())).thenAnswer(inv -> inv);
        comment.setData("data");
        assertTrue(accum.appendCalledWith("data"));
    }

}