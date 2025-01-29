package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyFields {

    private static final String XML_ELEMENT_NAME = "element";

    @Test
    public void testCopyFields() {
        JClass classObject = getMock(JClass.class);
        CopyFields copyFields = new CopyFields();
        copyFields.copy(classObject);
        ClassOutline outline = getMock(ClassOutline.class);

        // Test copying fields of a single field or method
        JFieldVar fieldVar = classObject.getMember("field");
        assertEquals(0, outline.getFieldCount());
        assertEquals("field", XML_ELEMENT_NAME + ":" + fieldVar.getName());
        assertEquals("get", fieldVar.getAnnotation(XMLElementWrapperPlugin.class).getName());

        // Test copying fields of multiple fields or methods
        JMethod method = classObject.getMethod("method");
        JFieldVar fieldVar1 = classObject.getMember("field1");
        JFieldVar fieldVar2 = classObject.getMember("field2");
        assertEquals(0, outline.getFieldCount());
        assertEquals(XML_ELEMENT_NAME + ":" + fieldVar1.getName() + "|" + XML_ELEMENT_NAME + ":" + fieldVar2.getName(), outline.getFieldName());
    }

}