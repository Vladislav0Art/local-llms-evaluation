package org.assertj.vavr.api;

import org.assertj.core.api.Assertions;
import org.assertj.vavr.api.SeqAssert;
import org.junit.Test;
import io.vavr.collection.List;
import io.vavr.collection.Seq;

public class GeneratedTest {

    @Test
    public void toAssertTest() {
        Seq<String> actual = List.of("a", "b", "c");
        SeqAssert<String> assertions = new SeqAssert<>(actual);
        ObjectAssert<String> elementAssert = assertions.toAssert("a", "description");
        Assertions.assertThat(elementAssert).isNotNull();
    }

    @Test
    public void newAbstractIterableAssertTest() {
        Seq<String> actual = List.of("a", "b", "c");
        SeqAssert<String> assertions = new SeqAssert<>(actual);
        SeqAssert<String> newAssertions = assertions.newAbstractIterableAssert(actual);
        Assertions.assertThat(newAssertions).isNotNull();
    }

}