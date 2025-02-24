package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreateTest {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void createTest() {
        List<Property<?>> propertyList = propertyListBuilder.create();
        assert (propertyList instanceof ArrayList);
    }

}