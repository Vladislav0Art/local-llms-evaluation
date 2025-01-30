package ch.jalu.configme.configurationdata;

import org.junit.Test;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class GeneratedAddWhenSubPropertyExistsTest {

    @Test
    public void addWhenSubPropertyExistsTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property prop1 = new StringProperty("Test.Property", "default");
        Property prop2 = new StringProperty("Test", "default2");
        propertyListBuilder.add(prop1);

        // Property which is a subset of another property path, should throw ConfigMeException
        propertyListBuilder.add(prop2);
    }

}