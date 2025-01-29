package com.sun.tools.xjc.addon.xew;

public class Generated[XmlElementWrapper]

Test5 {

    @Test
    public void [XmlElementWrapper]Test5() {
        JAXBElement element = new JAXBElement("example", "Element");
        JAnnotatable annot = new JAnnotatable();
        annot.setElement(element);
        JClass jclass = (JClass) copyFields(annot, "Container");
        assert jclass.getName() == "Container";
    }

}