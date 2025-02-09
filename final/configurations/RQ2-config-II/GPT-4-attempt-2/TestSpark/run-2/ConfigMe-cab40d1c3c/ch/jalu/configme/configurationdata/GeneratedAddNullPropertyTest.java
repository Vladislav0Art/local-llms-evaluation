package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAddNullPropertyTest {

    @Test
    public void addNullPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(null);
    }

}