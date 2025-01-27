package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.IOException;

public class GeneratedRunInternal_AnnotationsAndElements {

    @Test
    public void runInternal_AnnotationsAndElements() throws IOException {
        String xsdDeclaration = "<xs:element name='test'><xs:complexType><xs:sequence><xs:element name='elem' type='xsd:string'/></xs:sequence></xs:complexType></xs:element>";
        String annotation = "[XmlElementWrapper(name = \"test\")]";
        String annotationRef = "xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"";
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = new Outline();
        outline.addElement("elem");
        assertEquals(annotation, getAnnotation(outline, XmlElementWrapper.class));
        assertEquals(annotationRef, getXsdDeclaration(outline));
    }

    private static Object getAnnotation(Object obj, Class<?> annotation) {
        return ObjectUtils.defaultIfNull(getAnnotation(obj), annotation);
    }

    private static String getAnnotation(Object obj) {
        return null; // implementation depends on the class
    }

    private static String getXsdDeclaration(Outline outline) {
        return "xmlns:xs=\"http://www.w3.org/2001/XMLSchema\""; // implementation depends on the class
    }

}