# Merge Sorted Array

[Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/description/)

## Solution

```C++
class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i = 0;
        int j = 0;
        vector<int> tmp;
        while(i < m || j < n) {
            if(i == m) {
                while(j < n) {
                    tmp.push_back(nums2[j]);
                    j++;
                }
            } else if (j == n) {
                while(i < m) {
                    tmp.push_back(nums1[i]);
                    i++;
                }
            } else {
                if(nums1[i] <= nums2[j]) {
                    tmp.push_back(nums1[i]);
                    i++;
                } else {
                    tmp.push_back(nums2[j]);
                    j++;
                }
            }
        }
        for(int i = 0; i < tmp.size(); i++) {
            nums1[i] = tmp[i];
        }
    }
};
```

## Notes

- Think scenarios where m = 0, n = 0.