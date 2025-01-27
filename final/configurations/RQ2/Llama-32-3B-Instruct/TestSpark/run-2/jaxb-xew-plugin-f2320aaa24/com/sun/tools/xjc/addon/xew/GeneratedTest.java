package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

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

    @Test
    public void testXmlElementWrapperPlugin() {
        public class XmlElementWrapperPlugin extends AbstractConfigurablePlugin {
            private String annotationName;

            public XmlElementWrapperPlugin() {
            }

            public void setAnnotationName(String annotationName) {
                this.annotationName = annotationName;
            }

            public static XmlElementWrapperPlugin getInstance(ClassConfiguration configuration, AbstractConfigurablePlugin plugin) {
                return new XmlElementWrapperPlugin(configuration, plugin);
            }

            public Outline runInternal(Outline outline) {
                return new Outline();
            }
        }

        ClassConfiguration configuration = ClassConfiguration.getInstance();

        XmlElementWrapperPlugin xmlElementWrapperPlugin = XmlElementWrapperPlugin.getInstance(configuration, null);

        assertEquals("XmlElementWrapperPlugin", xmlElementWrapperPlugin.getAnnotationName());
    }
}

public class CommonConfiguration {
}

}