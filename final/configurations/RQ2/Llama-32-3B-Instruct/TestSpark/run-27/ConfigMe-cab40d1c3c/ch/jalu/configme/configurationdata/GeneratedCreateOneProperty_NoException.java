package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedCreateOneProperty_NoException {

    @Test
    public void createOneProperty_NoException() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> expectedList = new ArrayList<>();
        expectedList.add(new Property<>("property", "value"));
        assertEquals(expectedList, builder.create());
    }

}