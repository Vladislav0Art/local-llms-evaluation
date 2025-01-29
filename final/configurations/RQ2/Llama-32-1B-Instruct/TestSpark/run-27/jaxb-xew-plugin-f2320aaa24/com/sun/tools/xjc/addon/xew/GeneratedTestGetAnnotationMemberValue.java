package com.sun.tools.xjc.addon.xew;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetAnnotationMemberValue {

    @Test
    public void testGetAnnotationMemberValue() {
        JAnnotatable annot = new JAnnotatable();
        assertEquals(new QName("xs:element"), copyAnnotationMemberValue(annot, "name"));
    }

}