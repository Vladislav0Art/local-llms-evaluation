package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

public class GeneratedCreateEmptyListTest {

    @Test
    public void createEmptyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        List<Property<?>> properties = propertyListBuilder.create();

        Assert.assertNotNull(properties);
        Assert.assertTrue(properties.isEmpty());
    }

}