**CP DAILY DOSE** :smiling_imp:
### Coding  also like a muscle that needs a regular workout in order to keep it strong and fit :sunglasses::yellow_heart:
---
## Day - 1 :blue_book:

### Q1 MINIMUM SWAP TO SORT ARRAY : :pushpin::pushpin:
_In this problem we need to find minimum number of swaps required to sort the array.If the array is already sorted, return 0._

:point_right: [Problem Link](https://practice.geeksforgeeks.org/problems/minimum-swaps/1)


**My Approach**

- First Create the duplicate array and use **Arrays.sort()** to sort it

- Now compare all elements of old array with dupli array

- Create the function named search to find the actual index position by using **Arrays.binarySearch(dupArr,target)** it will return the actual index position

- Create another function named swap and swapped the element to its actual index call this function from inside if condition

- Atlast increase the counter and your work is done.

### Q2 MAXIMUM OF ALL CONTIGOUS SUBARRAYS OF SIZE K : :pushpin::pushpin:
-In this problem array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K

:point_right: [Problem Link](https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1/?problemType=functional&difficulty[]=1&page=1&sortBy=submissions&category[]=Arrays&query=problemTypefunctionaldifficulty[]1page1sortBysubmissionscategory[]Arrays)

**My Approach**

- Use **Arrays.copyOfRange(OriginalArray,Start index,last index)** function to copy the elemt to subArray

- Find the largest element in the subarray by using max function

#### It all started with Day-1  :fire::fire:

**CODE TO GROW**:trophy: 

