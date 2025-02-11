package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedBuildFormatter_ValidOptions_ReturnsFormattedInstance {

    @Test
    public void buildFormatter_ValidOptions_ReturnsFormattedInstance() {
        var builder = new CssFormatterBuilder();
        var formatter = builder.build(new Map.of("indent", "4"));
        assertNotNull(formatter);
    }

}