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
public class GeneratedFromJsoup_ConvertsDocument {

    @Mock
    private Document mockDocument;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void fromJsoup_ConvertsDocument() {
        Document expected = mockDocument;
        Document actual = W3CDom.fromJsoup(mockDocument);
        assertEquals(expected, actual);
    }

}