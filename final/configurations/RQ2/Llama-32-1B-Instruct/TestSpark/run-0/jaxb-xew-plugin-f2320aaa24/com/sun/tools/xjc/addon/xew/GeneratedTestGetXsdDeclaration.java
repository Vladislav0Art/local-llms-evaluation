package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import org.junit.Test;

public class GeneratedTestGetXsdDeclaration {

    @Test
    public void testGetXsdDeclaration() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        JAnnotatable jAnnotatable = instance.addAnnotation("example");
        JXmlSchemaDeclaration xmlSchemaDeclaration = (JXmlSchemaDeclaration) getXsdDeclaration(jAnnotatable);
        assertEquals(1, xmlSchemaDeclaration.getNames().size());
    }

}