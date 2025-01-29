package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTestAddDirectoryToRootDirectory {

    @Test
    public void testAddDirectoryToRootDirectory() {
        RootProperty rootProperty = new RootProperty();
        rootProperty.setDirectory("root/directory");
        rootProperty.addProperties(new TestProperty(), new TestProperty());

        Assert.assertTrue("AddDirectoryToRootDirectory method should return true", rootProperty.getRootDirectory().isRoot());
    }

}