package mathtoolkit;

import java.util.List;

public class Stats {

    public static double mean(List<Double> values) throws MathToolkitException {
        if (values == null || values.isEmpty()) {
            throw new MathToolkitException("Cannot compute mean of empty list");
        }
        double sum = 0;
        for (double v : values) sum += v;
        return sum / values.size();
    }

    public static double median(List<Double> values) throws MathToolkitException {
        if (values == null || values.isEmpty()) {
            throw new MathToolkitException("Cannot compute median of empty list");
        }
        java.util.List<Double> sorted = new java.util.ArrayList<>(values);
        java.util.Collections.sort(sorted);
        int n = sorted.size();
        if (n % 2 == 1) {
            return sorted.get(n / 2);
        }
        return (sorted.get(n / 2 - 1) + sorted.get(n / 2)) / 2.0;
    }

    public static double max(List<Double> values) throws MathToolkitException {
        if (values == null || values.isEmpty()) {
            throw new MathToolkitException("Cannot compute max of empty list");
        }
        double best = values.get(0);
        for (double v : values) if (v > best) best = v;
        return best;
    }

    public static double min(List<Double> values) throws MathToolkitException {
        if (values == null || values.isEmpty()) {
            throw new MathToolkitException("Cannot compute min of empty list");
        }
        double best = values.get(0);
        for (double v : values) if (v < best) best = v;
        return best;
    }
}