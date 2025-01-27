package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTestAppendKeyVal_NullUrl_ThrowsNullPointerException {

    @Mock
    private String url;

    @Mock
    private Map<String, String> kv = new HashMap<>();

    @org.mockito.Capture
    private String encodedKey;

    @org.mockito.Capture
    private String encodedValue;

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("GeneratedTest");
    }

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAppendKeyVal_NullUrl_ThrowsNullPointerException() {
        Url url = new Url(null, kv);
        assertThrows(NullPointerException.class, () -> url.appendKeyValue(encodedKey, encodedValue));
    }

}