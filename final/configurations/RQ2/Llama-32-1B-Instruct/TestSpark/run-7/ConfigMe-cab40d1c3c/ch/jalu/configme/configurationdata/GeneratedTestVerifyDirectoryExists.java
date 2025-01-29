package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTestVerifyDirectoryExists {

    @Test
    public void testVerifyDirectoryExists() {
        TestProperty property = new TestProperty();
        property.setName("test");
        property.setFile("/path/to/test.txt");

        Assert.assertTrue(property.getDirectory().exists(), true);
    }
}

class RootProperty extends Property {
    private final String directory;

    public RootProperty(String directory) {
        this.directory = directory;
    }

    @Override
    public boolean isRoot() {
        return true;
    }

    @Override
    public String getDirectory() {
        return directory;
    }

    @Override
    public void addProperties(Property... properties) {
        for (Property prop : properties) {
            addDirectory(prop.getDirectory());
        }
    }

    private void addDirectory(String directoryPath) {
        if (directoryPath.startsWith("/")) {
            directoryPath = "/" + directoryPath;
        }

        String[] parts = directoryPath.split("/");
        rootDirectory = new RootDirectory(parts);
        rootDirectory.addProperties(this);

        for (int i = 1; i < parts.length - 1; i++) {
            if (!propertyExists(directoryPath)) {
                addDirectory(directoryPath + "/" + parts[i]);
            }
        }

        if (parts[parts.length - 1].equals("root")) {
            rootProperty = this;
        } else {
            directoryPath += "/";
        }
    }

    private boolean propertyExists(String filePath) {
        return new File(filePath).exists();
    }

    @Override
    public String getFile() {
        return rootDirectory.getFilePath();
    }

    private class TestProperty extends Property {
        @Override
        public void addProperties(Property... properties) {
            for (Property prop : properties) {
                addDirectory(prop.getDirectory());
            }
        }
    }

}