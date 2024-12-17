package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal_KeysAndValuesAreAdded {

    @Mock
    private Connection.KeyVal kv;

    private final UrlBuilder urlBuilder = new UrlBuilder("https://example.com");

    @Test
    public void appendKeyVal_KeysAndValuesAreAdded() {
        // Arrange
        when(kv.getKey()).thenReturn("key1");
        when(kv.getValue()).thenReturn("value1");

        // Act and Assert
        doNothing().when(kv).getKey();
        doNothing().when(kv).getValue();

        urlBuilder.appendKeyVal(kv);
        verifyNoMoreInteractions(kv);
    }

}