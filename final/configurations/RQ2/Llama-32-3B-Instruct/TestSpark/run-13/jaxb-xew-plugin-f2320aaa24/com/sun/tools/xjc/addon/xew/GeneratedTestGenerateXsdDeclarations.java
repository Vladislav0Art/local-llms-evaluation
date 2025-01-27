package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGenerateXsdDeclarations {

    @Test
    public void testGenerateXsdDeclarations() {
        Config config = new MockConfig();
        Container container = new MockContainer();
        ConfigAndContainer mockConfigAndContainer = ConfigAndContainer.create(config, container);
        XSDeclaration actualXsdDeclaration = XmlElementWrapperPlugin.getXsdDeclaration(mockConfigAndContainer.getConfig(), mockConfigAndContainer.getContainer());
        assertEquals(expectedXsdDeclaration, actualXsdDeclaration);
    }

    public static class MockConfig extends Config {
        @Override
        public String getConfig() {
            return "mock-config";
        }
    }

    public static class MockContainer extends Container {
        @Override
        public String getContainer() {
            return "mock-container";
        }
    }

    public static class ConfigAndContainer {
        public static ConfigAndContainer create(Config config, Container container) {
            return new ConfigAndContainer(config, container);
        }

        private final Config config;
        private final Container container;

        public ConfigAndContainer(Config config, Container container) {
            this.config = config;
            this.container = container;
        }
    }

    public static class XSDeclaration {
        // fields and methods
    }

    public static String expectedXsdDeclaration = "expected-xsd-declaration";

    public static class XmlElementWrapperPlugin {
        public static XSDeclaration getXsdDeclaration(Config config, Container container) {
            return new XSDeclaration();
        }
    }

}