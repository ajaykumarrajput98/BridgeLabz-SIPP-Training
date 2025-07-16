package Sorting;

class IceCreamFlavour {
	 String name;
	 int sales;

	 public IceCreamFlavour(String name, int sales) {
	     this.name = name;
	     this.sales = sales;
	 }
	}

	public class sortedflavour {

	 public static void main(String[] args) {
	     IceCreamFlavour[] flavours = {
	         new IceCreamFlavour("Vanilla", 45),
	         new IceCreamFlavour("Chocolate", 30),
	         new IceCreamFlavour("Strawberry", 60),
	         new IceCreamFlavour("Mango", 25),
	         new IceCreamFlavour("Pistachio", 50),
	         new IceCreamFlavour("Blueberry", 35),
	         new IceCreamFlavour("Butterscotch", 40),
	         new IceCreamFlavour("Mint", 20)
	     };
	              bubbleSort(flavours);

	     System.out.println("Sorted flavours with sales =>");
	     for (IceCreamFlavour flavour : flavours) {
	         System.out.println(flavour.sales +" => "+ flavour.name);
	     }
	 }

	 public static void bubbleSort(IceCreamFlavour[] flavours) {
	     int n = flavours.length;
	     for (int i = 0; i < n - 1; i++) {
	         for (int j = 0; j < n - i - 1; j++) {
	             if (flavours[j].sales < flavours[j + 1].sales) {
	                  IceCreamFlavour temp = flavours[j];
	                flavours[j] = flavours[j + 1];
	                  flavours[j + 1] = temp;
	             }
	         }
	     }
	 }
	}
