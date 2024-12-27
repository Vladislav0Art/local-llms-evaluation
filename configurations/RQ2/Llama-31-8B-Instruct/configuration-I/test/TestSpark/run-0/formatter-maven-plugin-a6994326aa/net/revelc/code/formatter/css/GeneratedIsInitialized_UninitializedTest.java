package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsInitialized_UninitializedTest {

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void isInitialized_UninitializedTest() {
        assertFalse(formatter.isInitialized());
    }

}