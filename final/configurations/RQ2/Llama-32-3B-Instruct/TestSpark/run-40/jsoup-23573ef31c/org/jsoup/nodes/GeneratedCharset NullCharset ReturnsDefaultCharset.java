package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCharset NullCharset ReturnsDefaultCharset {

    @Mock
    private Element element;

    @Mock
    private Tag tag;

    @Mock
    private String content;

    @Test
    public void charset

    NullCharset ReturnsDefaultCharset() {
        when(element.charset(any())).thenReturn(DataUtil.DEFAULT.charset());
        Document document = new Document();
        assertEquals(DataUtil.DEFAULT.charset(), document.charset());
    }

}