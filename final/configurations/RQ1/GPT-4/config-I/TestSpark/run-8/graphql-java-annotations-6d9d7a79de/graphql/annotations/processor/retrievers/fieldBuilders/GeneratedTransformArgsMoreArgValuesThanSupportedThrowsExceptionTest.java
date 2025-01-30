package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.Directive;
import graphql.annotations.annotationTypes.directives.activation.DirectiveValue;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DefaultDefaultValue;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTransformArgsMoreArgValuesThanSupportedThrowsExceptionTest {

    @Mock
    private ProcessingElementsContainer container;
    @Mock
    private Directive directive;

    @Test
    public void transformArgsMoreArgValuesThanSupportedThrowsExceptionTest() {
        Map<String, DirectiveValue> directives = prepareDirectiveRegistry();
        GraphQLDirective directive = GraphQLDirective.newDirective().name("test").build();
        DirectivesBuilder builder = new DirectivesBuilder(DefaultDefaultValue.TestAnnotation.class, container);
        when(container.getDirectiveRegistry()).thenReturn(directives);
        try {
            builder.transformArgs(directive, new String[]{"1", "2"});
            Assert.fail("Exception expected");
        } catch (GraphQLAnnotationsException e) {
            Assert.assertEquals("Directive 'test' is supplied with more argument values than it supports", e.getMessage());
        }
    }

    @Directive(name = "test")
    @interface DirectiveUsage {
        String value();
    }

}