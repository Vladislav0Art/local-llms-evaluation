package net.revelc.code.formatter.css;

import net.revelc.code.formatter.css.CssFormatter;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

import net.revelc.code.formatter.LineEnding;

public class GeneratedIsInitializedTest {

    private CssFormatter cssFormatter;

    @Test
    public void isInitializedTest() {
        Assertions.assertTrue(cssFormatter.isInitialized());
    }

}