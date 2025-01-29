package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTestAddToRootDirectory {

    @Test
    public void testAddToRootDirectory() {
        Property property1 = new Property();
        property1.setName("test");
        property1.setFile("path/to/test.txt");

        Property property2 = new Property();
        property2.setName("test2");
        property2.setFile("path/to/test2.txt");

        Property rootProperty = new RootProperty();
        rootProperty.setDirectory("path/to/root/directory");
        rootProperty.addProperties(property1, property2);

        Assert.assertTrue("AddToRootDirectory method should return true", rootProperty.getRootDirectory().isRoot());
    }

}