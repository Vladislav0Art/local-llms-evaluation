package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetDataTest {

    @Mock
    private Parser parserMock;

    @Mock
    private ParseSettings parseSettingsMock;

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Test");
        comment.setData("NewTest");
        assertEquals("NewTest", comment.getData());
    }

}