package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.Builder;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.annotations.processor.ProcessingElementsContainer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;

import static graphql.Scalars.GraphQLString;

public class GeneratedBuildWithAnnotationTest {

    @Test
    public void buildWithAnnotationTest() throws NoSuchMethodException {
        Method method = MyClass.class.getMethod("annotatedMethod");

        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(method, container);
        GraphQLDirective[] directives = builder.build();

        Assert.assertNotNull(directives);
        Assert.assertEquals(1, directives.length);
    }

}