package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLEnumType;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ProcessingElementsContainer container;

    // Test build method when there are no GraphQLDirectives annotations

    @Test
    public void buildNoDirectiveAnnotationsTest() throws Exception {
        Method method = DummyClass.class.getDeclaredMethod("methodWithNoDirectives");
        DirectivesBuilder builder = new DirectivesBuilder(method, container);
        GraphQLDirective[] result = builder.build();

        assertTrue(result.length == 0);
    }

    @Test
    public void buildWithDirectiveAnnotationsTest() throws Exception {
        Method method = DummyClass.class.getDeclaredMethod("methodWithDirectives");
        DirectivesBuilder builder = new DirectivesBuilder(method, container);
        GraphQLDirective[] result = builder.build();
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    @Test
    public void buildWithInvalidDirectiveTypeTest() throws Exception {
        Method method = DummyClass.class.getDeclaredMethod("methodWithInvalidDirectiveType");
        DirectivesBuilder builder = new DirectivesBuilder(method, container);
        builder.build();
    }


    // Dummy Class for tests
    private static class DummyClass {
        @GraphQLDirectives({})
        public void methodWithNoDirectives() {
        }

        @GraphQLDirectives({
                @Directive(name = "directive1"),
                @Directive(name = "directive2")
        })
        public void methodWithDirectives() {
        }

        @GraphQLDirectives({
                @Directive(name = "invalidDirective", type = InvalidType.class)
        })
        public void methodWithInvalidDirectiveType() {
        }
    }

}