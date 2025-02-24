package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValNullTest {

    @Test
    public void appendKeyValNullTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://valid.com"));
        assertNull(urlBuilder.appendKeyVal(null));
    }

}