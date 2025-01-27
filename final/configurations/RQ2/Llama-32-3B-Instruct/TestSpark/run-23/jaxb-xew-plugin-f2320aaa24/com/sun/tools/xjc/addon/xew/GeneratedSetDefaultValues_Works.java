package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSetDefaultValues_Works {

    @Test
    public void setDefaultValues_Works() throws Exception {
        XmlElementWrapperPluginOptions options = new XmlElementWrapperPluginOptions();
        options.setDefaultValues();
        assertEquals("defaultValue", options.getDefaultValue());
    }

}