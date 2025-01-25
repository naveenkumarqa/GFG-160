/* 
✅ Today's Problem: Second Largest Element in an Array  
Given an array of positive integers arr[] of size n, the task is to find the second largest distinct element in the array.  

💡 Key Approach:
• Use two variables (`first` and `second`) to track the largest and second-largest elements in the array.  
• Traverse the array once:
   - If a new largest element is found, update `second` to `first` and `first` to the current element.
   - If the current element is smaller than `first` but greater than `second`, update `second`.  
• If no second largest element exists, return -1.  

⌛ Time Complexity: O(n) (Single traversal of the array)  
🌌 Space Complexity: O(1) (No extra space usage)  
*/


//code solution

import java.util.*;

class SecondLargest {
    static int secondLargest(int[] arr) {
        // Initialize first and second largest
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        // Traverse the array
        for (int num : arr) {
            // If the current element is larger than the first largest
            if (num > first) {
                second = first;
                first = num;
            } 
            // If the current element is between first and second largest
            else if (num > second && num < first) {
                second = num;
            }
        }

        // Return second if it exists, otherwise -1
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        // Example input array
        int[] arr = {12, 35, 1, 10, 34, 1};

        // Find and print the second largest element
        System.out.println("Second Largest Element: " + secondLargest(arr));
    }
}
