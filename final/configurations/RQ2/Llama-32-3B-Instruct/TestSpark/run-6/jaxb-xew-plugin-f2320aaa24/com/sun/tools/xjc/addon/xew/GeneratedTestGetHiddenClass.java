package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetHiddenClass {

    private String privateField;

    public String getPrivateField(String name) {
        return privateField;
    }

    public void setPrivateField(String name, String value) {
        this.privateField = value;
    }

    public Map<String, String> copyFields(Map<String, String> fields) throws Exception {
        return java.util.Collections.singletonMap("test", "testValue");
    }

    public Object getMemberValue(Object type) throws Exception {
        return null;
    }

    public boolean isHiddenClass() {
        throw new NullPointerException();
    }
}

public class GeneratedTest {

    @Test
    public void testGetHiddenClass() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        assertThrows(NullPointerException.class, () -> instance.isHiddenClass());
    }

}