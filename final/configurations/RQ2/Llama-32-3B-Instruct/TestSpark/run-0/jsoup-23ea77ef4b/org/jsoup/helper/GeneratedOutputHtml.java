package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.BeforeEach;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOutputHtml {

    @Mock
    private Document mockDocument;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void OutputHtml() {
        HashMap<String, String> expected = W3CDom.OutputHtml();
        assertNotNull(expected);
    }

}