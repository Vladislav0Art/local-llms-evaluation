package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.bind.JAXBElement;
import java.util.ArrayList;

public class GeneratedTestRQ2 {

    @Test
    public void testRQ2() {
        // Set up the element
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();

        // Set expected values
        ArrayList<CPropertyInfo> customizations = new ArrayList<>();
        CPropertyInfo[] properties = {new CPropertyInfo(QName.valueOf("test1"), "type", null), new CPropertyInfo(QName.valueOf("test2"), "type", null)};

        // Set expected values for customizations
        customizations.add(new CPropertyInfo(QName.valueOf("customization1"), "type", null));
        customizations.add(new CPropertyInfo(QName.valueOf("customization2"), "type", null));

        // Use and assert plugin
        ArrayList<CPropertyInfo> actualCustomizations = new ArrayList<>();
        actualCustomizations.addAll(customizations);
        assertEquals(actualCustomizations, plugin.getCustomizations());

        XSDeclaration xsdDeclaration = XsdDeclaration.parse(xsdDeclaration);
        assertNotNull(xsdfDeclaration);

        // Clean up
    }
}

class XmlElementWrapperPlugin {
    public ArrayList<CPropertyInfo> getCustomizations() {
        return customizations;
    }

    private ArrayList<CPropertyInfo> customizations = new ArrayList<>();
}

class CPropertyInfo {
    private String name;
    private String type;

    public CPropertyInfo(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPropertyInfo that = (CPropertyInfo) o;
        return name.equals(that.name) && type.equals(that.type);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + type.hashCode();
    }
}

class XSDeclaration {
    private String xsdDeclaration;

    public XSDeclaration(String xsdDeclaration) {
        this.xsdDeclaration = xsdDeclaration;
    }

    public static XSDeclaration parse(String xsdDeclaration) {
        return new XSDeclaration(xsdDeclaration);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XSDeclaration that = (XSDeclaration) o;
        return xsdDeclaration.equals(that.xsdDeclaration);
    }

    @Override
    public int hashCode() {
        return 31 * xsdDeclaration.hashCode();
    }
}

class QName extends JAXBElement<String> {

    public QName(String name, String value) {
        super(name, String.class, value);
    }

    public static QName of(String name, String value) {
        return new QName(name, value);
    }

}