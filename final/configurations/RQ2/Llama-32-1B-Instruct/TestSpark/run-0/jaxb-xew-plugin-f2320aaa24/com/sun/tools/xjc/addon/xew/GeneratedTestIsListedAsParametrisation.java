package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import org.junit.Test;

public class GeneratedTestIsListedAsParametrisation {

    @Test
    public void testIsListedAsParametrisation() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        JClass jClass = instance.addClass("example", "java.lang.String");
        boolean listedAsParametrization = isListedAsParametrization(jClass);
        assertEquals(true, listedAsParametrization);
    }

}