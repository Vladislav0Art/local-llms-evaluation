package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedCreateEmptyList_ExpectedList {

    @Test
    public void createEmptyList_ExpectedList() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> expectedList = new ArrayList<>();
        assertEquals(expectedList, builder.create());
    }

}