package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;

import java.lang.reflect.AnnotatedElement;

import org.junit.Assert;
import org.junit.Test;
import graphql.schema.GraphQLDirective;
import graphql.annotations.annotationTypes.GraphQLDirective;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedBuildTest_whenNoDirectives {

    @Test
    public void buildTest_whenNoDirectives() {
        AnnotatedElement annotatedElement = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, container);
        GraphQLDirective[] result = directivesBuilder.build();
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

}