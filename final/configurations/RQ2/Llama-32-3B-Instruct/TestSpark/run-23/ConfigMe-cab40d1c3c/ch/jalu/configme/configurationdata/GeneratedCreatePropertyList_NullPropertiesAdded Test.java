package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedCreatePropertyList_NullPropertiesAdded Test {

    @Test
    public void createPropertyList_NullPropertiesAdded

    Test() throws ConfigMeException {
        List<Property<?>> properties = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        try {
            properties.add(builder.add(null));
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
        }

        assertEquals(0, properties.size());
    }

}