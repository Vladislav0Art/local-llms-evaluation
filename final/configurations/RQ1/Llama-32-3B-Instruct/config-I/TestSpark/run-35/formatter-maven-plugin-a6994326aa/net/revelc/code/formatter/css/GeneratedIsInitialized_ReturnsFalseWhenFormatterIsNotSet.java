package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.Map;

public class GeneratedIsInitialized_ReturnsFalseWhenFormatterIsNotSet {

    @Test
    public void isInitialized_ReturnsFalseWhenFormatterIsNotSet() {
        // given

        // when
        boolean initialized = cssFormatter.isInitialized();

        // then
        assertFalse(initialized);
    }

}