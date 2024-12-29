package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreateEmptyListShouldReturnEmptyList {

    @Test
    public void createEmptyListShouldReturnEmptyList() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<MockProperty> list = (List<MockProperty>) builder.create();
        assertThat(list.isEmpty(), is(true));
    }

}