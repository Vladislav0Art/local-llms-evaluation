package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSetPrivateField_Works {

    @Test
    public void setPrivateField_Works() throws Exception {
        String field = "field";
        Object value = "value";
        XmlElementWrapperPluginUtils.setPrivateField(field, value);
        assertEquals(value, XmlElementWrapperPluginUtils.getPrivateField(field));
    }
}

}