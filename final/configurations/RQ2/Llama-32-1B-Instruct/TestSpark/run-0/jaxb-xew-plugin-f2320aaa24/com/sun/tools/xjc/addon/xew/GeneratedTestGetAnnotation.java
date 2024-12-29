package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotation {

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

}