public class XYZ {
    public static int findProductIdWithHighestPrice(Product[] product) {
        double maxprice =Double.MIN_VALUE;
        System.out.println(maxprice);
        int maxPid = -1;

        for (Product products : product){
            if (products.price > maxprice ){
                maxprice = products.price;
                maxPid = products.pid;
            }
        }
        return maxPid;
    }
    public static double  calculateTotalAmountSpent(Product[] product) {
        double totalamount=0;
        for (Product products : product){
            totalamount = totalamount+products.price* products.quantity;

        }
        return totalamount;
    }
    
}
