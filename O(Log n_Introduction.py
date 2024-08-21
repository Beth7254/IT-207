# 0(Log n)-Lograrithmic Time: FIND A SPECIFIC VALUE IN A SORTED ARRAY. [1, 3, 5, -3, 9, -6, 10, 11, 30, 16] 

def binary_search(arr, target):
    low = 0
    high = len(arr) - 1

    while low <= high:
        mid = (low + high) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            low = mid + 1
        else:
            high = mid - 1

    return -1  # not found

arr = [1, 3, 5, -3, 9, -6, 10, 11, 30, 16]
arr.sort()  # make sure the array is sorted

target = 10
result = binary_search(arr, target)

if result != -1:
    print(f"Found {target} at index {result}")
else:
    print(f"{target} not found in the array")