class Solution {

    /**
     * @param Integer $x
     * @return Boolean
     */
    function isPalindrome($x) {
        $str=(string)$x;
        $reverse=strrev($str);
        return $str===$reverse;
    }
}