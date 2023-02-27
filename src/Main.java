public class Main {
    public static void main(String[] args) {
        long[] sales = new long[] {4,40,25,600,15};
        SalesManager salesManager = new SalesManager(sales);

         long max = salesManager.max();
        System.out.println(max);

    }
}