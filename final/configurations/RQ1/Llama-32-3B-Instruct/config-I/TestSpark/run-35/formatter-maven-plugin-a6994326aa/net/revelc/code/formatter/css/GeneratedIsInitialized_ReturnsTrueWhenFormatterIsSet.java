package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.Map;

public class GeneratedIsInitialized_ReturnsTrueWhenFormatterIsSet {

    @Test
    public void isInitialized_ReturnsTrueWhenFormatterIsSet() {
        // given
        cssFormatter.setFormatter(new CSSFormat());

        // when
        boolean initialized = cssFormatter.isInitialized();

        // then
        assertTrue(initialized);
    }

}