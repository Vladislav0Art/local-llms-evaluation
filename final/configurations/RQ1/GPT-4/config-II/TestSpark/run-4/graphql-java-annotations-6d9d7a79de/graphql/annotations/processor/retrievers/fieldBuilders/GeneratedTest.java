package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class GeneratedTest {

    @Test
    public void buildNoAnnotationsTest() {
        ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(Mockito.mock(Method.class), mockContainer);
        GraphQLDirective[] buildResult = builder.build();
        Assert.assertEquals(0, buildResult.length);
    }

    @Test
    public void buildAnnotationWithoutRegistrationTest() {
        Annotation mockAnnotation = Mockito.mock(Annotation.class);
        Method mockMethod = Mockito.mock(Method.class);

        Mockito.when(mockMethod.getAnnotations()).thenReturn(new Annotation[]{mockAnnotation});

        ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(mockMethod, mockContainer);
        builder.build();
    }

    @Test
    public void transformArgsArgumentsLessThanMethodsTest() {
        ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(Mockito.mock(Method.class), mockContainer);
        Annotation mockAnnotation = Mockito.mock(Annotation.class);
        Method[] mockMethods = new Method[]{Mockito.mock(Method.class)};

        Mockito.when(mockAnnotation.annotationType().getDeclaredMethods()).thenReturn(mockMethods);

        GraphQLDirective directive = GraphQLDirective.newDirective()
                .argument(GraphQLArgument.newArgument().name("arg1").type(Scalars.GraphQLString).build())
                .name("name")
                .build();

        GraphQLDirective result = builder.transformArgs(directive, mockAnnotation);

        Assert.assertEquals(result.getArguments().size(), mockMethods.length);
    }

    @Test
    public void transformArgsArgumentsMoreThanMethodsTest() {
        ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(Mockito.mock(Method.class), mockContainer);
        Annotation mockAnnotation = Mockito.mock(Annotation.class);

        GraphQLDirective directive = GraphQLDirective.newDirective()
                .argument(GraphQLArgument.newArgument().name("arg1").type(Scalars.GraphQLString).build())
                .name("name")
                .build();
        builder.transformArgs(directive, mockAnnotation);
    }

    @Test
    public void transformArgsArgumentAsScalarTypeTest() {
        ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);

        DirectivesBuilder builder = new DirectivesBuilder(Mockito.mock(Method.class), mockContainer);
        GraphQLDirective directive = GraphQLDirective.newDirective()
                .argument(GraphQLArgument.newArgument().name("arg1").type(Scalars.GraphQLString).build())
                .name("name")
                .build();

        GraphQLDirective result = builder.transformArgs(directive, new String[]{"test"});
        Assert.assertEquals(result.getArguments().size(), 1);
    }

    @Test
    public void transformArgsArgumentNotAsScalarTypeTest() {
        ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(Mockito.mock(Method.class), mockContainer);
        GraphQLDirective directive = GraphQLDirective.newDirective()
                .argument(GraphQLArgument.newArgument().name("arg1").type(new GraphQLObjectType("test", "test", new ArrayList<>())).build())
                .name("name")
                .build();
        builder.transformArgs(directive, new String[]{"test"});
    }

}