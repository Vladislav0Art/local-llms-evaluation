package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedBuildWithNullObjectTest {

    @Test
    public void buildWithNullObjectTest() {
        try {
            DirectivesBuilder directivesBuilder = new DirectivesBuilder(null, new ProcessingElementsContainer());
            fail("Should have thrown an exception because input object is null");
        } catch (NullPointerException e) {
            // Passed
        }
    }

    public class SampleClass {

        public String fieldWithoutDirectives;

        @GraphQLDirectives({
                @GraphQLDirective(name = "directive1", arguments = {@GraphQLArgument(name = "arg1", type = GraphQLScalarType.class)}),
                @GraphQLDirective(name = "directive2", arguments = {@GraphQLArgument(name = "arg2", type = GraphQLScalarType.class)})
        })
        public String fieldWithDirectives;
    }

}