package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedAddNullPropertyTest {

    @Test
    public void addNullPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        propertyListBuilder.add(null);
    }

}