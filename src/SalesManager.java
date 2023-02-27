public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = Integer.Max_VALUE;
        for (long sale : sales) {
            if (min > sales) {
                min = sale;
            }
        }
        return min;
    }

    public long average() {
        long sum = 0;
        for(long sale : sales) {
            sum += sale;
        }
        return (sum - (min() + max()))/ (sales.length - 2);
    }
}
