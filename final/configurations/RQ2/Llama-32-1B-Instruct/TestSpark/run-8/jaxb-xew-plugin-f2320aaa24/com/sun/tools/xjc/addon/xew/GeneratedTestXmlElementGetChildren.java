package com.sun.tools.xjc.addon.xew;

public class GeneratedTestXmlElementGetChildren {

    @Test
    public void testXmlElementGetChildren() {
        CommonUtils.addAnnotation(XmlElement.class, "xew");
        CommonUtils.copyAnnotationMemberValue(XmlElement.class, "children", Element.class);

        JAnnotatable annot = new JAnnotatable();
        annot.addAnnotation(XmlElementWrapper.class);

        ElementWrapper wrapper = getTestElementWrapper();
        assertEquals(Element.class, wrapper.getChildren().get(0));
    }

}