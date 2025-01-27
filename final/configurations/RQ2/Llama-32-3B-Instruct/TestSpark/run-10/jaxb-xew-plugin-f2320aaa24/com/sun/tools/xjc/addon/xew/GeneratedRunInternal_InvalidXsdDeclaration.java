package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedRunInternal_InvalidXsdDeclaration {

    @Test
    public void runInternal_InvalidXsdDeclaration() throws ClassNotFoundException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        String xsdDeclaration = "<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" targetNamespace=\"http://example.com\"></xs:schema>";
        XSDeclaration declaration = XsdDeclaration.parse(xsdDeclaration);
        plugin.runInternal(declaration);
    }

}