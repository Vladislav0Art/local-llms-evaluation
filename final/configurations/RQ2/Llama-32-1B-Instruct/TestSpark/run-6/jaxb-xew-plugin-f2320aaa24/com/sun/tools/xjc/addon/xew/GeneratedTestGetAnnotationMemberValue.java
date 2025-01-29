package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotationMemberValue {

    @Test
    public void testGetAnnotationMemberValue() {
        JAnnotatable annotatable = XmlElementWrapper.class;
        QName qname = new QName("http://example.com", "attribute");
        String value = CommonUtils.getAnnotationMemberValue(annotatable, qname);
        assertNotNull(value);
    }

}