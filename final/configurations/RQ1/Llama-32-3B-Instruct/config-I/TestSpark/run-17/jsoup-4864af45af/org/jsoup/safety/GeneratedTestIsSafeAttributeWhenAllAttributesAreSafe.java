package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedTestIsSafeAttributeWhenAllAttributesAreSafe {

    private String value;

    public Attribute(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

public class AllNameAttribute extends Attribute {
    public AllNameAttribute(String value) {
        super(value);
    }
}

public class Element {
    private String value;

    public Element(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

public class SafeAttributes {

    public static boolean isSafeAttribute(Class<? extends Attribute> attributeClass, Element element, Attribute attribute) {
        if (attributeClass.isInstance(attribute) && !attribute.getValue().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        AllNameAttribute allNameAttribute = new AllNameAttribute("all");
        Element el = new Element("");
        System.out.println(SafeAttributes.isSafeAttribute(AllNameAttribute.class, el, allNameAttribute));  // prints: true
    }
}

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestSafeAttributes {

    @Test
    public void testIsSafeAttributeWhenAllAttributesAreSafe() {
        AllNameAttribute allNameAttribute = new AllNameAttribute("all");
        Element el = new Element("");
        assertTrue(SafeAttributes.isSafeAttribute(AllNameAttribute.class, el, allNameAttribute));
    }

}