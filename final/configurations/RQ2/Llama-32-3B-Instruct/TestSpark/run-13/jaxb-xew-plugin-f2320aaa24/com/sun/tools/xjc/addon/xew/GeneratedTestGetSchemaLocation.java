package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetSchemaLocation {

    private Config config;
    private Container container;

    public static ConfigAndContainer create(Config config, Container container) {
        return new ConfigAndContainer(config, container);
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }
}

public class MockConfig {
    private String schemaLocation;

    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }
}

public class MockContainer {
    private Config config;

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }
}

public class MockConfigAndContainer {
    private Config config;
    private Container container;

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }
}

public class XSDeclaration {
    private String schemaLocation;

    public XSDeclaration(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }
}

public class XsdDeclarationGeneratorTest {

    @Before
    public void setup() {
        Config config = new MockConfig();
        Container container = new MockContainer();
        ConfigAndContainer mockConfigAndContainer = ConfigAndContainer.create(config, container);
        ConfigAndContainer actualConfigAndContainer = mockConfigAndContainer;
        XSDeclaration xsdDeclaration = new XSDeclaration("");
    }

    @Test
    public void testGetSchemaLocation() {
        String expectedSchemaLocation = "Custom XSD Declaration";
        XSDeclaration xsdDeclaration = new XSDeclaration(expectedSchemaLocation);
        String actualSchemaLocation = xsdDeclaration.getSchemaLocation();
        assertEquals(expectedSchemaLocation, actualSchemaLocation);
    }

}