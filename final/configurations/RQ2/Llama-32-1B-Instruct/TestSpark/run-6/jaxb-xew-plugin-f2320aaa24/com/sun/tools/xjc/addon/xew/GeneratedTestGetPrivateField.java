package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetPrivateField {

    @Test
    public void testGetPrivateField() {
        JClass clazz = CommonUtils.getJClass(XmlElementWrapper.class);
        Object privateField = null;
        assertNotNull(CommonUtils.getPrivateField(clazz, "privateField"));
    }

}