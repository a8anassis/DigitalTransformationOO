package gr.aueb.dt.ch8.stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>(List.of(
           new Product("Apples", 12.5, 80),
                new Product("Oranges", 12.5, 100),
                new Product("Milk", 12.5, 100),
                new Product("Apples", 22.5, 120)
        ));

        var sortedProductsDescriptionsQE100 = products.stream()
                .filter(p -> p.getQuantity() >= 100)
                .sorted(Comparator.comparing(Product::getDescription))
                .map(Product::getDescription)
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(ArrayList::new));

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // filter the evens
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
//                .toList();                    // unmodifiable list
                .collect(Collectors.toList());  // modifiable


        List<Integer> squares = numbers.stream()
                .map(num -> num * num)
                .toList();
        squares.forEach(System.out::println);


        int totalSum = numbers.stream()
                .reduce(0, (sum, num) -> sum + num);



    }
}
