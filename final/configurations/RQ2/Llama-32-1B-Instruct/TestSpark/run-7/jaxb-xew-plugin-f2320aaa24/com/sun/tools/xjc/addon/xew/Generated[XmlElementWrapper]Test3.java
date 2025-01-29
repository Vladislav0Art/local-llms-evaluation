package com.sun.tools.xjc.addon.xew;

public class Generated[XmlElementWrapper]

Test3 {

    @Test
    public void [XmlElementWrapper]Test3() {
        JClass container = new JDefinedClass("container", "Container");
        JFieldVar field = (JFieldVar) getPrivateField(container);
        assert ObjectUtils.isPrimitive(field.getType());
    }

}