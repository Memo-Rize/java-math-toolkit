# java-math-toolkit

A small Java library of math and statistics utilities. Demonstrates generics, custom exceptions, and JUnit testing.

## Features
- `Stats.mean`, `Stats.median`, `Stats.max`, `Stats.min` for numeric lists
- `Range<T>` generic range class for any `Comparable` type
- Custom exception for domain errors
- 8 unit tests

## Usage
```java
import mathtoolkit.Stats;
import mathtoolkit.Range;
import java.util.Arrays;

Stats.mean(Arrays.asList(1.0, 2.0, 3.0, 4.0));    // 2.5
Stats.median(Arrays.asList(1.0, 2.0, 3.0, 4.0));  // 2.5

Range<Integer> r = new Range<>(1, 10);
r.contains(5);   // true
r.contains(11);  // false