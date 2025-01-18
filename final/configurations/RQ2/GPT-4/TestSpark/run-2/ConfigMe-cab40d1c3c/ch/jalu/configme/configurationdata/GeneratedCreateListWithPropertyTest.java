package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedCreateListWithPropertyTest {

    @Test
    public void createListWithPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property = Mockito.mock(Property.class);
        propertyListBuilder.add(property);
        List<Property<?>> list = propertyListBuilder.create();
        Assert.assertEquals(1, list.size());
    }

}