package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GeneratedBuildWithMultipleDirectivesTest {

    @Test
    public void buildWithMultipleDirectivesTest() {
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        Method method = MyOtherDummyClass.class.getDeclaredMethods()[1];
        DirectivesBuilder builder = new DirectivesBuilder(method, container);
        GraphQLDirective[] result = builder.build();
        assertEquals(2, result.length);
    }

    private class MyDummyClass {
        public void dummyMethod() {
        }
    }

    private class MyOtherDummyClass {
        @GraphQLDirectives(values = {@GraphQLDirective(name = "directive1")})
        public void dummyMethod() {
        }

        @GraphQLDirectives(values = {@GraphQLDirective(name = "directive1"),
                @GraphQLDirective(name = "directive2")})
        public void anotherDummyMethod() {
        }
    }

}