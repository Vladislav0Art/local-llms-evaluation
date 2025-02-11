package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsInitialized_ReturnsTrueWhenFormatterIsNotNull {

    @Test
    public void isInitialized_ReturnsTrueWhenFormatterIsNotNull() {
        var formatter = new CssFormatter();
        assertTrue(formatter.isInitialized());
    }
}

}