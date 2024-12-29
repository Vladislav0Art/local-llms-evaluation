package com.sun.tools.xjc.addon.xew;

public class GeneratedTest {

    @Test
    public void testGetAnnotation() {
        // Test for get annotation method
        ElementWrapper element = new ElementWrapper();
        String attrValue = element.getAnnotation("example").toString();
        Assert.assertEquals("example", attrValue);

        // Test for add annotation method
        ElementWrapper element2 = new ElementWrapper();
        element2.addAnnotation("parametrization");
        Assert.assertTrue(element2.isParametrization());
    }

    @Test
    public void testGetAttr() {
        // Test for get attribute method
        ElementWrapper wrapper = new ElementWrapper();
        wrapper.attr = "example";
        Assert.assertEquals("example", wrapper.attr);

        // Test for add annotation method
        ElementWrapper wrapper2 = new ElementWrapper();
        wrapper2.addAnnotation("parametrization");
        Assert.assertTrue(wrapper2.isParametrization());
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String value) {
        this.attr = value;
    }

    @Test
    public void testAddAnnotation() {
        // Test for add annotation method
        ElementWrapper wrapper = new ElementWrapper();
        wrapper.addAnnotation("parametrization");
        Assert.assertTrue(wrapper.isParametrization());
    }

    public boolean isParametrization() {
        return parametrization;
    }
}

}