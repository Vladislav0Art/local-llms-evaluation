package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.annotationTypes.directives.definition.DirectiveLocations;
import graphql.annotations.annotationTypes.directives.definition.GraphQLDirectiveAnnotation;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.directives.DirectiveInfo;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.util.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedBuildNonExistingDirectiveAnnotationTest {

    @Test
    public void buildNonExistingDirectiveAnnotationTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Class object = ClassToTest.class;
        Map<String, DirectiveInfo> directiveRegistry = new HashMap<>();
        when(container.getDirectiveRegistry()).thenReturn(directiveRegistry);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        try {
            directivesBuilder.build();
            fail("Exception was expected");
        } catch (GraphQLAnnotationsException e) {
            assert e.getMessage().equals("No directive named directives is found in the directive registry");
        }
    }

}