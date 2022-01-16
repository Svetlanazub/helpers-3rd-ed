package com.epam.prd.jjop.helpers;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

import static java.util.Arrays.fill;
import static java.util.Arrays.setAll;

/**
 * Demonstrates fill and setAll static methods from {@link java.util.Arrays} helper class
 *
 * @author Jovhar Isayev
 */
class Arrays {
    /**
     * Wraps {@link java.util.Arrays#fill(Object[], Object)} for demonstration.<br/>
     * Picked this signature due to the use of the generics.<br/>
     * Other use cases of fill(array, value) method include:
     * <ul>
     *     <li>
     *          {@link java.util.Arrays#fill(byte[], byte)} - replaces elements of byte array with given byte type value
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(short[], short)} - replaces elements of short array with given short value
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(int[], int)} - replaces elements of int array with given int value
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(long[], long)} - replaces elements of long array with given long value
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(float[], float)} - replaces elements of float array with given float value
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(double[], double)} - replaces elements of double array with given double value
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(char[], char)} - replaces elements of char array with given char value
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(boolean[], boolean)} - replaces elements of boolean array with given boolean value
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(Object[], Object)} - replaces elements of object array with given object value
     *     </li>
     * </ul>
     *
     * @param arr   array which its elements will be replaced with value argument
     * @param value to replace elements of given array with
     */
    private static <T> void fillArrayWithGivenElement(T[] arr, T value) {
        fill(arr, value);

        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    /**
     * Wraps {@link java.util.Arrays#fill(Object[], int, int, Object)} for demonstration.<br/>
     * Picked this signature due to the use of the generics.<br/>
     * Other use cases of fill(array, fromIndex, toIndex, value) method include:
     * <ul>
     *     <li>
     *          {@link java.util.Arrays#fill(byte[], int, int, byte)} - replaces elements of byte array with given byte type value from specified start index to specified end index
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(short[], int, int, short)} - replaces elements of short array with given short value from specified start index to specified end index
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(int[], int, int, int)} - replaces elements of int array with given int value from specified start index to specified end index
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(long[], int, int, long)} - replaces elements of long array with given long value from specified start index to specified end index
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(float[], int, int, float)} - replaces elements of float array with given float value from specified start index to specified end index
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(double[], int, int, double)} - replaces elements of double array with given double value from specified start index to specified end index
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(char[], int, int, char)} - replaces elements of char array with given char value from specified start index to specified end index
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(boolean[], int, int, boolean)} - replaces elements of boolean array with given boolean value from specified start index to specified end index
     *     </li>
     *     <li>
     *         {@link java.util.Arrays#fill(Object[], int, int, Object)} - replaces elements of object array with given object value from specified start index to specified end index
     *     </li>
     * </ul>
     *  <p>
     *      Note: In case of <code><u>from == to<u/></code> array remains unchanged
     *  </p>
     *
     * @param arr   array which its elements will be replaced with value argument
     * @param from  inclusive index of the array to start replacing elements from
     * @param to    exclusive index of the array to stop the replacement at
     * @param value to replace elements of given array with
     * @throws IllegalArgumentException       if <code><u>fromIndex > toIndex<u/></code> is true
     * @throws ArrayIndexOutOfBoundsException if <code><u>fromIndex < 0 || toIndex < 0<u/></code> is true
     */
    private static <T> void fillArrayWithGivenElementFromStartIndexToEndIndex(T[] arr, int from, int to, T value) {
        fill(arr, from, to, value);

        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    /**
     * Wraps {@link java.util.Arrays#setAll(Object[], IntFunction)} for demonstration. <br/>
     * Picked this signature due to use of generics.<br/>
     * Other use cases of setAll(array,generatorFunction) method include:
     * <li>
     * {@link java.util.Arrays#setAll(int[], IntUnaryOperator)} - replaces elements of int array with int values returned by {@link IntUnaryOperator}
     * </li>
     * <li>
     * {@link java.util.Arrays#setAll(long[], IntToLongFunction)} - replaces elements of long array with long values returned by {@link IntToLongFunction}
     * </li>
     * <li>
     * {@link java.util.Arrays#setAll(double[], IntToDoubleFunction)} - replaces elements of double array with double values returned by {@link IntToDoubleFunction}
     * </li>
     *
     * @param arr            array which its elements will be assigned to value generated by valueGenerator of type IntFunction
     * @param valueGenerator generator of type IntFunction<T> to produce values to replace array elements with
     */
    private static <T> void setAllElementsOfArrayUsingGenerator(T[] arr, IntFunction<T> valueGenerator) {
        setAll(arr, valueGenerator);

        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // demonstration of fill method to replace all elements
        Integer[] intArr = new Integer[]{1, 2, 3, 4, 5};
        Boolean[] boolArr = new Boolean[]{true, true, true};

        fillArrayWithGivenElement(intArr, 100);
        fillArrayWithGivenElement(boolArr, false);

        // demonstration of fill method to replace elements from startIndex(inclusive) to endIndex(exclusive)
        Character[] charArr = new Character[]{'a', 'b', 'c', 'q', 'w', 'e'};
        fillArrayWithGivenElementFromStartIndexToEndIndex(charArr, 2, 4, 'h');

        // demonstration of linear setAll method
        String[] words_1 = new String[]{"hello", "darkness", "my", "old", "friend"};
        String[] words_2 = new String[]{"hello", "darkness", "my", "old", "friend"};
        String[] words_3 = new String[]{"hello", "darkness", "my", "old", "friend"};
        String[] words_4 = new String[]{"hello", "darkness", "my", "old", "friend"};

        // initialized anonymous class object to be used as generator argument for the setAll wrapper method
        IntFunction<String> generatorAsAnonymousClassObject = new IntFunction<>() {
            @Override
            public String apply(int value) {
                return value + "-anonymous-" + value;
            }
        };
        // lambda replacement for the one above
        IntFunction<String> generatorAsLambda = value -> value + "-lambda-" + value;
        IntFunction<String> generatorAsLambdaWithTypesOfParamsDefined = (int value) -> value + "-lambdaWithTypedParam-" + value;
        IntFunction<String> generatorAsLambdaWithComplexBody = value -> {
            // extra code might happen here
            return value + "-lambdaWithComplexBody-" + value;
        };

        setAllElementsOfArrayUsingGenerator(words_1, generatorAsAnonymousClassObject);
        setAllElementsOfArrayUsingGenerator(words_2, generatorAsLambda);
        setAllElementsOfArrayUsingGenerator(words_3, generatorAsLambdaWithComplexBody);
        setAllElementsOfArrayUsingGenerator(words_4, generatorAsLambdaWithTypesOfParamsDefined);
    }
}
