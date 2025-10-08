/*public class CombineArrays {
  public static void main(String[] args) {
        int[] arr1 = {10,25,30,35};
        int[] arr2 = {20,31,38,35,40,50};

        int[] combined = new int[arr1.length + arr2.length];

        // Copy first array
        for (int i = 0; i < arr1.length; i++) {
            combined[i] = arr1[i];
        }

        // Copy second array
        for (int i = 0; i < arr2.length; i++) {
            combined[arr1.length + i] = arr2[i];
        }

        // Print combined array
        for (int num : combined) {
            System.out.print(num + " ");
        }
    */}
    
public class ClubAndSort {
    public static void main(String[] args) {
        int[] arr1 = {10,25,30,35};
        int[] arr2 = {20,31,38,35,};

        // Step 1: Combine both arrays
        int[] combined = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, combined, 0, arr1.length);
        System.arraycopy(arr2, 0, combined, arr1.length, arr2.length);

        // Step 2: Sort the combined array
        Arrays.sort(combined);

        // Step 3: Print result
        System.out.println("Combined & Sorted Array: " + Arrays.toString(combined));
    }
}

 

    

