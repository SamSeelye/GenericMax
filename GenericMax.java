public class GenericMax {

	    public static <E extends Comparable<E>> E max(E[] list) {
	        E maxElement = list[0];

	        // Find Maximum of Array
	        for (int i = 1; i < list.length; i++) {
	            if (list[i].compareTo(maxElement) > 0) {
	                maxElement = list[i];
	            }
	        }

	        return maxElement;
	    }

	    public static void main(String[] args) {
	        String[] colors = {"Red", "Green", "Blue"};
	        Integer[] numbers = {1, 2, 3};
	        Double[] circleRadius = {3.0, 5.9, 2.9};

	        System.out.println("Colors: " + max(colors));
	        System.out.println("Numbers: " + max(numbers));
	        System.out.println("Circle Radius: " + max(circleRadius));
	    }
	}
