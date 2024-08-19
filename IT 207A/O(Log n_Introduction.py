# 0(Log n)-Lograrithmic Time: FIND A SPECIFIC VALUE IN A SORTED ARRAY. 
# [1, 3, 5, -3, 9, -6, 10, 11, 30, 16] 
#[-6, -3, 1, 3, 5, 9, 10, 11, 16, 30]

def binary_search(arr, target):
    # Initialize the lower bound of the search range
    low = 0
    # Initialize the upper bound of the search range
    high = len(arr) - 1

    # Continue searching until the lower bound is less than or equal to the upper bound
    while low <= high:
        # Calculate the midpoint of the search range
        mid = (low + high) // 2
        # Check if the target value is at the midpoint
        if arr[mid] == target:
            # Return the index of the target value if found
            return mid
        # If the target value is less than the midpoint value, search the left half
        elif arr[mid] < target:
            # Update the lower bound to mid + 1
            low = mid + 1
        # If the target value is greater than the midpoint value, search the right half
        else:
            # Update the upper bound to mid - 1
            high = mid - 1

    # Return -1 if the target value is not found
    return -1  # not found

# Example usage:
arr = [-6, -3, 1, 3, 5, 9, 10, 11, 16, 30]
target = 9

result = binary_search(arr, target)

if result != -1:
    # Print the index of the target value if found
    print(f"Found {target} at index {result}")
else:
    # Print a message if the target value is not found
    print(f"{target} not found in the array")