package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedCreatePropertyListHasElementsTest {

    @Test
    public void createPropertyListHasElementsTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> propertyMock = Mockito.mock(Property.class);

        propertyListBuilder.add(propertyMock);
        List<Property<?>> propertyList = propertyListBuilder.create();

        Assert.assertEquals(1, propertyList.size());
    }

}