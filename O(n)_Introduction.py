
a = [1, 3, 5, -3, 9, -6, 10, 11, 30, 16] # the given arrays
n = len(a) # Get the length of the list 

maximum = a[0] # maximum value is 30 

for i in range(1, n): # Iterate the 1 to 16
    if a[i] > maximum: # Check if the current element is greater than the current maximum
        maximum = a[i]  # If it is, update the maximum value

print("The Largest Element Number of this array is ", maximum) # Print the largest element found which is 30.