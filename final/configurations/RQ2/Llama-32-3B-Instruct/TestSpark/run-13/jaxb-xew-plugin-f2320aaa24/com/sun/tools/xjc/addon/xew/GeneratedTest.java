package com.sun.tools.xjc.addon.xew;

public class GeneratedTest {

    public String getConfig() {
        return "mock-config";
    }
}

public class Container {
    public String getContainer() {
        return "mock-container";
    }
}

public class ConfigAndContainer {
    private final Config config;
    private final Container container;

    public ConfigAndContainer(Config config, Container container) {
        this.config = config;
        this.container = container;
    }

    public Config getConfig() {
        return config;
    }

    public Container getContainer() {
        return container;
    }
}

public class XSDeclarationGeneratorTest {

}