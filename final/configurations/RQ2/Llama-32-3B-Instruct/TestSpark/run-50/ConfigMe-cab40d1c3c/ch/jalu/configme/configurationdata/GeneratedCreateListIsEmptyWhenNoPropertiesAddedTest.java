package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class GeneratedCreateListIsEmptyWhenNoPropertiesAddedTest {

    @Test
    public void createListIsEmptyWhenNoPropertiesAddedTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = builder.create();
        assertTrue(properties.isEmpty());
    }

}