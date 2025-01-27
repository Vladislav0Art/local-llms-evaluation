package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedCreate_addMultiplePropertiesTest {

    @Test
    public void create_addMultiplePropertiesTest() {
        List<Property<?>> properties = Arrays.asList(new Property<>("test1"), new Property<>("test2"));
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(properties.get(0));
        builder.add(properties.get(1));
        List<Property<?>> result = builder.create();
        assertEquals(2, result.size());
    }

}