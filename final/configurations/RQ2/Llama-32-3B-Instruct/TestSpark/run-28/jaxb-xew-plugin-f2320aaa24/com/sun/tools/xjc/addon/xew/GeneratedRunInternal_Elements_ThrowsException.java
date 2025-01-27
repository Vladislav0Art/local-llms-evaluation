package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.IOException;

public class GeneratedRunInternal_Elements_ThrowsException {

    @Test
    public void runInternal_Elements_ThrowsException() throws IOException {
        String xsdDeclaration = "<xs:element name='test'><xs:complexType><xs:sequence><xs:element name='elem' type='xsd:string'/></xs:sequence></xs:complexType></xs:element>";
        String annotation = "[XmlElementWrapper(name = \"test\")]<xs:element name='elem' type='xsd:string'/>";
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = new Outline();
        outline.addElement("elem");
        assertEquals(annotation, getAnnotation(outline, XmlElementWrapper.class));
        try {
            plugin.runInternal(outline);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

}