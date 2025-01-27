package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestClassConfiguration {

    @Test
    public void testClassConfiguration() {
        public class ClassConfiguration extends CommonConfiguration {
            public String annotationName;

            public ClassConfiguration() {
            }

            public void setAnnotationName(String annotationName) {
                this.annotationName = annotationName;
            }

            public static ClassConfiguration getInstance() {
                return new ClassConfiguration();
            }
        }

        ClassConfiguration configuration = ClassConfiguration.getInstance();

        configuration.setAnnotationName("XmlElementWrapperPlugin");

        assertEquals("XmlElementWrapperPlugin", configuration.getAnnotationName());
    }

}