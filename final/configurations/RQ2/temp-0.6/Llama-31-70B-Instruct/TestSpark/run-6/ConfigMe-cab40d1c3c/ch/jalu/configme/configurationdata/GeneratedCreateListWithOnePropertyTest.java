package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateListWithOnePropertyTest {

    @Test
    public void createListWithOnePropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = Mockito.mock(Property.class);
        propertyListBuilder.add(property);
        Assert.assertEquals(1, propertyListBuilder.create().size());
    }

}