package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedIsParamAddedFailed_ReturnsTrueWhenParamWasNotAdded {

    @Mock
    private Connection connection;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void isParamAddedFailed_ReturnsTrueWhenParamWasNotAdded() {
        boolean expected = true;
        when(connection.isParamAdded()).thenReturn(false);
        assertTrue(urlBuilder.isParamAddedFailed());
    }

}