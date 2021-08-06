
public class class1
{
	 //gener4ic method printArray
    public static <Integer> void  printArray( Integer[] inputArray) {
        //Display array elements
        for(Integer element : inputArray) {
            System.out.println(element);
        }
    }
    
    public static void main(String args[]) {
        //create arrays of integer, Double and Character
        Integer[] intArray = {1,2,3,4,5};
        
        System.out.println("Array integerArray contains:");
        printArray(intArray);     //pass an Integer array
        
        }
}
