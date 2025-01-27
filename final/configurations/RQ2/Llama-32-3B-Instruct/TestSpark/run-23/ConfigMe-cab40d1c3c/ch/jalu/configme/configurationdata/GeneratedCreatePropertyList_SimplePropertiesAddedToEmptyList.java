package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedCreatePropertyList_SimplePropertiesAddedToEmptyList {

    @Test
    public void createPropertyList_SimplePropertiesAddedToEmptyList() {
        List<Property<?>> properties = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        for (int i = 0; i < 5; i++) {
            properties.add(builder.add(new Object()));
        }
        assertEquals(5, properties.size());
    }

}