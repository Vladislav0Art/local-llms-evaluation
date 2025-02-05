package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLEnumType;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

public class GeneratedBuildValidMethodTest {

    @Test
    public void buildValidMethodTest() throws NoSuchMethodException {
        Method method = MockTestObject.class.getMethod("testMethod");
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(method, container);
        GraphQLDirective[] directives = directivesBuilder.build();

        assertNotNull(directives);
        assertEquals(0, directives.length);
    }

    public class MockTestObject {
        @GraphQLDirectives({"directive_1", "directive_2"})
        public void testMethod() {
            // Method for Testing
        }
    }

}