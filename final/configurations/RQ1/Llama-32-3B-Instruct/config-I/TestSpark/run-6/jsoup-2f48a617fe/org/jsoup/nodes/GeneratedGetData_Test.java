package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class GeneratedGetData_Test {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getData_Test() {
        Comment comment = new Comment("Hello World");
        assertEquals("Hello World", comment.getData());
    }

}