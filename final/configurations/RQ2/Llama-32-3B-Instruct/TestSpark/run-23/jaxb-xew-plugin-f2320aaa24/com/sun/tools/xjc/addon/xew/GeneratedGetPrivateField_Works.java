package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetPrivateField_Works {

    @Test
    public void getPrivateField_Works() throws Exception {
        String field = "field";
        Object value = "value";
        assertEquals(value, XmlElementWrapperPluginUtils.getPrivateField(field, value));
    }

}