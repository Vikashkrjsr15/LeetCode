class Solution {

    /**
     * @param Integer $n
     * @return Integer
     */
    function fib($n) {
        return $this->fibonacciIterative($n);
    }

    private function fibonacciIterative($n) {
        if ($n == 0) return 0;
        if ($n == 1) return 1;

        $prev = 0;
        $curr = 1;
        
        for ($i = 2; $i <= $n; $i++) {
            $temp = $curr;
            $curr = $prev + $curr;
            $prev = $temp;
        }
        
        return $curr;
    }
}
$solution = new Solution();
$n = 10;
echo "Fibonacci($n) = " . $solution->fib($n);
