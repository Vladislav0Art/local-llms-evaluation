package com.sun.tools.xjc.addon.xew;

public class GeneratedAddAnnotation_AddingNull_ThrowsNullPointerException {

    @Test
    public void addAnnotation_AddingNull_ThrowsNullPointerException() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        assertThrows(NullPointerException.class, () -> instance.addAnnotation(null));
    }
}

public class XmlElementWrapperPlugin {

    public String runInternal(String outline) throws Exception {
    }

    public Object getAnnotationMemberValue(Object attribute) {
        return null;
    }

    private void setPrivateField(String name, String value) {
    }

    private Object getPrivateField(String name) {
        return null;
    }

    public boolean isListedAsParametrisation(String wildcard) {
        return false;
    }

    public boolean isHiddenClass() {
        return true;
    }

    public Map<String, String> copyFields(Object outline) {
        return new HashMap<>();
    }

    public void addAnnotation(Object annotation) {
    }

}