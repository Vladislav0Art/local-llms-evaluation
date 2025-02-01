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
public class GeneratedTest {

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

    @Test
    public void buildExistingDirectiveAnnotationTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Class object = ClassToTest.class;
        Map<String, DirectiveInfo> directiveRegistry = new HashMap<>();
        directiveRegistry.put("directives", new DirectiveInfo(false, new GraphQLDirective()));
        when(container.getDirectiveRegistry()).thenReturn(directiveRegistry);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        try {
            directivesBuilder.build();
        } catch (GraphQLAnnotationsException e) {
            fail("Exception was not expected");
        }
    }

    @Test
    public void buildTooMuchArgumentsTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Class object = ClassToTest.class;
        GraphQLDirective directive = GraphQLDirective.newDirective().name("dummy").argument(GraphQLArgument.newArgument().build()).build();
        Map<String, DirectiveInfo> directiveRegistry = new HashMap<>();
        directiveRegistry.put("directives", new DirectiveInfo(false, directive));
        when(container.getDirectiveRegistry()).thenReturn(directiveRegistry);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        try {
            directivesBuilder.build();
            fail("Exception was expected");
        } catch (GraphQLAnnotationsException e) {
            assert e.getMessage().equals("Directive 'dummy' is supplied with more argument values than it supports");
        }
    }

    @GraphQLDirectives(
            value = @GraphQLDirectiveAnnotation(value = @DirectiveLocations(""), name = "directives")
    )
    private static class ClassToTest {
    }

}