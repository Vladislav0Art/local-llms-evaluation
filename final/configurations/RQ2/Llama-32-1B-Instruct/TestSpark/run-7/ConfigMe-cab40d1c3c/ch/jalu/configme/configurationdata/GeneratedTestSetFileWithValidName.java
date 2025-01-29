package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTestSetFileWithValidName {

    @Test
    public void testSetFileWithValidName() {
        Property property = new Property();
        property.setName("test");
        property.setFile("/path/to/test.txt");

        Assert.assertEquals("/path/to/test.txt", property.getFile());
    }

}